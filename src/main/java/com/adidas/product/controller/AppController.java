package com.adidas.product.controller;

import com.adidas.product.exception.ProductException;
import com.adidas.product.pojo.ProductDetail;
import com.adidas.product.service.ProductService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1.0/product")
public class AppController {

    private final ProductService productService;

    public AppController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    public ResponseEntity<ProductDetail> sendErrorMessage() {
            throw new ProductException("No product has been passed");
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductDetail> getProduct(@PathVariable("productId") String productId) {
        if (StringUtils.isNotBlank(productId)) {
            return ResponseEntity.ok(productService.getProductDetails(productId));
        } else {
            throw new ProductException("No product has been passed");
        }

    }
}
