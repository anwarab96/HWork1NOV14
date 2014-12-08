package dataStructur;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
	Queue<String> que = new LinkedList<String>();
	que.add("Bangladesh");
	que.add("India");

	que.add("Srilanka");

	que.add("Singapur");

	que.add("Canada");

	que.add("Bangladesh");
	System.out.println(que.size());
	System.out.println(que.peek());
	System.out.println(que.poll());
	for(String st: que){
		System.out.println(st);
	}

	}

}
