package test.demo.website_sell.application.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import test.demo.website_sell.application.base.model.BaseResponse;
import test.demo.website_sell.application.exceptions.BusinessException;
import test.demo.website_sell.application.exceptions.ResponseStatus;

@RestControllerAdvice
@AllArgsConstructor
public class ApiHandleExceptionController {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<BaseResponse<ResponseStatus>> handleUrlExisted(BusinessException businessException) {
        return new ResponseEntity<>(BaseResponse.fail(businessException), businessException.getResponseStatus().getStatus());
    }
}

