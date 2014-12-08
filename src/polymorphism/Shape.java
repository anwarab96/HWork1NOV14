package polymorphism;

public class Shape {
	public int areOfLand(int a, int b, int c){
		int total = a + b +c ;
		return total;
	}
	public int areOfLand(int a, int b, int c,int d){
		int total = a + b  + c + d;
		return total;
	}
	public int areOfLand(int a, int b, int c,int d, int x ){
		int total = a + b+ c +d  +x;
		return total;
	}
}
