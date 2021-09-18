package com.adidas.product.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.adidas.product.client.AdidasClient;
import com.adidas.product.client.ReviewClient;
import com.adidas.product.configuration.ServiceConfigs;
import com.adidas.product.pojo.ProductDetail;
import com.adidas.product.pojo.ProductReview;

public class ProductServiceImplTest {

	@Mock
	private AdidasClient adidasClient;

	@Mock
	private ReviewClient reviewClient;

	@Mock
	private ServiceConfigs serviceConfig;

	@InjectMocks
	private ProductServiceImpl productService;

	private static final String PRODUCT_ID = "ABCXYZ";

	private static final String TAGREEMENT_REVIEW_SCORE = "review1234";

	private static final String VALID_USER_AGENT = "AGENT_1234";

	private static final String INVALID_USER_AGENT = "AGENT_12345";

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void getProductDetailsReturnProductsWhenFindProductsAndReviewFromClientServiceByProductId() {
		doReturn(getProductDetails()).when(adidasClient).getProduct(Mockito.anyString(), Mockito.anyString());
		doReturn(getProductReview()).when(reviewClient).getReview(Mockito.anyString());
		doReturn(VALID_USER_AGENT).when(serviceConfig).getUserAgent();
		ProductDetail productDetail = productService.getProductDetails(PRODUCT_ID);
		assertEquals(TAGREEMENT_REVIEW_SCORE, productDetail.getAverageReviewScore());

		verify(adidasClient).getProduct(Mockito.anyString(), Mockito.anyString());
		verify(reviewClient).getReview(Mockito.anyString());
		verify(serviceConfig).getUserAgent();

	}

	@Test
	public void getProductDetailsReturnProductsWithoutReviewWhenFindOnlyProductsFromClientServiceByProductId() {
		doReturn(getProductDetails()).when(adidasClient).getProduct(Mockito.anyString(), Mockito.anyString());
		doReturn(getEmptyProductReview()).when(reviewClient).getReview(Mockito.anyString());
		doReturn(VALID_USER_AGENT).when(serviceConfig).getUserAgent();
		ProductDetail productDetail = productService.getProductDetails(PRODUCT_ID);
		assertNull(productDetail.getAverageReviewScore());

		verify(adidasClient).getProduct(Mockito.anyString(), Mockito.anyString());
		verify(reviewClient).getReview(Mockito.anyString());
		verify(serviceConfig).getUserAgent();

	}

	@Test
	public void getProductDetailsReturnNothingWhenNoProductOrReviewProductFoundFromClientServiceByProductId() {
		doReturn(getEmptyProductDetails()).when(adidasClient).getProduct(Mockito.anyString(), Mockito.anyString());
		doReturn(getEmptyProductReview()).when(reviewClient).getReview(Mockito.anyString());
		doReturn(VALID_USER_AGENT).when(serviceConfig).getUserAgent();
		ProductDetail productDetail = productService.getProductDetails(PRODUCT_ID);
		assertNull(productDetail.getAverageReviewScore());

		verify(adidasClient).getProduct(Mockito.anyString(), Mockito.anyString());
		verify(reviewClient).getReview(Mockito.anyString());
		verify(serviceConfig).getUserAgent();

	}

	@Test
	public void getProductDetailsThrowsExceptionWhenAnyMethodReturnRunTimeExceptionAndBreakFlow() {
		doReturn(getEmptyProductDetails()).when(adidasClient).getProduct(Mockito.anyString(), Mockito.anyString());
		doReturn(getEmptyProductReview()).when(reviewClient).getReview(Mockito.anyString());
		doThrow(new RuntimeException("Something Went Wrong")).when(serviceConfig).getUserAgent();
		try {
		ProductDetail productDetail = productService.getProductDetails(PRODUCT_ID);
		} catch (RuntimeException ex) {
			verifyNoInteractions(adidasClient);
			verifyNoInteractions(reviewClient);
		}

	}



	private ProductDetail getProductDetails() {
		ProductDetail productDetail = new ProductDetail();
		productDetail.setId("123");
		productDetail.setName("Clothes");
		return productDetail;
	}

	private ProductReview getProductReview() {
		ProductReview productReview = new ProductReview();
		productReview.setAverageReviewScore(TAGREEMENT_REVIEW_SCORE);
		productReview.setNumberOfReviews("5");
		return productReview;
	}

	private ProductReview getEmptyProductReview() {
		return new ProductReview();
	}

	private ProductDetail getEmptyProductDetails() {
		return new ProductDetail();
	}

}