package com.adidas.product.service;

import com.adidas.product.client.ReviewClient;
import com.adidas.product.configuration.ServiceConfigs;
import com.adidas.product.pojo.ProductDetail;
import com.adidas.product.pojo.ProductReview;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductServiceImpl implements ProductService {

    private static final String ADIDAS_PRODUCT_URL = "https://www.adidas.co.uk/api/products/";

    private final RestTemplate restTemplate;

    private final ReviewClient reviewClient;

    private final ServiceConfigs configs;

    public ProductServiceImpl(RestTemplate restTemplate, ReviewClient reviewClient, ServiceConfigs configs) {
        this.restTemplate = restTemplate;
        this.reviewClient = reviewClient;
        this.configs = configs;
    }

    @Override
    public ProductDetail getProductDetails(String productId) {
        ProductDetail productDetail = getProductDetailsFromClient(productId);
        ProductReview productReview = reviewClient.getReview(productId);
        productDetail.setAverageReviewScore(productReview.getAverageReviewScore());
        productDetail.setNumberOfReviews(productReview.getNumberOfReviews());
        return productDetail;
    }

    private ProductDetail getProductDetailsFromClient(String productId) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", configs.getUserAgent());
        HttpEntity<String> entity = new HttpEntity<>(headers);
        try {
            return restTemplate.exchange(ADIDAS_PRODUCT_URL.concat(productId), HttpMethod.GET, entity, ProductDetail.class).getBody();
        } catch (Exception e) {
            return new ProductDetail();
        }
    }
}