package test.demo.website_sell.application.exceptions;

import org.springframework.http.HttpStatus;

public class UserCode {
    public static final ResponseStatus USER_NOT_FOUND =
            new ResponseStatus("USER_NOT_FOUND", "Not found USER", HttpStatus.NOT_FOUND);
    public static final ResponseStatus USER_UPDATE_NULL =
            new ResponseStatus("USER_UPDATE_NULL", "Object is null", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_SAVE_NULL =
            new ResponseStatus("USER_SAVE_NULL", "Object is null", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_ID_NULL =
            new ResponseStatus("USER_ID_NULL", "Object is null", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_USER_NAME_BLANK =
            new ResponseStatus("USER_USER_NAME_BLANK", "User name is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_ADDRESS_BLANK =
            new ResponseStatus("USER_ADDRESS_BLANK", "Address is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_AGE_BLANK =
            new ResponseStatus("USER_AGE_BLANK", "Age is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_EMAIL_BLANK =
            new ResponseStatus("USER_EMAIL_BLANK", "Email is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_PHONE_NUMBER_BLANK =
            new ResponseStatus("USER_PHONE_NUMBER_BLANK", "Phone number is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_USER_NAME_MAX_LENGTH =
            new ResponseStatus("USER_USER_NAME_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_ADDRESS_MAX_LENGTH =
            new ResponseStatus("USER_ADDRESS_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_AGE_MIN_LENGTH =
            new ResponseStatus("USER_AGE_MIN_LENGTH", "Min length is 18", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_EMAIL_MAX_LENGTH =
            new ResponseStatus("USER_EMAIL_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_PHONE_NUMBER_MAX_LENGTH =
            new ResponseStatus("USER_PHONE_NUMBER_MAX_LENGTH", "Max length is 11", HttpStatus.BAD_REQUEST);

    private UserCode() {

    }
}
