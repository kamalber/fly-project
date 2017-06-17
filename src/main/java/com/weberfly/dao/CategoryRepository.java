package com.weberfly.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weberfly.entities.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

		public Category findByTitle(String title);
}
