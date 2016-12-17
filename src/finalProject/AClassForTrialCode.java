package finalProject;

public class AClassForTrialCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Drinks
		// Coffee objects
		Coffee coffee1 = new Coffee("Starbucks Frapachino", 4.25, 3, 14, 40);
		
		// Juice objects
		Juice juice1 = new Juice("Apple", 2.25, 5, 16, "Fruit Juice");
		Juice j = new Juice("Orange", 2.25, 1, 20, "Fruit Juice");
		
		// Milk object 
		Milk milk1 = new Milk("Horizon Vanilla", 3.55, 3, 12, 4);
		
		// Soda object
		Soda soda1 = new Soda("Coke", 2.25, 6, 20, 180);
		
		// Water object
		Water water1 = new Water("Ice Water", 2.00, 4, 15, "Strawberry");
		
		// Coffee print
		System.out.println(coffee1.toString() + "\n");
		
		// Juice prints
		System.out.println(juice1.toString() + "\n");
		System.out.println(j.toString() + "\n");
		
		// Milk Print
		System.out.println(milk1.toString() + "\n");
		
		// Soda Print
		System.out.println(soda1.toString() + "\n");
		
		// Water Print
		System.out.println(water1.toString() + "\n");
		
// Snacks    String name, double price, int quantity, int nutritionRating
		// Candy object
		Candy candy1 = new Candy("Snickers", 1.69, 2, 4, 1);
		
		// Chips object
		Chips chips1 = new Chips("Daritos: Nacho", 1.25, 4, 15, 1);
		
		// Fruit object
		Fruit fruit1 = new Fruit("Green Apple", .99, 3, 89, "Whole Fruit");
		
		// Gum object
		Gum gum1 = new Gum("Orbit: Mint", 1.79, 12, 2, 18);
		
		// Sandwich object
		Sandwich sandwich1 = new Sandwich("Black Forest Ham", 3.50, 2, 78, "6 inch");
		
		// Candy print
		System.out.println(candy1.toString() + "\n");
		
		// Chips print
		System.out.println(chips1.toString() + "\n");
		
		// Fruit print
		System.out.println(fruit1.toString() + "\n");
		
		// Gum print
		System.out.println(gum1.toString() + "\n");
		
		// Sandwich print
		System.out.println(sandwich1.toString() + "\n");
	}
}
