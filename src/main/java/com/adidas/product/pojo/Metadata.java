package com.adidas.product.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Metadata {

    @JsonProperty("asset_usage")
    private List<String> assetUsage = null;
    private String imageStyle;
    private String view;
    private String usageTerms;
    private String sortOrder;
    private List<Object> subjects = null;

    public List<String> getAssetUsage() {
        return assetUsage;
    }

    public void setAssetUsage(List<String> assetUsage) {
        this.assetUsage = assetUsage;
    }

    public String getImageStyle() {
        return imageStyle;
    }

    public void setImageStyle(String imageStyle) {
        this.imageStyle = imageStyle;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getUsageTerms() {
        return usageTerms;
    }

    public void setUsageTerms(String usageTerms) {
        this.usageTerms = usageTerms;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public List<Object> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Object> subjects) {
        this.subjects = subjects;
    }
}
