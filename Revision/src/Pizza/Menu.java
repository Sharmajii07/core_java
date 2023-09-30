package Pizza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

class pizza_shop{
		public pizza_shop() {
			System.out.println("Welcome to our shop.....");
			System.out.println("What you want to order....");	
		}
		
		
		public void pizzaMenu() {
			System.out.println("*......*......*");
			
			List<String> pizzaList = new ArrayList<String>();
				pizzaList.add(" Margherita Pizza");
				pizzaList.add(" Double cheesy Margherita Pizza");
				pizzaList.add(" 7 cheesy Pizza");
				pizzaList.add(" Paneer Tandoori Pizza");
				pizzaList.add(" Golden Corn Pizza");
				pizzaList.add(" Red paprica Pizza");
				pizzaList.add(" The True Italian Pizza");
				pizzaList.add(" Farmhouse Pizza");
				pizzaList.add(" Pepperoni Pizza");
								for(String p1 : pizzaList) {
					
					System.out.println(p1);
				}	
		}
		
		
				
		public void chineseMenu() {
			
			
			System.out.println("*......*......*");
			System.out.println("Please Select from chinese menu........");
	

				
			List<String> chineseList = new ArrayList<String>();
				chineseList.add(" Hakka Noodles");
				chineseList.add(" Manchurian Noodles");
				chineseList.add(" Dry Manchurian");
				chineseList.add(" Manchurian Gravy");
				chineseList.add(" Manchurian Bhel");
				chineseList.add(" Rice Manchurian");
				chineseList.add(" Traffic Jam");
				
				for(String c1 : chineseList) {
					System.out.println(c1);
				}
				
				
			System.out.println("*......*......*");
			
		
		
}
}

public class Menu {
	
			public static void main(String[] args) {
				pizza_shop ps = new pizza_shop();
				ps.pizzaMenu();
				ps.chineseMenu();
			}

}
