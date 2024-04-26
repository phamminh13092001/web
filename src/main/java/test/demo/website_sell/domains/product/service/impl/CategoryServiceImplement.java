package test.demo.website_sell.domains.product.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.demo.website_sell.domains.product.mapper.CategoryMapper;
import test.demo.website_sell.domains.product.model.entity.Category;
import test.demo.website_sell.domains.product.repository.CategoryRepository;
import test.demo.website_sell.domains.product.service.CategoryService;

import java.util.List;
@Service
@AllArgsConstructor
public class CategoryServiceImplement implements CategoryService {
    private CategoryRepository categoryRepository;

    private CategoryMapper categoryMapper;
    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Long categoryId) {
        return null;
    }

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Long categoryId, Category category) {
        return null;
    }

    @Override
    public void deleteCategory(Long categoryId) {

    }
}
