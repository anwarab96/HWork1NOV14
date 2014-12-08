package HWork2NOV14;

public class MacysCookingSection {
	 String utensils;
	 double discount;
	 String model;
	 String electronicBlender;
	 int nuberOfCookingPots;
	 int numberOfSoldItems;
	 public void cookinUtensils(String model){
		 System.out.println("Macy's sell high quality model utensil "+ model );
	 }
	 public void electronicDevices(String electronicBlender,int numberOfSoldItems){
		 System.out.println("Macy has strong electronic Blenders "+  electronicBlender);
		 System.out.println(" The number of perday sold Blenders are " + numberOfSoldItems);
	 }
	 public double holidaySale(double discount){
		 double regularPrice=0;
		 double salePrice = (100% regularPrice - 15% regularPrice);
		 System.out.println("Macy's has vateranday sale price" + salePrice);
		 return salePrice;
	 }
	 public void bestCookingItems(){
		 
	 }
	 }