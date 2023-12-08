package coffe_machine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MenuItem {
    private String name;
    private float water;
    private float milk;
    private float coffee;
    private float cost;
    private HashMap<String, Float> ingredients;

    // Constructor
    public MenuItem(String name, float water, float milk, float coffee, float cost) {
        this.name = name;
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.cost = cost;

        // Initialize ingredients HashMap
        this.ingredients = new HashMap<>();
        this.ingredients.put("water", water);
        this.ingredients.put("milk", milk);
        this.ingredients.put("coffee", coffee);
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public float getWater() {
        return water;
    }

    public float getMilk() {
        return milk;
    }

    public float getCoffee() {
        return coffee;
    }

    public HashMap<String, Float> getIngredients() {
        return ingredients;
    }

   class Menu {
        public static List<MenuItem> menu;

        static {
            menu = new ArrayList<>();
            menu.add(new MenuItem("latte", 200, 150, 24, (float) 2.5));
            menu.add(new MenuItem("espresso", 50, 0, 18, (float) 1.5));
            menu.add(new MenuItem("cappuccino", 250, 50, 24, 3));
        }

        public static ArrayList<MenuItem> printIngredients() {
        	ArrayList<MenuItem> all_ingredients=new ArrayList<>();
            for (MenuItem item : menu) {
                all_ingredients.add(item);
            }
            return all_ingredients;
        }
//        get all item names
        public static ArrayList<String> getItems() {
        	ArrayList<String> item_list=new ArrayList<>();
        	for(MenuItem item:menu) {
        		item_list.add(item.getName());
        	}
        	return item_list;
        	
        }
//        find the drink
        public static String find_drink(String order_name) {
        	for(MenuItem item:menu) {
        		if(item.getName().toLowerCase().equals(order_name.toLowerCase())) {
        			return "your order "+item.getName()+" is available";
        		}
        	}
        	return "Sorry item is not avilable";
		}
    }

    public static void main(String[] args) {
//       String res=Menu.find_drink("LaTte");
//       System.out.println(res);
    	
//    	ArrayList<MenuItem> res=Menu.printIngredients();
//    	for(MenuItem item:res) {
//    		System.out.println(item);
//    	}
    	
    	ArrayList<String> res=Menu.getItems();
    	for(String item:res) {
    		System.out.println(item);
    	}
        
    }
}
