package HWork1NOV14;

public class House {

	public static void main(String[] args) {
	
		Apartment apt = new Apartment();
		apt.management();
		int rentee = apt.getRentee(150, 100, 250);
		System.out.println("The total rentee is " + rentee);
		apt.supervise();
		BoardingHouse brh = new BoardingHouse();
		brh.HouseMaster();
		int allstuff= brh.stuff(150, 20);
		System.out.println("The total stuff is " + allstuff );
		PrivateHouse pvh= new PrivateHouse();
		String garden=pvh.getGarden("Rose garden");
		System.out.println(garden);
		pvh.Ownership();
		int  member = pvh.familyMember(2, 6);
		System.out.println("The total family member is " + member);
		
	}

}
