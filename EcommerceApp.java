package com.ECommerce;

import java.util.*;

public class EcommerceApp {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
			ProductService service = new ProductService();

			Cart cart = new Cart();

			List<Product> products = service.getAllProducts();

			while(true){

			    System.out.println("\n1.View Products");
			    System.out.println("2.Add to Cart");
			    System.out.println("3.Remove Item");
			    System.out.println("4.View Cart");
			    System.out.println("5.Checkout");
			    System.out.println("6.Exit");

			    int choice = sc.nextInt();

			    switch(choice){

			        case 1:

			            for(Product p:products){
			                p.display();
			            }

			            break;

			        case 2:

			            System.out.println("Enter Product ID:");
			            int id = sc.nextInt();

			            for(Product p:products){

			                if(p.id == id){
			                    cart.add(p);
			                }
			            }

			            break;

			        case 3:

			            System.out.println("Enter Product ID:");
			            int removeId = sc.nextInt();
			            cart.remove(removeId);

			            break;

			        case 4:

			            cart.viewCart();

			            break;

			        case 5:

			            cart.checkout();

			            break;

			        case 6:

			            System.exit(0);
			    }
			}
		}
    }
}