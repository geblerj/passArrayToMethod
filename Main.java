package com.james;

class Main {
	
  public static void main(String[] args) {
    String[] friends = {"Samson", "Rodrigo", "Elmer", "Eugene"};
    printNames(friends);
  }
  
  public static void printNames(String[] names) {
  	try {
	  	for (int i = 0; i < names.length; i++) {
	  		System.out.println(names[i]);
	  	}
  	} catch (Exception e) {
  		System.out.println("ERROR: " + e.getMessage() + ". Stack trace " + e.getStackTrace());
  	}
  	
  }
}
