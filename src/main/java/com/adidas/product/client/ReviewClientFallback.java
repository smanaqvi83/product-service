package com.adidas.product.client;

import com.adidas.product.pojo.ProductReview;
import org.springframework.stereotype.Component;

@Component
public class ReviewClientFallback implements ReviewClient {
    @Override
    public ProductReview getReview(String productId) {
        return new ProductReview();
    }
}
