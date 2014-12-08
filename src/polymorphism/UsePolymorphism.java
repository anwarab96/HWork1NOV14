package polymorphism;

public class UsePolymorphism {
public static void main(String[] args){
	Shape shape = new Shape();
	int size = shape.areOfLand(10, 20, 30);
	System.out.println(size);
	int rectangleSize = shape.areOfLand(10, 15, 20, 25);
	int pentagoneSeze = shape.areOfLand(10, 20, 15, 25, 30);
	ModernScale scale = new ModernScale();
	
}
}
