package com.petronas.lifesup.repository;

import com.petronas.lifesup.entities.AdCampaign;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AdCampaignRepository extends MongoRepository<AdCampaign,Long> {

    @Query("{ 'id' : ?0 }")
    List<AdCampaign> findByIdCampaign(String id);
    //AdCampaign findFirstBy(Long id);

    // get data for search by name using anotation
    @Query("{ 'name' : ?0 }")
    AdCampaign findFirstByName(String name);

    // may be using custom query to select data like this :
    //Query query = new Query();
    //query.fields().include("path");
    // filter data response some filed
//    @Query(value="{ 'idcampaign' : ?0}",fields="{ 'idcampaign' : 1, 'name' : 1,'goal' : 1,'total_budget' : 1,'status' : 1}")
    // nhầm đề
    @Query(value="{ 'idcampaign' : ?0}")
    AdCampaign findFirstByIDAndName(Long id);

}
