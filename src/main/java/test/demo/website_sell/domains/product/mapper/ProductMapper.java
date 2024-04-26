package test.demo.website_sell.domains.product.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import test.demo.website_sell.application.utils.BeanUtil;
import test.demo.website_sell.domains.product.model.entity.Product;
import test.demo.website_sell.domains.product.model.response.ProductResponse;
@Component
@AllArgsConstructor
public class ProductMapper {
    public ProductResponse to(Product product) {
        ProductResponse response = new ProductResponse();
        BeanUtil.refine(product, response, BeanUtil::copyNonNull);

        return response;
    }
}
