package com.petronas.lifesup.model;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class TargetAudiance {
    private String[] languages;
    private String[] genders;
    private long[] ageRange;
    private String[] locations;
    private String[] interests;
    private String[] keyWords;

    @JsonProperty("languages")
    public String[] getLanguages() { return languages; }
    @JsonProperty("languages")
    public void setLanguages(String[] value) { this.languages = value; }

    @JsonProperty("genders")
    public String[] getGenders() { return genders; }
    @JsonProperty("genders")
    public void setGenders(String[] value) { this.genders = value; }

    @JsonProperty("age_range")
    public long[] getAgeRange() { return ageRange; }
    @JsonProperty("age_range")
    public void setAgeRange(long[] value) { this.ageRange = value; }

    @JsonProperty("locations")
    public String[] getLocations() { return locations; }
    @JsonProperty("locations")
    public void setLocations(String[] value) { this.locations = value; }

    @JsonProperty("interests")
    public String[] getInterests() { return interests; }
    @JsonProperty("interests")
    public void setInterests(String[] value) { this.interests = value; }

    @JsonProperty("KeyWords")
    public String[] getKeyWords() { return keyWords; }
    @JsonProperty("KeyWords")
    public void setKeyWords(String[] value) { this.keyWords = value; }
}
