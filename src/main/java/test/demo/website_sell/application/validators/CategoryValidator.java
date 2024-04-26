package test.demo.website_sell.application.validators;

import org.springframework.stereotype.Component;
import test.demo.website_sell.application.exceptions.BusinessException;
import test.demo.website_sell.application.exceptions.CategoryCode;
import test.demo.website_sell.domains.product.model.request.CategorySaveRequest;
@Component
public class CategoryValidator {
    public void validateCategorySaveRequest(CategorySaveRequest request) {
        Validator.of(request)
                .requireNonNull(() -> new BusinessException(CategoryCode.CATEGORY_SAVE_NULL))
                .requireNonBlank(CategorySaveRequest::getCategoryName, () -> new BusinessException(CategoryCode.CATEGORY_CATEGORY_NAME_BLANK))
                .requireNonBlank(CategorySaveRequest::getDescription, () -> new BusinessException(CategoryCode.CATEGORY_DESCRIPTION_BLANK))
//                .requireNonBlank(CategorySaveRequest::getCategoryId, () -> new BusinessException(CategoryCode.CATEGORY_CATEGORY_ID_BLANK))
                .validate(CategorySaveRequest::getCategoryName, categoryName -> categoryName.length() > 255, () -> new BusinessException(CategoryCode.CATEGORY_CATEGORY_NAME_MAX_LENGTH))
                .get();
    }
}
