/**
 * CS 200 Colorado State University, Spring 2013
 * This class builds a list of candidate words those
 * can be the final outputs if the user completes the
 * specified word.
 *
 */
import java.io.*;
import java.util.*;

public class Autocomplete {
    // this is a constructor of this class.
    public Autocomplete(){
    } 

    // listCandidates will generate a list of the candidnate words.
    // (1) data_file is the location of the input data file. 
    // Students should be able to find an example input data file from
    // ./Words.txt 
    // Words.txt contains around 20,000 unsorted words.
    // During the grading, Words.txt file will be stored in the same 
    // directory.
    // (2) max_count is the maxinum number of words returned by this method
    // If you cannot find enough candidates, please fill the array
    // as much as possible and return it.
    // If you could find more than max_count, please return only as many as
    // max_count.
    // (3) inputString is the specified string that user is working on.
    // inputString can contain uppercase and lower case alphabet. (no number or sign)
    // Your method should not be case-sensitive.
    //
    // To complete this method, 
    // Step 1: read data from data_file
    // Step 2: sort them with the quicksort method
    // Step 3: find the list and return it
    public String [] listCandidates(String data_file, int max_count, String inputString){	     
	// Complete your method
    }

}