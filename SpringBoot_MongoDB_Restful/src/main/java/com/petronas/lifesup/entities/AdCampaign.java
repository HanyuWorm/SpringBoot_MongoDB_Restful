package com.petronas.lifesup.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.petronas.lifesup.model.Platforms;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "test4")
public class AdCampaign {
    @Id
    ObjectId databaseId;
    private long idcampaign;
    private String name;
    private String goal;
    private long totalBudget;
    private String status;
    private Platforms platforms;

    @JsonProperty("idcampaign")
    public long getIdcampaign() { return idcampaign; }
    @JsonProperty("idcampaign")
    public void setIdcampaign(long value) { this.idcampaign = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("goal")
    public String getGoal() { return goal; }
    @JsonProperty("goal")
    public void setGoal(String value) { this.goal = value; }

    @JsonProperty("total_budget")
    public long getTotalBudget() { return totalBudget; }
    @JsonProperty("total_budget")
    public void setTotalBudget(long value) { this.totalBudget = value; }

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("platforms")
    public Platforms getPlatforms() { return platforms; }
    @JsonProperty("platforms")
    public void setPlatforms(Platforms value) { this.platforms = value; }
}
