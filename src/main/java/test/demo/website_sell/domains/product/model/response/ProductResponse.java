package test.demo.website_sell.domains.product.model.response;

import lombok.Data;
import test.demo.website_sell.domains.product.model.entity.Category;
import java.math.BigDecimal;
@Data
public class ProductResponse {
    private long productId;
    private String productName;
    private BigDecimal price;
    private String description;
    private Category category;
}
