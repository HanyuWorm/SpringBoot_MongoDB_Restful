package com.petronas.lifesup.model;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class Google {
    private String status;
    private long totalBudget;
    private long remainingBudget;
    private long startDate;
    private long endDate;
    private TargetAudiance targetAudiance;
    private GoogleCreatives creatives;
    private GoogleInsights insights;

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("total_budget")
    public long getTotalBudget() { return totalBudget; }
    @JsonProperty("total_budget")
    public void setTotalBudget(long value) { this.totalBudget = value; }

    @JsonProperty("remaining_budget")
    public long getRemainingBudget() { return remainingBudget; }
    @JsonProperty("remaining_budget")
    public void setRemainingBudget(long value) { this.remainingBudget = value; }

    @JsonProperty("start_date")
    public long getStartDate() { return startDate; }
    @JsonProperty("start_date")
    public void setStartDate(long value) { this.startDate = value; }

    @JsonProperty("end_date")
    public long getEndDate() { return endDate; }
    @JsonProperty("end_date")
    public void setEndDate(long value) { this.endDate = value; }

    @JsonProperty("target_audiance")
    public TargetAudiance getTargetAudiance() { return targetAudiance; }
    @JsonProperty("target_audiance")
    public void setTargetAudiance(TargetAudiance value) { this.targetAudiance = value; }

    @JsonProperty("creatives")
    public GoogleCreatives getCreatives() { return creatives; }
    @JsonProperty("creatives")
    public void setCreatives(GoogleCreatives value) { this.creatives = value; }

    @JsonProperty("insights")
    public GoogleInsights getInsights() { return insights; }
    @JsonProperty("insights")
    public void setInsights(GoogleInsights value) { this.insights = value; }
}
