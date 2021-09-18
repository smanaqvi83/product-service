package com.adidas.product.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Callouts {

    @JsonProperty("callout_top_stack")
    private List<CalloutTopStack> calloutTopStack = null;

    public List<CalloutTopStack> getCalloutTopStack() {
        return calloutTopStack;
    }

    public void setCalloutTopStack(List<CalloutTopStack> calloutTopStack) {
        this.calloutTopStack = calloutTopStack;
    }
}