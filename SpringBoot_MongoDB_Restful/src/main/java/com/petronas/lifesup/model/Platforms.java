package com.petronas.lifesup.model;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class Platforms {
    private Facebook facebook;
    private Facebook instagram;
    private Google google;

    @JsonProperty("facebook")
    public Facebook getFacebook() { return facebook; }
    @JsonProperty("facebook")
    public void setFacebook(Facebook value) { this.facebook = value; }

    @JsonProperty("instagram")
    public Facebook getInstagram() { return instagram; }
    @JsonProperty("instagram")
    public void setInstagram(Facebook value) { this.instagram = value; }

    @JsonProperty("google")
    public Google getGoogle() { return google; }
    @JsonProperty("google")
    public void setGoogle(Google value) { this.google = value; }
}
