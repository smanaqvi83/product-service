package com.adidas.product.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Field {

    private String type;
    private String key;
    private Integer maxLength;
    private Integer minLength;
    private String validation;
    private String textColor;
    private Boolean usesStock;
    private Object stockCollection;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public Boolean getUsesStock() {
        return usesStock;
    }

    public void setUsesStock(Boolean usesStock) {
        this.usesStock = usesStock;
    }

    public Object getStockCollection() {
        return stockCollection;
    }

    public void setStockCollection(Object stockCollection) {
        this.stockCollection = stockCollection;
    }
}
