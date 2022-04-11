package com.greatlearning.service;

public class MergeSortImplementation {
     private static String[] arrs;
	void merge(int arr[],int left,int mid,int right) {
    	 int len1 = mid-left+1;
    	 int len2=right-mid;
    	 
    	 int leftArr[]=new int[len1];
    	 int rightArr[]=new int[len2];
    	 
    	 for(int i = 0; i<len1; i++) {
    		 leftArr[i]=arr[left+i];
    		 for(int j = 0; j<len2; j++) {
    			 rightArr[j]=arr[mid+1+j];
    			 
    		 }
    			 
    	 }
    	 int i,j,k;
    	 i=0;
    	 j=0;
    	 k=left;
    	 
    	 while(i<len1 && j<len2){
    		 if(leftArr[i] <= rightArr[j]) {
    			 arr[k]=leftArr[i];
    			 i++;
    		 }else {
    			 arr[k]=rightArr[j];
    			 j++;
    			 
    		 }
    		 k++;
    		
    	 
    		 
    	 }
    	 
    	
    	 while(i<len1) {
    		 arr[k]=leftArr[i];
    		 i++;
    		 k++;
    		 
    	 }
    	 while(j<len2) {
    		 arr[k]=rightArr[j];
    		 j++;
    		 k++;
    		 
    	 }
    	 void MergeSort(int arr1[] , int left1, int right1) {
    		 if(left1<right1) {
    			 int mid1 = (left1+right1)/2;
    			  MergeSort(arr1,left1,mid1);
    			  MergeSort(arr1,mid1+1,right1);
    			  MergeSort(arr1,left1,mid1);

    		 }
    	 }
    	 static void display(int arr1[]) {
    		 int n = arr1.length;
    		 for (int i1 =0; i1<n;++i1) {
    			 int i = 0;
				arrs = null;
				System.out.println(arrs[i]+" ");
    			 System.out.println();
    			 
    			 
    		 }
    	 }
     }

	
