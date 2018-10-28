package com.petronas.lifesup.model;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class GoogleInsights {
    private long impressions;
    private long clicks;
    private long websiteVisits;
    private double costPerClick;
    private double clickThroughRate;
    private double advancedKpi1;

    @JsonProperty("impressions")
    public long getImpressions() { return impressions; }
    @JsonProperty("impressions")
    public void setImpressions(long value) { this.impressions = value; }

    @JsonProperty("clicks")
    public long getClicks() { return clicks; }
    @JsonProperty("clicks")
    public void setClicks(long value) { this.clicks = value; }

    @JsonProperty("website_visits")
    public long getWebsiteVisits() { return websiteVisits; }
    @JsonProperty("website_visits")
    public void setWebsiteVisits(long value) { this.websiteVisits = value; }

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
}
