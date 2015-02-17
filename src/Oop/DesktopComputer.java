package Oop;

public class DesktopComputer extends ElectronicsDevice implements Computer{
//this method from ElectronicsDevice class
	public void buildOnTransistor(){
		System.out.println("Intel is building transistor");
	}
	//this methods are coming from Computer Interface
	public void doMath(){
		System.out.println("Computer can calculate, can do addition, subtraction");	
}
	public void research(){
		System.out.println("Can research Science");
	}
	public int memeorySize(){
		int size = 5;
		System.out.println();
		return size;
	}
	//This method is belongs to this class 
	public void CPU(){
		System.out.println("it has CPU");
	}
	@Override
	public int memorySize() {
		
		return 0;
	}
}
