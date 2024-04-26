package test.demo.website_sell.application.exceptions;

import org.springframework.http.HttpStatus;

public class CategoryCode {
    public static final ResponseStatus CATEGORY_NOT_FOUND =
            new ResponseStatus("CATEGORY_NOT_FOUND", "Not found category", HttpStatus.NOT_FOUND);
    public static final ResponseStatus CATEGORY_WRONG_ACTIVE_CODE =
            new ResponseStatus("CATEGORY_WRONG_ACTIVE_CODE", "Wrong active code", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_ALREADY_ACTIVE =
            new ResponseStatus("CATEGORY_ALREADY_ACTIVE", "Account is activated", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_ACTIVE_NULL =
            new ResponseStatus("CATEGORY_ACTIVE_NULL", "Object is null", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_ACTIVE_CODE_BLANK =
            new ResponseStatus("CATEGORY_ACTIVE_CODE_BLANK", "Active code is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_AUTH_NULL =
            new ResponseStatus("CATEGORY_AUTH_NULL", "Object is null", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_ACCOUNT_BLANK =
            new ResponseStatus("CATEGORY_ACCOUNT_BLANK", "Account is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_SAVE_NULL =
            new ResponseStatus("CATEGORY_SAVE_NULL", "Object is null", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_CATEGORY_NAME_BLANK =
            new ResponseStatus("CATEGORY_CATEGORY_NAME_BLANK", "Category name is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_DESCRIPTION_BLANK =
            new ResponseStatus("CATEGORY_DESCRIPTION_BLANK", "Description is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_CATEGORY_NAME_MAX_LENGTH =
            new ResponseStatus("CATEGORY_CATEGORY_NAME_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_CATEGORY_ID_BLANK =
            new ResponseStatus("CATEGORY_CATEGORY_ID_BLANK", "Category id is blank", HttpStatus.BAD_REQUEST);

    private CategoryCode() {

    }
}
