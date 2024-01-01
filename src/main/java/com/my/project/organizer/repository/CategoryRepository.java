package com.my.project.organizer.repository;

import com.my.project.organizer.model.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<CategoryEntity, Long> {
}
