package test.demo.website_sell.domains.user.model.request;

import lombok.Data;

@Data
public class UserRequest {
    private long userId;
    private String userName;
    private int age;
    private String phoneNumber;
    private String email;
    private String address;
}
