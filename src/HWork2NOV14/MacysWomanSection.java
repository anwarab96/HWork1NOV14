package HWork2NOV14;

public class MacysWomanSection {
	private String handBags;
	private int price;
	private String accessories;
	private int numzOfHats;
	private String dressess;
	public String getHandBags(){
		return handBags;
	}
	public String getDressess(){
		return dressess;
	}
	public void setPrice(int sale, double percentage){
		if(sale<15){
			System.out.println("This is excellent price");
		}else
			System.out.println("The price is ok");
	}
	public int getPrice(){
		return price;
	}
	public int getNumberOfHats(int totalHats){
		return totalHats;
	}
	public String getaccessories(){
		return accessories;
	}
	
	

}
