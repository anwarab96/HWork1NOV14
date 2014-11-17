package HWork1NOV14;

public class PrivateHouse {
	String  garden = "Rose garden ";
	public void Ownership(){
		System.out.println("Owner own the private house");
	}
	public String getGarden(String garden){
		this.garden= garden;
		return garden;
	}
	public int familyMember(int parents, int kids){
		int total = 0;
		total = parents + kids;
		return total;
	}

}
