package com.adidas.product.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttributeList {

    private Boolean sale;
    private String brand;
    private String color;
    private String gender;
    private Boolean outlet;
    private List<String> sport = null;
    private List<String> closure = null;
    private List<String> surface = null;
    private String category;
    private List<String> sportSub = null;
    @JsonProperty("size_fit_bar")
    private SizeFitBar sizeFitBar;
    private List<String> collection = null;
    @JsonProperty("search_color")
    private String searchColor;
    @JsonProperty("base_material")
    private List<String> baseMaterial = null;
    private List<String> productType = null;
    private Boolean personalizable;
    private Boolean isCnCRestricted;
    @JsonProperty("mandatory_personalization")
    private Boolean mandatoryPersonalization;
    private Boolean customizable;
    @JsonProperty("badge_style")
    private String badgeStyle;
    @JsonProperty("badge_text")
    private String badgeText;
    @JsonProperty("search_color_raw")
    private String searchColorRaw;
    @JsonProperty("is_orderable")
    private Boolean isOrderable;
    private Boolean isWaitingRoomProduct;
    private Boolean isInPreview;
    private Boolean specialLaunch;
    @JsonProperty("special_launch_type")
    private String specialLaunchType;
    private SizeTypes sizeTypes;
    @JsonProperty("is_flash")
    private Boolean isFlash;
    @JsonProperty("size_chart_link")
    private String sizeChartLink;

    public Boolean getSale() {
        return sale;
    }

    public void setSale(Boolean sale) {
        this.sale = sale;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getOutlet() {
        return outlet;
    }

    public void setOutlet(Boolean outlet) {
        this.outlet = outlet;
    }

    public List<String> getSport() {
        return sport;
    }

    public void setSport(List<String> sport) {
        this.sport = sport;
    }

    public List<String> getClosure() {
        return closure;
    }

    public void setClosure(List<String> closure) {
        this.closure = closure;
    }

    public List<String> getSurface() {
        return surface;
    }

    public void setSurface(List<String> surface) {
        this.surface = surface;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getSportSub() {
        return sportSub;
    }

    public void setSportSub(List<String> sportSub) {
        this.sportSub = sportSub;
    }

    public SizeFitBar getSizeFitBar() {
        return sizeFitBar;
    }

    public void setSizeFitBar(SizeFitBar sizeFitBar) {
        this.sizeFitBar = sizeFitBar;
    }

    public List<String> getCollection() {
        return collection;
    }

    public void setCollection(List<String> collection) {
        this.collection = collection;
    }

    public String getSearchColor() {
        return searchColor;
    }

    public void setSearchColor(String searchColor) {
        this.searchColor = searchColor;
    }

    public List<String> getBaseMaterial() {
        return baseMaterial;
    }

    public void setBaseMaterial(List<String> baseMaterial) {
        this.baseMaterial = baseMaterial;
    }

    public List<String> getProductType() {
        return productType;
    }

    public void setProductType(List<String> productType) {
        this.productType = productType;
    }

    public Boolean getPersonalizable() {
        return personalizable;
    }

    public void setPersonalizable(Boolean personalizable) {
        this.personalizable = personalizable;
    }

    public Boolean getCnCRestricted() {
        return isCnCRestricted;
    }

    public void setCnCRestricted(Boolean cnCRestricted) {
        isCnCRestricted = cnCRestricted;
    }

    public Boolean getMandatoryPersonalization() {
        return mandatoryPersonalization;
    }

    public void setMandatoryPersonalization(Boolean mandatoryPersonalization) {
        this.mandatoryPersonalization = mandatoryPersonalization;
    }

    public Boolean getCustomizable() {
        return customizable;
    }

    public void setCustomizable(Boolean customizable) {
        this.customizable = customizable;
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

    public String getSearchColorRaw() {
        return searchColorRaw;
    }

    public void setSearchColorRaw(String searchColorRaw) {
        this.searchColorRaw = searchColorRaw;
    }

    public Boolean getOrderable() {
        return isOrderable;
    }

    public void setOrderable(Boolean orderable) {
        isOrderable = orderable;
    }

    public Boolean getWaitingRoomProduct() {
        return isWaitingRoomProduct;
    }

    public void setWaitingRoomProduct(Boolean waitingRoomProduct) {
        isWaitingRoomProduct = waitingRoomProduct;
    }

    public Boolean getInPreview() {
        return isInPreview;
    }

    public void setInPreview(Boolean inPreview) {
        isInPreview = inPreview;
    }

    public Boolean getSpecialLaunch() {
        return specialLaunch;
    }

    public void setSpecialLaunch(Boolean specialLaunch) {
        this.specialLaunch = specialLaunch;
    }

    public String getSpecialLaunchType() {
        return specialLaunchType;
    }

    public void setSpecialLaunchType(String specialLaunchType) {
        this.specialLaunchType = specialLaunchType;
    }

    public SizeTypes getSizeTypes() {
        return sizeTypes;
    }

    public void setSizeTypes(SizeTypes sizeTypes) {
        this.sizeTypes = sizeTypes;
    }

    public Boolean getFlash() {
        return isFlash;
    }

    public void setFlash(Boolean flash) {
        isFlash = flash;
    }

    public String getSizeChartLink() {
        return sizeChartLink;
    }

    public void setSizeChartLink(String sizeChartLink) {
        this.sizeChartLink = sizeChartLink;
    }

    public AttributeList() {
    }
}
