package com.greatlearning.service;

public class NotesCount {
 
	 public void NotesCountImplementation(int notes[], int amount) {
		 
		  int[] NoteCounter = new int[notes.length];
		  
		  try {
			   for(int i = 0; i < notes.length; i++) {
				   if (amount >= notes[i]) {
					   NoteCounter[i] = amount / notes[i];
					   amount = amount - NoteCounter * Notes[i];
					   
					   
				   }
			   }
			   
			   if (amount > 0) {
				   System.out.println("exact amount cannot be given with the highest denomina");
			   }else {
				   System.out.println("Your payment approach  in order to give min no of notes");
				   
				   for(int i = 0; i < notes.length; i++) {
					   if (NoteCounter[] !=0) {
						    System.out.println(notes[i] +":" + NoteCounter[i]);
					   }
				   }
			   }
		  }
		  catch (ArithmeticException e) {
			  System.out.println("notes of denomination 0 is invalid");
		  }
		  
	 }
	 
}
