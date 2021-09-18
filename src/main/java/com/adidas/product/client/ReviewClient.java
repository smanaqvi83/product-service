package com.adidas.product.client;

import com.adidas.product.pojo.ProductReview;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${feign.name}", url = "${feign.url}", fallback = ReviewClientFallback.class)
@Cacheable
public interface ReviewClient {
    @GetMapping("/v1.0/review/{productId}")
    ProductReview getReview(@PathVariable String productId);
}
