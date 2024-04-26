package test.demo.website_sell.domains.user.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import test.demo.website_sell.application.utils.BeanUtil;
import test.demo.website_sell.domains.user.model.entity.User;
import test.demo.website_sell.domains.user.model.request.UserRequest;
import test.demo.website_sell.domains.user.model.response.UserResponse;
@Component
@AllArgsConstructor
public class UserMapper {
    public UserResponse to(User user) {
        UserResponse response = new UserResponse();
        BeanUtil.refine(user, response, BeanUtil::copyNonNull);

        return response;
    }

    public User to(UserRequest request) {
        User user = new User();
        BeanUtil.refine(request, user, BeanUtil::copyNonNull);

        return user;
    }
}
