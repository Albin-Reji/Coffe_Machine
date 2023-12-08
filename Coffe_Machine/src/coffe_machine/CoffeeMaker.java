package coffe_machine;
import java.util.ArrayList;
import java.util.HashMap;

import coffe_machine.MenuItem;
import coffe_machine.MenuItem.Menu;

public class CoffeeMaker {
	
	private HashMap<String, Integer> resources;
	
	public CoffeeMaker() {
		this.resources=new HashMap<>();
		resources.put("water", 500);
		resources.put("milk",500 );
		resources.put("coffee",100 );
	}
//	available items
	public void report() {
		System.out.println("Water: " + resources.get("water") + "ml");
		System.out.println("Milk: " + resources.get("milk") + "ml");
        System.out.println("Coffee: " + resources.get("coffee") + "g");
	}
//	is resources sufficient 
	public  boolean is_resource_sufficient(MenuItem drink) {
		boolean can_make=true;
		for(String item : drink.getIngredients().keySet()) {
			if(drink.getIngredients().get(item)>resources.get(item)) {
				can_make=false;
			}
		}
			
		return can_make;
	}
//	make coffee order
	public void  make_coffee(MenuItem order) {
		if(is_resource_sufficient(Menu.menu.get(0))) {
			for (String item : order.getIngredients().keySet()) {
				System.out.println(item);
				System.out.println(resources.get(item));
		        System.out.println((order.getIngredients().get(item)));
	            resources.put(item, (int) (resources.get(item) - order.getIngredients().get(item)));
	            System.out.println(resources.get(item));
	        }
			
	        System.out.println("Here is your " + order.getName() + " ☕️. Enjoy!");
		}
	}
	
	public static void main(String args[]) {
		CoffeeMaker coffe_maker=new CoffeeMaker();
//		boolean istrue=is_resource_sufficient(Menu.menu.get(0));
//		System.out.println(istrue);
		
		coffe_maker.make_coffee(Menu.menu.get(0));
	}
}
