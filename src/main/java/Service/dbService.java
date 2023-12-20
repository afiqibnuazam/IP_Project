package Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import Entity.Product;

@Service
public class dbService {

	//static list for sample product
	private static List <Product> productlist = new ArrayList <Product> (Arrays.asList(
			
		new Product("Shampoo", 10.50),
		new Product("Biscuit", 15.75),
		new Product("Cocomilk", 12.99),
		new Product("Ramen Noodle", 12.99),
		new Product("prod etc", 30.75)));
}
