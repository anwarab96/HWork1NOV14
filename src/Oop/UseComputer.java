package Oop;

public class UseComputer {
	public static void main(String[] args){
	Computer computer = new DesktopComputer();
	computer.research();
	ElectronicsDevice device = new DesktopComputer();
	device.buildOnTransistor();
	DesktopComputer pc = new DesktopComputer();
	pc.buildOnTransistor();
	pc.runByElectron();
	
}
}
