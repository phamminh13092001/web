package test.demo.website_sell.domains.product.model.request;

import test.demo.website_sell.domains.product.model.entity.Category;

import java.math.BigDecimal;

public class ProductSaveRequest {
    private long productId;
    private String productName;
    private BigDecimal price;
    private String description;
    private Category category;
}
