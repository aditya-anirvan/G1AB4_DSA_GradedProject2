package com.greatlearning.testing;

import java.io.IOException;
import java.util.*;

import com.greatlearning.floors.AssembleFloor;
public class TestingAssembleFloors {
	public static void main(String[] args) {
System.out.println("enter total floors in building:");
        
        Scanner sc= new Scanner(System.in);
    final int n=sc.nextInt();
        
        Integer[] l= new Integer[n];
        for (int i=0; i<n;i++) {
        	System.out.println("floor size on day "+ (i+1));
        	int j = sc.nextInt();
        	l[i]=j;
        }
        AssembleFloor.assembleFloors(l,l.length);
        sc.close();
	}

}
