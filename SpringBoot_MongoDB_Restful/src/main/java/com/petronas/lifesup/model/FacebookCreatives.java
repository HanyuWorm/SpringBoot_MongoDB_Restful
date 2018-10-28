package com.petronas.lifesup.model;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class FacebookCreatives {
    private String header;
    private String description;
    private String url;
    private String image;

    @JsonProperty("header")
    public String getHeader() { return header; }
    @JsonProperty("header")
    public void setHeader(String value) { this.header = value; }

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
