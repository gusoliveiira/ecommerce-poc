package com.ecommerce.productapi.modules.category.repository;

import com.ecommerce.productapi.modules.category.model.Category;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    List<Category> findByDescriptionIgnoreCaseContaining(String description);
}
