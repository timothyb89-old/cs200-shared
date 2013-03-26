/**
 *
    Huffman frequency table

    This class creates and maintains a table. 
    For example for a string "AAAABBCCC"
    ========================================
    char         frequency        Code
    ----------------------------------------
     A               4             1
     B               2            11 
     C               3            10
    ========================================

    Code is created by Huffman coding algorithm
    Please note that the code is stored as a String object.
*/

import java.util.LinkedList;

public class HuffmanFrequencyTable {
    LinkedList<TableItem> table; // you can use other data structures
    String inputStr = "";
    // if you need more member property, please add here


    // Constructor
    public HuffmanFrequencyTable(String _inputStr){
		inputStr = _inputStr;
		table = new LinkedList<TableItem>();
		this.initTable();
    }

    // reads input String and fill the columes of char and frequency
    private void initTable(){
		// add your code here
    }
    
    // returns the size of this table
    public int size(){
		// add your code here
    }


    // returns the associated character for the specified code
    public char getChar(String code){
		// add your code here
    }

    // returns the associated code for the specified character 
    public String getCode(char inputChar){
		// add your code here
    }

    // returns index'th item of this table
    public TableItem getItem(int index){
		// add your code here
    }


    // stores a new code in the item that has same charactor specified in the inputChar
    public void setCode(char inputChar, String newCode){
		// add your code here
    }


    // you can add main() for your unit testing


}