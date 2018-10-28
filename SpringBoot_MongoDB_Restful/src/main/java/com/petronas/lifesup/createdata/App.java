package com.petronas.lifesup.createdata;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.petronas.lifesup.Util.Constant;
import com.petronas.lifesup.model.AdCampaign;
import com.petronas.lifesup.model.Converter;
import  com.petronas.lifesup.Util.Constant;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        /**
         * mongodb-driver has multiple dependencies (bson and mongodb-driver-core)
         * so you need more than just the mongodb-driver.jar for it to work.
         * You can use the uber jar mongodb-java-driver that contains all the required dependencies.
         */
        //=========================================================================================//
        //        MongoClient mongoClient = new MongoClient("localhost", 27017);
        //        System.out.println("---------- list databases --------------------");
        //        for (String t : mongoClient.listDatabaseNames()) {
        //            System.out.println(t);
        //        }
        //        MongoDatabase database = mongoClient.getDatabase("adcampaign");
        //        MongoCollection<Document> collection = database.getCollection("campaign");
        //=========================================================================================//
        //
        //TODO
        // Hiện tại có bug target_audiance

        Mongo mongo = new Mongo("localhost", 27017);
        DB db = mongo.getDB("adcampaign");
        DBCollection collection = db.getCollection("test4");

        try {
            AdCampaign[] data = Converter.fromJsonString(Constant.json);
            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i].getPlatforms().getFacebook().getStatus());
                // data for large object
                BasicDBObject document = new BasicDBObject();

                document.put("idcampaign", data[i].getIdcampaign());
                document.put("name", data[i].getName());
                document.put("goal", data[i].getGoal());
                document.put("total_budget", data[i].getTotalBudget());
                document.put("status", data[i].getStatus());
                document.put("goal", data[i].getGoal());
                // data for platform
                BasicDBObject documentPlatform = new BasicDBObject();

                BasicDBObject documentFaceBook = new BasicDBObject();
                BasicDBObject documentInstagram = new BasicDBObject();
                BasicDBObject documentGoogle = new BasicDBObject();
                BasicDBObject documentTargetAudiance = new BasicDBObject();
                BasicDBObject documentCreatives = new BasicDBObject();
                BasicDBObject documentInsights = new BasicDBObject();

                // add data for document facebook
                //check null facebook
                /*if (null!=data[i].getPlatforms().getFacebook()){

                }*/
                documentPlatform.put("facebook", documentFaceBook);
                documentFaceBook.put("status", data[i].getPlatforms().getFacebook().getStatus());
                documentFaceBook.put("total_budget", data[i].getPlatforms().getFacebook().getTotalBudget());
                documentFaceBook.put("remaining_budget", data[i].getPlatforms().getFacebook().getRemainingBudget());
                documentFaceBook.put("start_date", data[i].getPlatforms().getFacebook().getStartDate());
                documentFaceBook.put("end_date", data[i].getPlatforms().getFacebook().getEndDate());

                //documentTargetAudiance
                documentTargetAudiance.put("languages", "FR");
                documentTargetAudiance.put("genders", "M");
                documentTargetAudiance.put("age_range", "20");
                documentTargetAudiance.put("locations", "France");
                documentTargetAudiance.put("interests", "Docker");
                documentFaceBook.put("target_audiance", documentTargetAudiance);
                //documentCreatives
                documentCreatives.put("header", data[i].getPlatforms().getFacebook().getCreatives().getHeader());
                documentCreatives.put("description", data[i].getPlatforms().getFacebook().getCreatives().getDescription());
                documentCreatives.put("url", data[i].getPlatforms().getFacebook().getCreatives().getURL());
                documentCreatives.put("image", data[i].getPlatforms().getFacebook().getCreatives().getImage());
                documentFaceBook.put("creatives", documentCreatives);
                //documentInsights
                documentInsights.put("impressions", data[i].getPlatforms().getFacebook().getInsights().getImpressions());
                documentInsights.put("clicks", data[i].getPlatforms().getFacebook().getInsights().getClicks());
                documentInsights.put("nanos_score", data[i].getPlatforms().getFacebook().getInsights().getNanosScore());
                documentInsights.put("cost_per_click", data[i].getPlatforms().getFacebook().getInsights().getCostPerClick());
                documentInsights.put("click_through_rate", data[i].getPlatforms().getFacebook().getInsights().getClickThroughRate());
                documentInsights.put("advanced_kpi_1", data[i].getPlatforms().getFacebook().getInsights().getAdvancedKpi1());
                documentInsights.put("advanced_kpi_2", data[i].getPlatforms().getFacebook().getInsights().getAdvancedKpi2());
                documentFaceBook.put("insights", documentInsights);


                // add data for document instagram
                documentPlatform.put("instagram", documentInstagram);
                documentInstagram.put("status", data[i].getPlatforms().getInstagram().getStatus());
                documentInstagram.put("total_budget", data[i].getPlatforms().getInstagram().getTotalBudget());
                documentInstagram.put("remaining_budget", data[i].getPlatforms().getInstagram().getRemainingBudget());
                documentInstagram.put("start_date", data[i].getPlatforms().getInstagram().getStartDate());
                documentInstagram.put("end_date", data[i].getPlatforms().getInstagram().getEndDate());

                //documentTargetAudiance
                //
                documentTargetAudiance.put("languages", "FR");
                documentTargetAudiance.put("genders", "M");
                documentTargetAudiance.put("age_range", "20");
                documentTargetAudiance.put("locations", "France");
                documentTargetAudiance.put("interests", "Docker");
                documentInstagram.put("target_audiance", documentTargetAudiance);
                //documentCreatives
                documentCreatives.put("header", data[i].getPlatforms().getInstagram().getCreatives().getHeader());
                documentCreatives.put("description", data[i].getPlatforms().getInstagram().getCreatives().getDescription());
                documentCreatives.put("url", data[i].getPlatforms().getInstagram().getCreatives().getURL());
                documentCreatives.put("image", data[i].getPlatforms().getInstagram().getCreatives().getImage());
                documentInstagram.put("creatives", documentCreatives);
                //documentInsights
                documentInsights.put("impressions", data[i].getPlatforms().getInstagram().getInsights().getImpressions());
                documentInsights.put("clicks", data[i].getPlatforms().getInstagram().getInsights().getClicks());
                documentInsights.put("nanos_score", data[i].getPlatforms().getInstagram().getInsights().getNanosScore());
                documentInsights.put("cost_per_click", data[i].getPlatforms().getInstagram().getInsights().getCostPerClick());
                documentInsights.put("click_through_rate", data[i].getPlatforms().getInstagram().getInsights().getClickThroughRate());
                documentInsights.put("advanced_kpi_1", data[i].getPlatforms().getInstagram().getInsights().getAdvancedKpi1());
                documentInsights.put("advanced_kpi_2", data[i].getPlatforms().getInstagram().getInsights().getAdvancedKpi2());
                documentInstagram.put("insights", documentInsights);

                // add data for document instagram
                // check gg null
                if (null!=data[i].getPlatforms().getGoogle()){
                    documentPlatform.put("google", documentGoogle);
                    documentGoogle.put("status", data[i].getPlatforms().getGoogle().getStatus());
                    documentGoogle.put("total_budget", data[i].getPlatforms().getGoogle().getTotalBudget());
                    documentGoogle.put("remaining_budget", data[i].getPlatforms().getGoogle().getRemainingBudget());
                    documentGoogle.put("start_date", data[i].getPlatforms().getGoogle().getStartDate());
                    documentGoogle.put("end_date", data[i].getPlatforms().getGoogle().getEndDate());

                    //documentTargetAudiance
//                  documentTargetAudiance.put("languages", data[i].getPlatforms().getGoogle().getTargetAudiance().getLanguages());
                    documentTargetAudiance.put("languages", "FR");
                    documentTargetAudiance.put("genders", "M");
                    documentTargetAudiance.put("age_range", "20");
                    documentTargetAudiance.put("locations", "France");
                    documentTargetAudiance.put("interests", "Docker");
                    documentGoogle.put("target_audiance", documentTargetAudiance);
                    //documentCreatives
                    documentCreatives.put("header_1", data[i].getPlatforms().getGoogle().getCreatives().getHeader1());
                    documentCreatives.put("header_2", data[i].getPlatforms().getGoogle().getCreatives().getHeader2());
                    documentCreatives.put("description", data[i].getPlatforms().getGoogle().getCreatives().getDescription());
                    documentCreatives.put("url", data[i].getPlatforms().getGoogle().getCreatives().getURL());
                    documentCreatives.put("image", data[i].getPlatforms().getGoogle().getCreatives().getImage());
                    documentGoogle.put("creatives", documentCreatives);
                    //documentInsights
                    documentInsights.put("impressions", data[i].getPlatforms().getGoogle().getInsights().getImpressions());
                    documentInsights.put("clicks", data[i].getPlatforms().getGoogle().getInsights().getClicks());
                    documentInsights.put("website_visits", data[i].getPlatforms().getGoogle().getInsights().getWebsiteVisits());
                    documentInsights.put("cost_per_click", data[i].getPlatforms().getGoogle().getInsights().getCostPerClick());
                    documentInsights.put("click_through_rate", data[i].getPlatforms().getGoogle().getInsights().getClickThroughRate());
                    documentInsights.put("advanced_kpi_1", data[i].getPlatforms().getGoogle().getInsights().getAdvancedKpi1());
                    documentGoogle.put("insights", documentInsights);
                }

                //put platfomrms to document large
                document.put("platforms", documentPlatform);

                //document Large
                collection.insert(document);
                System.out.println("Inserted!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        mongo.close();

    }
}
