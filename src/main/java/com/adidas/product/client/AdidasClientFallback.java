package com.adidas.product.client;

import com.adidas.product.pojo.ProductDetail;
import org.springframework.stereotype.Component;

@Component
public class AdidasClientFallback implements AdidasClient {
    @Override
    public ProductDetail getProduct(String userAgent, String productId) {
        return new ProductDetail();
    }
}
