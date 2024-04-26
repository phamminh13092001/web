package test.demo.website_sell.application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import test.demo.website_sell.application.base.model.BaseResponse;

public class BaseController {
//    protected UserDetail getUserDetail() {
//        UserAuthentication userAuthentication = (UserAuthentication) SecurityContextHolder.getContext().getAuthentication();
//        UserDetail userDetails = (UserDetail) userAuthentication.getDetails();
//
//        return userDetails;
//    }

    public ResponseEntity success() {
        return ResponseEntity.ok(BaseResponse.success());
    }

    public <T> ResponseEntity<BaseResponse<T>> success(T data) {
        return ResponseEntity.ok(BaseResponse.success(data));
    }
}
