package test.demo.website_sell.domains.product.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.demo.website_sell.domains.product.model.entity.Product;
import test.demo.website_sell.domains.product.service.ProductService;

import java.util.List;
@Service
@AllArgsConstructor
public class ProductServiceImplement implements ProductService {
    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProductById(Long productId) {
        return null;
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long productId) {

    }
}
