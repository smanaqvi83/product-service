package com.adidas.product.service;

import org.springframework.stereotype.Service;

import com.adidas.product.client.AdidasClient;
import com.adidas.product.client.ReviewClient;
import com.adidas.product.configuration.ServiceConfigs;
import com.adidas.product.pojo.ProductDetail;
import com.adidas.product.pojo.ProductReview;

@Service
public class ProductServiceImpl implements ProductService {

    private final AdidasClient adidasClient;

    private final ReviewClient reviewClient;

    private final ServiceConfigs configs;

    public ProductServiceImpl(AdidasClient adidasClient, ReviewClient reviewClient, ServiceConfigs configs) {
        this.adidasClient = adidasClient;
        this.reviewClient = reviewClient;
        this.configs = configs;
    }

    @Override
    public ProductDetail getProductDetails(String productId) {
        ProductDetail productDetail = adidasClient.getProduct(configs.getUserAgent(), productId);
        ProductReview productReview = reviewClient.getReview(productId);
        productDetail.setAverageReviewScore(productReview.getAverageReviewScore());
        productDetail.setNumberOfReviews(productReview.getNumberOfReviews());
        return productDetail;
    }
}
