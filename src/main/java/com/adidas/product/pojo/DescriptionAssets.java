package com.adidas.product.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescriptionAssets {

    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("video_url")
    private Object videoUrl;
    @JsonProperty("poster_url")
    private Object posterUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Object getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(Object videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Object getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(Object posterUrl) {
        this.posterUrl = posterUrl;
    }
}
