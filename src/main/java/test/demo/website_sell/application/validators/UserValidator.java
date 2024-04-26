package test.demo.website_sell.application.validators;

import org.springframework.stereotype.Component;
import test.demo.website_sell.application.exceptions.BusinessException;
import test.demo.website_sell.application.exceptions.UserCode;
import test.demo.website_sell.domains.user.model.request.UserRequest;
import test.demo.website_sell.domains.user.model.request.UserUpdateRequest;

@Component
public class UserValidator {
    public void validateUserRequest(UserRequest request) {
        Validator.of(request)
                .requireNonNull(() -> new BusinessException(UserCode.USER_SAVE_NULL))
                .requireNonBlank(UserRequest::getUserName, () -> new BusinessException(UserCode.USER_USER_NAME_BLANK))
                .requireNonBlank(UserRequest::getAddress, () -> new BusinessException(UserCode.USER_ADDRESS_BLANK))
                .requireNonBlank(UserRequest::getEmail, () -> new BusinessException(UserCode.USER_EMAIL_BLANK))
                .requireNonDefaultInt(UserRequest::getAge,()-> new BusinessException(UserCode.USER_AGE_BLANK))
                .validate(UserRequest::getUserName, userName -> userName.length() > 100, () -> new BusinessException(UserCode.USER_USER_NAME_MAX_LENGTH))
                .validate(UserRequest::getEmail, email -> email.length() > 255, () -> new BusinessException(UserCode.USER_EMAIL_MAX_LENGTH))
                .validate(UserRequest::getAge, age -> age.intValue() >= 18 , () -> new BusinessException(UserCode.USER_AGE_MIN_LENGTH))
                .validate(UserRequest::getPhoneNumber, phoneNumber -> phoneNumber.length() > 11, () -> new BusinessException(UserCode.USER_PHONE_NUMBER_MAX_LENGTH))

                .get();
    }
    public void validateUserUpdateRequest(UserUpdateRequest request) {
        Validator.of(request)
                .requireNonNull(() -> new BusinessException(UserCode.USER_UPDATE_NULL))
                .requireNonBlank(UserUpdateRequest::getUserName, () -> new BusinessException(UserCode.USER_USER_NAME_BLANK))
                .requireNonBlank(UserUpdateRequest::getAddress, () -> new BusinessException(UserCode.USER_EMAIL_BLANK))
                .requireNonDefaultInteger(UserUpdateRequest::getAge, () -> new BusinessException(UserCode.USER_AGE_BLANK))
                .requireNonBlank(UserUpdateRequest::getAddress, () -> new BusinessException(UserCode.USER_ADDRESS_BLANK))
                .requireNonDefaultLong(UserUpdateRequest::getUserId, () -> new BusinessException(UserCode.USER_ID_NULL))
                .validate(UserUpdateRequest::getUserName, userName -> userName.length() > 100, () -> new BusinessException(UserCode.USER_USER_NAME_MAX_LENGTH))
                .validate(UserUpdateRequest::getEmail, email -> email.length() > 255, () -> new BusinessException(UserCode.USER_EMAIL_MAX_LENGTH))
                .validate(UserUpdateRequest::getAge, age -> age.intValue() >= 18, () -> new BusinessException(UserCode.USER_AGE_MIN_LENGTH))
                .validate(UserUpdateRequest::getPhoneNumber, phoneNumber -> phoneNumber.length() > 11, () -> new BusinessException(UserCode.USER_PHONE_NUMBER_MAX_LENGTH))
                .get();
    }

}
