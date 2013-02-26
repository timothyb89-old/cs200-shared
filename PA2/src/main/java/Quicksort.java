/**
 * CS 200 Colorado State University, Spring 2013
 * This class implements the quicksort algorithm for 
 * any Comparable objects
 * Please pick an item in the middle of array as the pivot
 * For example, if your array, a[] has n items, and your lo is 0
 * and your hi is n-1, a[(n-1-0)/2] should be the first pivot
 * item to be picked.
 *
 */

import java.io.*;
import java.util.*;

public class Quicksort {
    public Quicksort(){
    }

    public void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    // quicksort the subarray from a[lo] to a[hi]
    private void sort(Comparable[] a, int lo, int hi) {
	// complete your method here
    }

    // partition the subarray a[lo .. hi] by returning an index j
    // so that a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
    private int partition(Comparable[] a, int lo, int hi) {
	// complete your method here
    }

	
    // sort data from a file and store them to a file
    // useful classes:
    // java.io.BufferedReader
    // java.io.DataInputStream
    // java.io.FileInputStream
    // java.io.FileWriter
    // java.io.BufferedWriter 
	//
	// In the output data file, you should write only one word per line. 
	// To separate lines, use a linefeed charactor, "\n" at the end of the line.
    public void quicksortToFile(String file_input, String file_output){
	// complete your method here
    }


}


