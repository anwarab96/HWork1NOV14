package HWork1NOV14;

public class Apartment {
	
	public void management(){
		String  rights="All kind of contract are reserved by landlord";
		System.out.println(rights);
	}
	public int getRentee(int men,int women, int children){
		int total=0;
		total = men + women + children;
		return total;
	}
	public void supervise(){
	 System.out.println("Super supervise the the maintainence");
	}

}
