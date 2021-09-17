package com.adidas.product.client;

import com.adidas.product.pojo.ProductDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "products", url = "https://www.adidas.co.uk", fallback = AdidasClientFallback.class)
public interface AdidasClient {

    @GetMapping("/api/products/{productId}")
    ProductDetail getProduct(@RequestHeader("User-Agent") String userAgent, @PathVariable String productId);
}