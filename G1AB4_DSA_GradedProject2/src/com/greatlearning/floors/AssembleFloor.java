package com.greatlearning.floors;

import java.util.PriorityQueue;

public class AssembleFloor {

	public static void assembleFloors(Integer[] floorArray,int Arraylength){
		PriorityQueue<Integer> q2 = new PriorityQueue<>(java.util.Collections.reverseOrder());

        int max = Arraylength;

        for (int i = 0; i < Arraylength; i++) {

            

            q2.add(floorArray[i]);

            System.out.println("Day"+" "+(i+1) + " : ");

            while (!q2.isEmpty() && q2.peek() == max) {

                System.out.print(q2.poll() + " ");

                max--;

            }

            System.out.println();

        }
		
	}
}
