package com.adidas.product.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductLink {

    private String type;
    private String productId;
    private String name;
    private String url;
    private String image;
    private String altImage;
    @JsonProperty("pricing_information")
    private PricingInformation pricingInformation;
    @JsonProperty("badge_style")
    private String badgeStyle;
    @JsonProperty("badge_text")
    private String badgeText;
    @JsonProperty("search_color")
    private String searchColor;
    @JsonProperty("default_color")
    private String defaultColor;
    private String source;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAltImage() {
        return altImage;
    }

    public void setAltImage(String altImage) {
        this.altImage = altImage;
    }

    public PricingInformation getPricingInformation() {
        return pricingInformation;
    }

    public void setPricingInformation(PricingInformation pricingInformation) {
        this.pricingInformation = pricingInformation;
    }

    public String getBadgeStyle() {
        return badgeStyle;
    }

    public void setBadgeStyle(String badgeStyle) {
        this.badgeStyle = badgeStyle;
    }

    public String getBadgeText() {
        return badgeText;
    }

    public void setBadgeText(String badgeText) {
        this.badgeText = badgeText;
    }

    public String getSearchColor() {
        return searchColor;
    }

    public void setSearchColor(String searchColor) {
        this.searchColor = searchColor;
    }

    public String getDefaultColor() {
        return defaultColor;
    }

    public void setDefaultColor(String defaultColor) {
        this.defaultColor = defaultColor;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
