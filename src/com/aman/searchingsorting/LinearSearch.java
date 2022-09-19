package com.aman.searchingsorting;

import java.util.Scanner;

public class LinearSearch {
int numberOfElements;
int array[]= {};
Scanner sc = new Scanner(System.in);
int searchElement;



	 

public void implementationOfLinearSearch() {

insertValues();

printValues();
System.out.print("Enter the element you want to search ");
searchElement = sc.nextInt();

 

searchValue(searchElement);

}

 

public void insertValues() {
System.out.println("Enter the number of elements of the array");
int length = sc.nextInt();
array = new int[length];
for(int i = 0; i<length;i++) {
	System.out.print("Enter the element to store in array");
	array[i] = sc.nextInt();
}
}

 

public void printValues() {
	System.out.print("Element stored in array are ");

	for(int i = 0; i<array.length; i++) {
		System.out.print(array[i]);
	}

}

 

public void searchValue(int value) {

	for(int i = 0; i<array.length; i++) {
		if(array[i] == value)
		{
			System.out.print("List contains the element "+value + " at position "+i);
		}
	}

}

 

public static void main(String[] args) {

 

LinearSearch linearsearch = new LinearSearch();

linearsearch.implementationOfLinearSearch();

}

}
