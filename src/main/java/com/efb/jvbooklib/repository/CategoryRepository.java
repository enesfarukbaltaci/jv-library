package com.efb.jvbooklib.repository;

import com.efb.jvbooklib.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
