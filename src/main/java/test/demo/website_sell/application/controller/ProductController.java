package test.demo.website_sell.application.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import test.demo.website_sell.domains.product.model.entity.Category;
import test.demo.website_sell.domains.product.model.entity.Product;
import test.demo.website_sell.domains.product.service.CategoryService;
import test.demo.website_sell.domains.product.service.ProductService;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@Component
@RestController
@RequestMapping("/api/products")//http://localhost:8081/api/products/all_product
public class ProductController extends BaseController {

    private ProductService productService;

    private CategoryService categoryService;

    @GetMapping("/all")
    public ResponseEntity getAllProducts() {
        List<Product> response = productService.getAllProducts();

        return success(response);
    }

    @GetMapping("/abc")
    public ResponseEntity<Product> getProductById(@RequestParam(name = "productId") Long productId) {
        Product product = productService.getProductById(productId);

        if (product != null) {
            return ResponseEntity.ok().body(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product createdProduct = productService.addProduct(product);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    @PutMapping("/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long productId, @RequestBody Product product) {
        Product updatedProduct = productService.updateProduct(productId, product);
        if (updatedProduct != null) {
            return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long productId) {
        productService.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @GetMapping("/categories")
    public ResponseEntity getAllCategories() {
        List<Category> response = categoryService.getAllCategories();

        return success(response);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addCategory(@Valid @RequestBody Category category, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>(result.getAllErrors(), HttpStatus.BAD_REQUEST);
        }
        Category newCategory = categoryService.addCategory(category);
        return new ResponseEntity<>(newCategory, HttpStatus.CREATED);
    }
}