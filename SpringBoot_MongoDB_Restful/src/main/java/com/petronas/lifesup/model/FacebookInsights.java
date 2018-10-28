package com.petronas.lifesup.model;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class FacebookInsights {
    private long impressions;
    private long clicks;
    private double nanosScore;
    private double costPerClick;
    private double clickThroughRate;
    private double advancedKpi1;
    private double advancedKpi2;
    private Long websiteVisits;

    @JsonProperty("impressions")
    public long getImpressions() { return impressions; }
    @JsonProperty("impressions")
    public void setImpressions(long value) { this.impressions = value; }

    @JsonProperty("clicks")
    public long getClicks() { return clicks; }
    @JsonProperty("clicks")
    public void setClicks(long value) { this.clicks = value; }

    @JsonProperty("nanos_score")
    public double getNanosScore() { return nanosScore; }
    @JsonProperty("nanos_score")
    public void setNanosScore(double value) { this.nanosScore = value; }

    @JsonProperty("cost_per_click")
    public double getCostPerClick() { return costPerClick; }
    @JsonProperty("cost_per_click")
    public void setCostPerClick(double value) { this.costPerClick = value; }

    @JsonProperty("click_through_rate")
    public double getClickThroughRate() { return clickThroughRate; }
    @JsonProperty("click_through_rate")
    public void setClickThroughRate(double value) { this.clickThroughRate = value; }

    @JsonProperty("advanced_kpi_1")
    public double getAdvancedKpi1() { return advancedKpi1; }
    @JsonProperty("advanced_kpi_1")
    public void setAdvancedKpi1(double value) { this.advancedKpi1 = value; }

    @JsonProperty("advanced_kpi_2")
    public double getAdvancedKpi2() { return advancedKpi2; }
    @JsonProperty("advanced_kpi_2")
    public void setAdvancedKpi2(double value) { this.advancedKpi2 = value; }

    @JsonProperty("website_visits")
    public Long getWebsiteVisits() { return websiteVisits; }
    @JsonProperty("website_visits")
    public void setWebsiteVisits(Long value) { this.websiteVisits = value; }
}
