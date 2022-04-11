package com.greatlearning.java;

     import java.util.Arrays;
     import java.util.Scanner;
     
     import com.greatlearning.java.MergeSortTmplementation;
     import com.greatlearning.java.NotesCount;


public class Main {

	public static void main(String[] args) {
	
    System.out.println("enter the sixe of  currency denominations ");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    System.out.println("enter the currency denominations value");
    
    for(int i = 0;i < size; i++) {
    	notes[i] = sc.nextInt();
    }
      System.out.println("enter the amount you want to pay");
      int amount = sc.nextInt();
      MergeSortImplementation.sort(notes,0,notes.length-1);
      NotesCount.NotesCountImplementation(notes, amount);
	}
	

}
