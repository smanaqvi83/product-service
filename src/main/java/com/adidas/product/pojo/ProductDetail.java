package com.adidas.product.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class ProductDetail {
    private String id;
    @JsonProperty("product_type")
    private String productType;
    @JsonProperty("model_number")
    private String modelNumber;
    private String name;
    @JsonProperty("meta_data")
    private MetaData metaData;
    @JsonProperty("view_list")
    private List<View> viewList = null;
    @JsonProperty("attribute_list")
    private AttributeList attributeList;
    @JsonProperty("breadcrumb_list")
    private List<Breadcrumb> breadcrumbList = null;
    private Callouts callouts;
    @JsonProperty("pricing_information")
    private PricingInformation pricingInformation;
    @JsonProperty("product_description")
    private ProductDescription productDescription;
    private Boolean recommendationsEnabled;
    @JsonProperty("product_link_list")
    private List<ProductLink> productLinkList = null;
    private Embellishment embellishment;
    @JsonProperty("product_id")
    private String productId;
    @JsonProperty("average_review_score")
    private String averageReviewScore;
    @JsonProperty("number_of_reviews")
    private String numberOfReviews;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public List<View> getViewList() {
        return viewList;
    }

    public void setViewList(List<View> viewList) {
        this.viewList = viewList;
    }

    public AttributeList getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(AttributeList attributeList) {
        this.attributeList = attributeList;
    }

    public List<Breadcrumb> getBreadcrumbList() {
        return breadcrumbList;
    }

    public void setBreadcrumbList(List<Breadcrumb> breadcrumbList) {
        this.breadcrumbList = breadcrumbList;
    }

    public Callouts getCallouts() {
        return callouts;
    }

    public void setCallouts(Callouts callouts) {
        this.callouts = callouts;
    }

    public PricingInformation getPricingInformation() {
        return pricingInformation;
    }

    public void setPricingInformation(PricingInformation pricingInformation) {
        this.pricingInformation = pricingInformation;
    }

    public ProductDescription getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(ProductDescription productDescription) {
        this.productDescription = productDescription;
    }

    public Boolean getRecommendationsEnabled() {
        return recommendationsEnabled;
    }

    public void setRecommendationsEnabled(Boolean recommendationsEnabled) {
        this.recommendationsEnabled = recommendationsEnabled;
    }

    public List<ProductLink> getProductLinkList() {
        return productLinkList;
    }

    public void setProductLinkList(List<ProductLink> productLinkList) {
        this.productLinkList = productLinkList;
    }

    public Embellishment getEmbellishment() {
        return embellishment;
    }

    public void setEmbellishment(Embellishment embellishment) {
        this.embellishment = embellishment;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getAverageReviewScore() {
        return averageReviewScore;
    }

    public void setAverageReviewScore(String averageReviewScore) {
        this.averageReviewScore = averageReviewScore;
    }

    public String getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(String numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class MetaData {

        private String canonical;
        private String description;
        private String keywords;
        @JsonProperty("page_title")
        private String pageTitle;
        @JsonProperty("site_name")
        private String siteName;

        public String getCanonical() {
            return canonical;
        }

        public void setCanonical(String canonical) {
            this.canonical = canonical;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public String getPageTitle() {
            return pageTitle;
        }

        public void setPageTitle(String pageTitle) {
            this.pageTitle = pageTitle;
        }

        public String getSiteName() {
            return siteName;
        }

        public void setSiteName(String siteName) {
            this.siteName = siteName;
        }
    }
}
