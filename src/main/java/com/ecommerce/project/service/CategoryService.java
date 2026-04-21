package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CategoryService {
    public List<Category> getAllCategories();
    public void createCategory(Category category);
    public String deleteCategory(Long categoryId);
    public Category updateCategory(Category category, Long categoryId);
}