package ecommerce;

public class Test {

	public static void main(String[] args) {
		
		  Product[] products = {
		            new Product(1, "Laptop", "Electronics"),
		            new Product(2, "Phone", "Electronics"),
		            new Product(3, "T-shirt", "Clothing"),
		            new Product(4, "Book", "Stationery"),
		            new Product(5, "Chair", "Furniture"),
		            new Product(6, "Spoon" ,"Crokery"),
		            new Product(7, "Blue-Jeans" , "Clothing")
		        };
		
		  String target = "Book";
		  
		  Product LinearRes = Search.linearSearch(products , target);
		  Product BinaryRes = Search.binarySearch(products, target);
		  
		  if(LinearRes!= null) {
			  System.out.println("Linear Search result is :" + LinearRes);
		  }
		  else {
			  System.out.println("Linear Search result is : Product not Found ");
		  }
		  
		  if(BinaryRes!= null) {
			  System.out.println("Binary Search result is :" + BinaryRes);
		  }
		  else {
			  System.out.println("Binary Search result is : Product not Found ");
		  }
	}

}
