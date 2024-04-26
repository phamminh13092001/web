package test.demo.website_sell.domains.user.model.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Entity
@Table(name = "user")
@Data
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long userId;

        @NotEmpty(message = "Name cannot be empty")
        @Column(name="user_name")
        private String userName;
        //
//        @Size(min = 18, max = 120, message = "Age must be between 18 and 120")
        @Column(name="age")
        private int age;

        @Pattern(regexp="(^$|[0-9]{10})", message = "Invalid phone number")
        @Column(name="phone_number")
        private String phoneNumber;

        @Email(message = "Invalid email")
        @NotEmpty(message = "Email cannot be empty")
        @Column(name="email")
        private String email;

        @Size(max = 255, message = "Address cannot exceed 255 characters")
        @Column(name="address")
        private String address;

    }


