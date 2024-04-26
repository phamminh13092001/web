package test.demo.website_sell.domains.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.demo.website_sell.domains.product.model.entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
