package test.demo.website_sell.domains.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.demo.website_sell.domains.user.model.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long > {

}
