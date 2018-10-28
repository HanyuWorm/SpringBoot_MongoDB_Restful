package com.petronas.lifesup.controller;

import com.petronas.lifesup.entities.AdCampaign;
import com.petronas.lifesup.service.AdCampaignService;
import com.petronas.lifesup.service.ServiceResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/GET")
public class AdCampaignController {
    @Autowired
    private AdCampaignService adCampaignService;
    public static final Logger logger = LoggerFactory.getLogger(AdCampaignController.class);
    /* ---------------- GET ALL DATA ------------------------ */
    @GetMapping("/all")
    public ResponseEntity<?> findAllData() {
        logger.info("Start controller call get All Data  ");
        ServiceResult serviceResult = new ServiceResult();
        serviceResult.setMessage("Get All Data Success");
        try {
            List<AdCampaign> lstAdCampaigns = adCampaignService.findAll();
            serviceResult.setData(lstAdCampaigns);
            serviceResult.setStatus(ServiceResult.Status.SUCCESS);
        }catch (Exception ex){
            logger.error("Error get All Data");
            serviceResult.setMessage("Error");
            serviceResult.setStatus(ServiceResult.Status.FAILED);
        }

        logger.info("End controller call get All Data ");
        return new ResponseEntity<ServiceResult>(serviceResult,new HttpHeaders(), HttpStatus.OK);
    }
    /* ---------------- GET CAMPAIGN BY ID ------------------------ */
    @GetMapping("/id/{id}")
    public ResponseEntity<ServiceResult> findById(@PathVariable String id) {
        ServiceResult serviceResult = new ServiceResult();
        AdCampaign adCampaign = new AdCampaign();
        logger.info("Start controller call get data from ID - "+id);
        try {
            adCampaign = adCampaignService.findByIdCustom(id);
            serviceResult.setMessage("Get Data from ID"+id+" Success");
            serviceResult.setData(adCampaignService.findByIdCustom(id));
            serviceResult.setStatus(ServiceResult.Status.SUCCESS);
        }catch (Exception ex){
            logger.info("Error call get data from ID - "+id);
            serviceResult.setMessage(ex.getMessage());
        }
        logger.info("End call get data from ID - "+id);
        return new ResponseEntity<ServiceResult>(serviceResult, HttpStatus.OK);
    }
    /* ---------------- GET NAME CAMPAIGN ------------------------ */
    @GetMapping("/name/{name}")
    public ResponseEntity<ServiceResult> findByName(@PathVariable String name) {
        return new ResponseEntity<ServiceResult>(adCampaignService.findByName(name), HttpStatus.OK);
    }

}
