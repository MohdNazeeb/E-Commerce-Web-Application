package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.payload.CategoryResponse;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CategoryService {
    public CategoryResponse getAllCategories();
    public void createCategory(Category category);
    public String deleteCategory(Long categoryId);
    public Category updateCategory(Category category, Long categoryId);
}