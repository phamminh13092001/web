package test.demo.website_sell.domains.user.service;

import test.demo.website_sell.domains.user.model.entity.User;
import test.demo.website_sell.domains.user.model.request.UserRequest;
import test.demo.website_sell.domains.user.model.response.UserResponse;

import java.util.List;

public interface UserService {
    List<User> getAllUserResponses();

    UserResponse save(UserRequest request);


    UserResponse update(Long userId, UserRequest request);

    UserResponse delete(Long userId, UserRequest request);
}
