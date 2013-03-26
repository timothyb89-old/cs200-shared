/**
 * TableItem.java
 *
 * TableItem is the object describing the items stored in the Huffman Frequency Table.
 * It contains,
 * 1. character
 * 2. frequency
 * 3. bit code 
 *
 * Please note that bit code is stored as a String object. You DO NOT need to do
 * any bit operation for PA3.
 *
 * Complete imple
 */

public class TableItem{
    private char inputChar;
    private int freq;
    private String code;
    public TableItem(char _inputChar, int _freq){
	inputChar = _inputChar;
	freq = _freq;
    }
    public char getInputChar(){
	return inputChar;
    }
    public int getFreq(){
	return freq;
    }

    public String getCode(){
	return code;
    }
    public void setFreq(int _freq){
	freq = _freq;
    }
    public void setCode(String _code){
	code = _code;
    }


}