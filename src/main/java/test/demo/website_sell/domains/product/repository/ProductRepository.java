package test.demo.website_sell.domains.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.demo.website_sell.domains.product.model.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
