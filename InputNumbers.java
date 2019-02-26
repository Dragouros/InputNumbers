package com.Luigi;

import java.util.*;

public class InputNumbers {
	
	public static void CountNumbers(ArrayList<Integer> Numbers) {
		Set<Integer> Final = new HashSet<Integer>(Numbers);
		for(Integer i : Final) {
			if(Collections.frequency(Numbers, i) > 1) {
				System.out.println("Number " + i + " repeated: " + Collections.frequency(Numbers, i));
			}
		}	
	}
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    ArrayList<Integer> Count = new ArrayList<Integer>();
	    System.out.println("Enter the numbers: ");
	    System.out.println("Enter a character to exit.");
 	    while(scan.hasNextInt()){
	         Count.add(scan.nextInt());
	    }
		CountNumbers(Count);
	}
}
