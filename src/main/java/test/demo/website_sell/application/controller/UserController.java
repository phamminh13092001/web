package test.demo.website_sell.application.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import test.demo.website_sell.application.validators.UserValidator;
import test.demo.website_sell.domains.user.model.entity.User;
import test.demo.website_sell.domains.user.model.request.UserRequest;
import test.demo.website_sell.domains.user.model.response.UserResponse;
import test.demo.website_sell.domains.user.service.UserService;

import javax.validation.Valid;
import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/api/users")//http://localhost:8080/api/users/all
@Component
public class UserController extends BaseController {

    private UserService userService;

    private UserValidator userValidator;

    @GetMapping("/all")
    public ResponseEntity getAllUsers() {
        List<User> response = userService.getAllUserResponses();

        return success(response);
    }

    @PostMapping("/add")
    public ResponseEntity save(@RequestBody UserRequest request) {
        userValidator.validateUserRequest(request);

        return success(userService.save(request));
    }

    @PutMapping("/{userId}")
    public ResponseEntity update(@PathVariable Long userId,
                                 @RequestBody UserRequest request) {
//        checkId(id);
        userValidator.validateUserRequest(request);

        return success(userService.update(userId, request));
    }
    @DeleteMapping("/")
public ResponseEntity delete(@RequestBody long userId){
        List<User> response = userService.getAllUserResponses();
        return success(
                response
        );
    }
}
