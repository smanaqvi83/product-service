package com.adidas.product.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WashCareInstructions {

    private List<Object> careInstructions = null;

    public List<Object> getCareInstructions() {
        return careInstructions;
    }

    public void setCareInstructions(List<Object> careInstructions) {
        this.careInstructions = careInstructions;
    }
}
