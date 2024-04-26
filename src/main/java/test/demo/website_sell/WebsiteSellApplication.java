package test.demo.website_sell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@Component
@EnableTransactionManagement
@EnableJpaRepositories
@Configuration
public class WebsiteSellApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsiteSellApplication.class, args);
    }

}
