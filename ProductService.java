package com.ECommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

	
	public List<Product> getAllProducts(){
		
		List<Product> list= new ArrayList<>();
		
		try(Connection con= DBConnection.getConnection()){
			
			String query="SELECT * FROM products";
			
			PreparedStatement ps= con.prepareStatement(query);
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				Product p= new Product(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getDouble("price"));
			
			
			list.add(p);
			
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
		
		
	}
}
