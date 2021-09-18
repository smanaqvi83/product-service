package com.adidas.product.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDescription {

    private String title;
    private String text;
    private String subtitle;
    private List<String> usps = null;
    @JsonProperty("wash_care_instructions")
    private WashCareInstructions washCareInstructions;
    @JsonProperty("description_assets")
    private DescriptionAssets descriptionAssets;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public List<String> getUsps() {
        return usps;
    }

    public void setUsps(List<String> usps) {
        this.usps = usps;
    }

    public WashCareInstructions getWashCareInstructions() {
        return washCareInstructions;
    }

    public void setWashCareInstructions(WashCareInstructions washCareInstructions) {
        this.washCareInstructions = washCareInstructions;
    }

    public DescriptionAssets getDescriptionAssets() {
        return descriptionAssets;
    }

    public void setDescriptionAssets(DescriptionAssets descriptionAssets) {
        this.descriptionAssets = descriptionAssets;
    }
}
