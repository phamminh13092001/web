package test.demo.website_sell.domains.user.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.demo.website_sell.application.exceptions.BusinessException;
import test.demo.website_sell.application.exceptions.ResponseStatus;
import test.demo.website_sell.application.exceptions.UserCode;
import test.demo.website_sell.domains.user.mapper.UserMapper;
import test.demo.website_sell.domains.user.model.entity.User;
import test.demo.website_sell.domains.user.model.request.UserRequest;
import test.demo.website_sell.domains.user.model.response.UserResponse;
import test.demo.website_sell.domains.user.repository.UserRepository;
import test.demo.website_sell.domains.user.service.UserService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor
public class UserServiceImplement implements UserService {
    private UserRepository userRepository;
    private UserMapper userMapper;
    @Override
    public List<User> getAllUserResponses() {
       return userRepository.findAll();
    }

    @Override
    public UserResponse save(UserRequest request) {
        User user = userMapper.to(request);
        user = userRepository.save(user);

        return userMapper.to(user);
    }

    @Override
    public UserResponse update(Long userId, UserRequest request) {
        User user = getUsers(userId);

        user = userMapper.to(request);
        user = userRepository.save(user);

        return userMapper.to(user);
    }

    @Override
    public UserResponse delete(Long userId, UserRequest request) {
        return null;
    }

    private User getUsers(Long userId) {
        Optional<User> user = userRepository.findById(userId);

        user.orElseThrow(() -> new BusinessException(UserCode.USER_NOT_FOUND));

        return user.get();
    }

}
