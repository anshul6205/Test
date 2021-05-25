package LinkedList;

import java.util.ArrayList;

public class GroceryList {
	
	public static ArrayList<String> Grocerylist = new ArrayList<String>();
	
	public static void addgroceryItem(String item) {
		Grocerylist.add(item);
	}
	
	public void printGroceryList() {
		System.out.println("You have " + Grocerylist.size() +  " items in your grocery List");
		for(int i=0; i<Grocerylist.size();i++) {
			System.out.println((i+1) + "." + Grocerylist.get(i));
		}
	}
	
	public void modifyGroceryItem(int position, String newItem) {
		Grocerylist.set(position, newItem);
		System.out.println("Grocery Item" + (position+1) + "has been modified");
	}
	
	public void removeGroceryItem(int position) {
		String theItem = Grocerylist.get(position);
		Grocerylist.remove(position);
	}
	
	public static String FindItem(String searchItem) {
//		boolean exists = Grocerylist.contains(searchItem);
		int position = Grocerylist.indexOf(searchItem);
				if(position>=0) {
					return Grocerylist.get(position);
				}
				return null;
	}
}
