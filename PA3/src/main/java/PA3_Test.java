/**
 *
 *  This is a test program. Please do not change the code.
 *  CS200 Algorithms and Data Structures 
 *  Colorado State University
 *  Spring 2013
 *  
*/


public class PA3_Test {


    public static void main(String [] args){
	Encoder en = new Encoder(args[0]);
       	HuffmanFrequencyTable freqTable = en.getFreqTable();

	// printing the frequency table
	System.out.println("======================================");
	System.out.println(" char       frequency       code");
	System.out.println("--------------------------------------");
	for(int i = 0; i < freqTable.size(); i++){
	    System.out.println("  "+ freqTable.getItem(i).getInputChar()+"           "+
			       freqTable.getItem(i).getFreq()+"             "+freqTable.getItem(i).getCode());
	}
	System.out.println("======================================");

	
	System.out.println("\n\n"+"Encoded bit stream");
	System.out.println(en.encodeString());
	System.out.println("Total number of bits without Huffman coding: "+args[0].length()*16);
	System.out.println("Total number of bits with Huffman coding: "+en.encodeString().length());
	
        
	Decoder de = new Decoder(en.getHuffmanTree(), en.encodeString());
	System.out.println("\n\nDecoded String: "+de.decode());
	
	
    }

      
}

