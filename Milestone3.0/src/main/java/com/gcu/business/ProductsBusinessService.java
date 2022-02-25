package com.gcu.business;

import java.util.ArrayList; 
import java.util.List;

import com.gcu.model.OrderModel;
import com.gcu.model.ProductsModel;

public class ProductsBusinessService implements ProductsBusinessServiceInterface
{
	public List<ProductsModel> getProducts(ProductsModel productsModel) 
	{
		// Create some products
		List<ProductsModel> products = new ArrayList<ProductsModel>();
		products.add(new ProductsModel(productsModel.getJpgImage(), productsModel.getTapeMeasureLength(), productsModel.getTMMU(), productsModel.getTapeWeight(), productsModel.getTapeDescription()));
		
		// Return the list of products 
		return products;
	}
}
