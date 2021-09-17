package com.adidas.product.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductReview {

    private String averageReviewScore;
    private String numberOfReviews;



    public ProductReview(String averageReviewScore, String numberOfReviews) {
        this.averageReviewScore = averageReviewScore;
        this.numberOfReviews = numberOfReviews;
    }

    public ProductReview() {

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
}
