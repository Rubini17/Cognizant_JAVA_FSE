package ecommerce;

import java.util.*;

public class Search {

	 public static Product linearSearch(Product[] products, String targetName) {
	        for (Product product : products) {
	            if (product.productName.equalsIgnoreCase(targetName)) {
	                return product;
	            }
	        }
	        return null;
	    }
	 
	 public static Product binarySearch(Product[] products, String targetName) {
	        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

	        int low = 0;
	        int high = products.length - 1;

	        while (low <= high) {
	            int mid = (low + high) / 2;
	            int result = targetName.compareToIgnoreCase(products[mid].productName);

	            if (result == 0) return products[mid];
	            else if (result < 0) high = mid - 1;
	            else low = mid + 1;
	        }

	        return null;
	    }
}
