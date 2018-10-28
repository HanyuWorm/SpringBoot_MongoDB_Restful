package com.petronas.lifesup.service;

import ch.qos.logback.core.status.Status;
import com.petronas.lifesup.entities.AdCampaign;
import com.petronas.lifesup.repository.AdCampaignRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdCampaignService {
    @Autowired
    AdCampaignRepository adCampaignRepository;
    //logger
    public static final Logger logger = LoggerFactory.getLogger(AdCampaignService.class);
    // get All Data
    public List<AdCampaign> findAll() {
        ServiceResult result = new ServiceResult();
        List<AdCampaign> lstAdCampaigns = new ArrayList<>();
        logger.info("Start service call all data");
        try {
            List<AdCampaign> lstAdCampaignsReturn = adCampaignRepository.findAll();
            for (int i = 0; i <lstAdCampaignsReturn.size() ; i++) {
                AdCampaign adCampaign = new AdCampaign();
                adCampaign.setIdcampaign(lstAdCampaignsReturn.get(i).getIdcampaign());
                adCampaign.setGoal(lstAdCampaignsReturn.get(i).getGoal());
                adCampaign.setName(lstAdCampaignsReturn.get(i).getName());
                adCampaign.setTotalBudget(lstAdCampaignsReturn.get(i).getTotalBudget());
                adCampaign.setStatus(lstAdCampaignsReturn.get(i).getStatus());
                lstAdCampaigns.add(adCampaign);
            }
        }catch (Exception ex){
            //data get error
            ex.printStackTrace();
            logger.error("error service get All Data "+ex.getMessage());
        }
        logger.info("End service call all data");
        return lstAdCampaigns;
    }
    //get data by Name
    public ServiceResult findByName(String name) {
        ServiceResult result = new ServiceResult();
        logger.info("Start service call data findByName");
        try {
            result.setMessage("get data success");
            result.setData(adCampaignRepository.findFirstByName(name));

            result.setStatus(ServiceResult.Status.SUCCESS);
        }catch (Exception ex){
            ex.printStackTrace();
            logger.error("error service findByName"+ex.getMessage());
        }
        logger.info("end service call data findByName");
        return result;
    }
    public AdCampaign findByIdCustom(String id) {
        AdCampaign adCampaign = new AdCampaign();
        logger.info("Start service call data findByIdCustom");
        try {
            adCampaign = adCampaignRepository.findFirstByIDAndName(Long.valueOf(id));
        }catch (Exception ex){
            ex.printStackTrace();
            logger.error("error findByIdCustom"+ex.getMessage());
        }
        logger.info("End service call data findByIdCustom");
        return adCampaign;
    }
}
