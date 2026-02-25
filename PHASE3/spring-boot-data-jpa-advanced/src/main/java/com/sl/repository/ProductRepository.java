package com.sl.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sl.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	Optional<Product> findByName(String name);
	
	List<Product> findAllByNameContaining(String name);

}
