package com.scg.setdemo;
import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		 
		Set<String> hs = new HashSet<String>();
		 
        // Elements are added using add() method
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("B");
        hs.add("D");
        hs.add("E");
 
        System.out.println("Initial HashSet :" + hs);
 
        // Removing the element b
        hs.remove("B");
 
        System.out.println("After removing element B :" + hs);
        
     // Iterating though the Set
        for (String value : hs)
            System.out.print(value + ", ");
        System.out.println();
    }

	}


