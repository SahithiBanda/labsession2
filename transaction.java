package com.greatlearning.java;

  import java.util.Scanner;
  
   class transaction {

	public static void main(String[] args) throws Exception {
		
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the size of transaction array ");
     
     int size = s.nextInt();
     int arr[] = new int[size];
     
     System.out.println("Enter the value of array");
     
     for (int i = 0;i<size;i++) {
    	  arr[i] = s.nextInt();
	}
	  
     System.out.println("Enter the total no of targets that needs to be achieved");
      int targetNo = s.nextInt();
      
      while (targetNo-- != 0) {
       int flag = 0;
        long target;
        
        System.out.println("Enter the value of targer");
        target = s.nextInt();
        
        long sum = 0;
        
        for(int i = 0; i < size; i++) {
        	sum += arr[i];
           if(sum >= target) {
        	   System.out.println("Target achevied after "+(i + 1) + "transactions ");
        	   flag = 1;
        	   break;
           }
	}
	      if(flag == 0) {
	    	  System.out.println("given target is not achevied");
           }
      
	}
	}
