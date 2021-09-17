package com.adidas.product.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmbellishmentOption {

    public String position;
    public Integer positionPrice;
    public Boolean allowChooseOwnText;
    public List<Field> fields = null;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getPositionPrice() {
        return positionPrice;
    }

    public void setPositionPrice(Integer positionPrice) {
        this.positionPrice = positionPrice;
    }

    public Boolean getAllowChooseOwnText() {
        return allowChooseOwnText;
    }

    public void setAllowChooseOwnText(Boolean allowChooseOwnText) {
        this.allowChooseOwnText = allowChooseOwnText;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
}
