package dataStructur;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) {
		 FileReader file = null;
		    try {
		        file = new FileReader("C:\\Users\\rrt\\java-selenium\\SeleniumNovember2014\\docs\\tech.txt");
		    } catch (FileNotFoundException e) {
		        System.out.println("make sure file is there");
		        e.printStackTrace();
		    }
		    BufferedReader reader = new BufferedReader(file);
		    String st;
		    try {
		        while((st = reader.readLine())!=null){
		            System.out.println(st);
		          }
		    } catch (IOException e) {
		         
		        e.printStackTrace();
		    }finally{
		        try {
		            reader.close();
		        } catch (IOException e) {
		             
		            e.printStackTrace();
		        }
		        try {
		            file.close();
		        } catch (IOException e) {
		             
		            e.printStackTrace();
		        }
		    }

	}

}
