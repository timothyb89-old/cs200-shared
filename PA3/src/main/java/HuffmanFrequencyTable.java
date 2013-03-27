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

    // reads input String and fill the columns of char and frequency
    private void initTable(){
    	
    	//Keeps track of characters added so you don't add the same character twice to the table
    	LinkedList<Character> visitedChars = new LinkedList<Character>();
    	
    	for(int i = 0; i < inputStr.length();i++)
    	{
    		char currrentChar = inputStr.charAt(i);
    		
    		//If the character is not already in the table, add it (and calls count method which checks total occurances of said char)
    		if(!visitedChars.contains(currrentChar))
    			table.add(new TableItem(currrentChar,count(inputStr,currrentChar)));
    		
    		//Add char to the already added to table list so we don't add it again
    		visitedChars.add(currrentChar);
    	}
   
    }
    
    //Added method. Counts the number of occurrences of 'k', in string "input".
    private int count(String input, char k)
    {
        int numOccurences = 0;
        for (int i=0; i < input.length(); i++)
        {
            if (input.charAt(i) == k)
            	numOccurences++;
        }
        return numOccurences;
    }
    
    // returns the size of this table
    public int size(){
    	return table.size();
    }


    // returns the associated character for the specified code
    public char getChar(String code){
    	for(int i = 0; i < table.size();i++)
    		if(table.get(i).getCode() == code)
    			return table.get(i).getInputChar();

    	return ' ';

    }

    // returns the associated code for the specified character 
    public String getCode(char inputChar){
    	for(int i = 0; i < table.size();i++)
    		if(table.get(i).getInputChar() == inputChar)
    			return table.get(i).getCode();

    	return "";
    }

    // returns index'th item of this table
    public TableItem getItem(int index){
    	return table.get(index);
    }


    // stores a new code in the item that has same character specified in the inputChar
    public void setCode(char inputChar, String newCode){
		for(int i = 0; i < table.size();i++){
			if(table.get(i).getInputChar() == inputChar)
				table.get(i).setCode(newCode);	
		}
    }


    // you can add main() for your unit testing
    
    //remember to delete this main
    public static void main(String args[]){
    	HuffmanFrequencyTable hf = new HuffmanFrequencyTable("hello my name is steven");
    	for(int i = 0; i < hf.table.size();i++){
    		System.out.println(hf.table.get(i).getInputChar() + "  "+hf.table.get(i).getFreq() + "  " + hf.getCode(hf.table.get(i).getInputChar()));
    	}
    }


}