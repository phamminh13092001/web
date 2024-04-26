package test.demo.website_sell.domains.product.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import test.demo.website_sell.application.utils.BeanUtil;
import test.demo.website_sell.domains.product.model.entity.Category;
import test.demo.website_sell.domains.product.model.response.CategoryResponse;

@Component
@AllArgsConstructor
public class CategoryMapper {
    public CategoryResponse to(Category category) {
        CategoryResponse response = new CategoryResponse();
        BeanUtil.refine(category, response, BeanUtil::copyNonNull);

        return response;
    }
}
