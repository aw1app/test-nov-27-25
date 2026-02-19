package com.sl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sl.entity.Product;

@Repository
public class ProductDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Product> getAllProducts() {
		String sqlQuery = "SELECT * FROM PRODUCTS";

		List<Product> products = jdbcTemplate.query(sqlQuery, new ProductRowMapper());

		return products;
	}

}

class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int arg1) throws SQLException {

		Product product = new Product();

		product.setId(rs.getInt("id"));
		product.setName(rs.getString("name"));
		product.setPrice(rs.getFloat("price"));
		product.setDescription(rs.getString("description"));

		return product;
	}

}