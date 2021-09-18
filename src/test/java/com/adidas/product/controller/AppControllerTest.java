package com.adidas.product.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.adidas.product.pojo.ProductDetail;
import com.adidas.product.service.ProductService;

public class AppControllerTest {

	@Mock
	private ProductService productService;

	@InjectMocks
	private AppController appController;

	private static final String PRODUCT_ID = "123";

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void getProductReturnSuccessResponseWhenProductServiceReturnProducts() {
		doReturn(getProductDetails()).when(productService).getProductDetails(Mockito.anyString());

		ResponseEntity<ProductDetail> productDetailEntity = appController.getProduct(PRODUCT_ID);

		assertEquals(HttpStatus.OK, productDetailEntity.getStatusCode());

		verify(productService).getProductDetails(Mockito.anyString());
		verifyNoMoreInteractions(productService);

	}

	@Test
	public void getProductReturnEmptyResponseWhenProductServiceReturnEmtpy() {
		doReturn(getEmptyProductDetails()).when(productService).getProductDetails(Mockito.anyString());

		ResponseEntity<ProductDetail> productDetailEntity = appController.getProduct(PRODUCT_ID);

		assertEquals(HttpStatus.OK, productDetailEntity.getStatusCode());

		verify(productService).getProductDetails(Mockito.anyString());
		verifyNoMoreInteractions(productService);

	}

	@Test
	public void getProductThrowsRuntimeErrorWhenProductServiceReturnError() {

		doThrow(new RuntimeException("Ops somtheing went wrong")).when(productService).getProductDetails(PRODUCT_ID);
		ResponseEntity<ProductDetail> productDetailEntity = null;
		try {
			productDetailEntity = appController.getProduct(PRODUCT_ID);
		} catch (RuntimeException ex) {
			assertNull(productDetailEntity);
			verify(productService).getProductDetails(Mockito.anyString());
			verifyNoMoreInteractions(productService);
		}

	}


	private ProductDetail getProductDetails() {
		ProductDetail productDetail = new ProductDetail();
		productDetail.setId("123");
		productDetail.setName("Clothes");
		return productDetail;
	}

	private ProductDetail getEmptyProductDetails() {
		return new ProductDetail();
	}
}
