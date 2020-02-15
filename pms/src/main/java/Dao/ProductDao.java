package Dao;

import java.util.List;

import Exception.ProductException;
import bean.Product;


public interface ProductDao {

	public int addProduct(Product product) throws ProductException;
	public Product deleteProductById(int ProductId) throws ProductException;
	public List<Product> findAllProduct()throws ProductException;
}
