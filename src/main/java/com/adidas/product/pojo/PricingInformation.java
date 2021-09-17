package com.adidas.product.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PricingInformation {

    private Integer currentPrice;
    @JsonProperty("standard_price")
    private Integer standardPrice;
    @JsonProperty("standard_price_no_vat")
    private Double standardPriceNoVat;

    public Integer getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Integer currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Integer getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(Integer standardPrice) {
        this.standardPrice = standardPrice;
    }

    public Double getStandardPriceNoVat() {
        return standardPriceNoVat;
    }

    public void setStandardPriceNoVat(Double standardPriceNoVat) {
        this.standardPriceNoVat = standardPriceNoVat;
    }
}
