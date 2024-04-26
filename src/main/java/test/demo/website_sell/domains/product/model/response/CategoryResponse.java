package test.demo.website_sell.domains.product.model.response;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class CategoryResponse {
    private long categoryId;
    private String categoryName;
    private String description;
}
