import java.util.*;
public class Product_Details {
	
	String code;
	int price;
	int quantity;
	String name;
	
	ArrayList<String> l1 = new ArrayList<String>();
	
	Scanner sc1 = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	Scanner sc3 = new Scanner(System.in);
	

	public void Initialize(String cd)
	{
		code = cd;
		System.out.print("\n\t Please input the name of the product: ");
		name = sc1.nextLine();
		System.out.print("\n\t Please input value of each product: ");
		quantity = sc3.nextInt();
		System.out.print("\n\t Please input the quantity of the product: ");
		price = sc2.nextInt();
		System.out.print("\n\t Producing autogenerated key: "+ code);
		l1.add(name);
		l1.add(Integer.toString(quantity));
		l1.add(Integer.toString(price));
	}
}
