package com.sl.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sl.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	Optional<Product> findByName(String name);

	List<Product> findAllByNameContaining(String name);

	// Task-19 : Implement search by price range
	List<Product> findAllByPriceBetween(float price1, float price2);

	// Task - 20
	// Write a finder method to find all products whose name is "n" chars in length
	// we cannot do it, using the above approach of writing a finder method "has"
	// "having", "containing"..
	// But can write one, use HQL statement
	@Query(value = "SELECT p FROM Product p WHERE LENGTH(p.name) = :n")
	List<Product> findProductsWithNameLength(int n);

}
