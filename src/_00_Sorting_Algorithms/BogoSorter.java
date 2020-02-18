package _00_Sorting_Algorithms;

import java.util.Random;

import javax.swing.JOptionPane;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean ordered = true;
		while(ordered) {
			int i = array.length;
			if(array[i-1] > array[i]) {
				ordered = false;
			}
			if(i < array.length) {
				System.out.println("Its sorted.");
			}
			i--;
		}
		array = swap(array);
		ordered = true;
		display.updateDisplay();
		

	}
	
	int[] swap(int[] array) {
		Random rand = new Random();
		int holder = rand.nextInt(array.length);
		int holder2 = rand.nextInt(array.length);
		int holder3 = 0;
		boolean same = true;
		while(same) {
			if(holder == holder2) {
				holder2 = rand.nextInt(array.length);
			} else {
				same = false;
			}
		}
		holder3 = array[holder];
		array[holder] = array[holder2];
		array[holder2] = holder3;
		
		return array;
		
	}
}
