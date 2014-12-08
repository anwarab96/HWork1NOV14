package dataStructur;

import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		Stack<String> stc = new Stack<String>();
		stc.add("Rose");
		stc.add("AMARANTHUS");
		stc.add("ANTHURIUM");
		stc.add("BUPLEURUM");
		stc.add("CALLA");
		stc.add("BABY'S BREATH");
		stc.add("ASTER");
		stc.add("Animone");
		System.out.println(stc.peek());
		System.out.println(stc.pop());
		System.out.println(stc.search(0));
		System.out.println(stc.empty());
		
		for(String st: stc){
			System.out.println(st);
		}
		

	}

}
