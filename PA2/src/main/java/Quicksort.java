
/**
 * CS 200 Colorado State University, Spring 2013 This class implements the
 * quicksort algorithm for any Comparable objects Please pick an item in the
 * middle of array as the pivot For example, if your array, a[] has n items, and
 * your lo is 0 and your hi is n-1, a[(n-1-0)/2] should be the first pivot item
 * to be picked.
 *
 */
import java.io.*;
import java.util.*;

public class Quicksort {

	public Quicksort() {
	}

	public void sort(Comparable[] a) {
		// can't sort a null / single element / empty list
		if (a == null || a.length <= 1) {
			return;
		}
		
		sort(a, 0, a.length - 1);
	}

	// quicksort the subarray from a[lo] to a[hi]
	public void sort(Comparable[] a, int lo, int hi) {
		if (lo >= hi) {
			return;
		}

		int pivot = partition(a, lo, hi);

		sort(a, lo, pivot - 1);
		sort(a, pivot + 1, hi);
	}

	// partition the subarray a[lo .. hi] by returning an index j
	// so that a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
	public int partition(Comparable[] a, int lo, int hi) {
		int pivotIndex = lo + ((hi - 1) - lo) / 2;
		Comparable pivotValue = a[pivotIndex];

		// move the pivot to the end - we need to skip over it in order to
		// sort properly
		swap(a, pivotIndex, hi);

		int l = lo;

		// iterate over each element, skipping the last (temporary pivot)
		for (int i = lo; i <= hi - 1; i++) {

			// if the element at i is less than the pivot value, swap it
			if (a[i].compareTo(pivotValue) < 0) {
				swap(a, i, l);
				l++;
			}
		}

		// put the pivot back at the right position
		swap(a, l, hi);

		// return the new pivot index
		return l;
	}

	private void swap(Comparable[] array, int a, int b) {
		Comparable aVal = array[a];
		Comparable bVal = array[b];

		array[a] = bVal;
		array[b] = aVal;
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
	public void quicksortToFile(String file_input, String file_output) {
		Comparable[] words = storeInput(file_input);

		sort(words);

		writeOut(file_output, words);
	}

	public Comparable[] storeInput(String file_input) {
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(new File(file_input));
			
			// linked list for fast adding - we'll convert to an array later
			List<String> ret = new LinkedList<String>();

			while (fileScanner.hasNextLine()) {
				ret.add(fileScanner.nextLine());
			}
			fileScanner.close();

			return ret.toArray(new String[0]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	private void writeOut(String file_output, Comparable[] store) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(new File(file_output)));
			for (int i = 0; i < store.length; i++) {
				out.write(store[i] + "\n");
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
