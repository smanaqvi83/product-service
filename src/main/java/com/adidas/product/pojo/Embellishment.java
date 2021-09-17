package com.adidas.product.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Embellishment {

    private List<EmbellishmentOption> embellishmentOptions = null;
    private String articleType;

    public List<EmbellishmentOption> getEmbellishmentOptions() {
        return embellishmentOptions;
    }

    public void setEmbellishmentOptions(List<EmbellishmentOption> embellishmentOptions) {
        this.embellishmentOptions = embellishmentOptions;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }
}