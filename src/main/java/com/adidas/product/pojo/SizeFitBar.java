package com.adidas.product.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SizeFitBar {

    private String value;
    private Integer markerCount;
    private Integer selectedMarkerIndex;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getMarkerCount() {
        return markerCount;
    }

    public void setMarkerCount(Integer markerCount) {
        this.markerCount = markerCount;
    }

    public Integer getSelectedMarkerIndex() {
        return selectedMarkerIndex;
    }

    public void setSelectedMarkerIndex(Integer selectedMarkerIndex) {
        this.selectedMarkerIndex = selectedMarkerIndex;
    }
}
