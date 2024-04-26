package test.demo.website_sell.domains.product.model.request;

import lombok.Data;

@Data
public class CategorySaveRequest {
    private long categoryId;
    private String categoryName;
    private String description;
}
