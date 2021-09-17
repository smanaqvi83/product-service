package com.adidas.product.service;

import com.adidas.product.pojo.ProductDetail;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    ProductDetail getProductDetails(String productId);
}
