package com.adidas.product.client;

import com.adidas.product.pojo.ProductReview;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "reviews", url = "http://localhost:8081", fallback = ReviewClientFallback.class)
public interface ReviewClient {
    @GetMapping("/v1.0/review/{productId}")
    ProductReview getReview(@PathVariable String productId);
}
