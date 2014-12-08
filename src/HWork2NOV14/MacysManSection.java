package HWork2NOV14;

public class MacysManSection {
	String shirtType;
	int shirtPrice;
	int nunberOfShirtSold;
	double avgPrice;


public void armany(String shirtType){
	this.shirtType = shirtType;
   System.out.println("This is Armany Brand Shirt is " + shirtType + "Its price is" + shirtPrice);
	
}
public void bananaRepublic(int nunberOfShirtSold,double avgPrice){
	this.nunberOfShirtSold = nunberOfShirtSold;
	this.avgPrice =avgPrice ; 
	System.out.println(" The number of shirt sold is" + nunberOfShirtSold);
	System.out.println("Those shirts average price is " + avgPrice);
}
public void kelvinKlein(String shirtType,	int shirtPrice){
	this.shirtType=shirtType;
	this.shirtPrice=shirtPrice;
	System.out.println("These are kelvinKlein Shirts "+ shirtType);
	System.out.println("These shirts' price are " + shirtPrice );
}
public void express(int nunberOfShirtSold){
	System.out.println("How many Shirts are sold "+ nunberOfShirtSold);
}
public double revenue(){
	double totalrevenue = 0;
	totalrevenue = avgPrice*nunberOfShirtSold;
	return totalrevenue;
	
}
}
