package com.scg.setdemo;
import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		 //Creating HashSet and adding elements  
	    HashSet<String> set=new HashSet(); 
	          int a=10;
	           set.add("One");    
	           set.add("Two");    
	           set.add("Three");   
	           set.add("Four");  
	           set.add("Five");  
	           Iterator <String> i=set.iterator();  
	           while(i.hasNext())  
	           {  
	           System.out.println(i.next());  
	           }  
	 }  
	 

	}


