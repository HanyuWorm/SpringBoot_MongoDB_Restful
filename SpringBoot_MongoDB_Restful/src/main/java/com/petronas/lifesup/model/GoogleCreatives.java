package com.petronas.lifesup.model;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class GoogleCreatives {
    private String header1;
    private String header2;
    private String description;
    private String url;
    private String image;

    @JsonProperty("header_1")
    public String getHeader1() { return header1; }
    @JsonProperty("header_1")
    public void setHeader1(String value) { this.header1 = value; }

    @JsonProperty("header_2")
    public String getHeader2() { return header2; }
    @JsonProperty("header_2")
    public void setHeader2(String value) { this.header2 = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("image")
    public String getImage() { return image; }
    @JsonProperty("image")
    public void setImage(String value) { this.image = value; }
}
