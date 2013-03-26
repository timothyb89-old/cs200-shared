/**
 *
   Decoder takes encoded bit sequence and convert it to a String.
   Huffman Tree is passed as arguments of the constructor.

   Decoding process
   1. Start from the root of the Huffman Tree
   2. Start from the first bit of the bit sequence
   3. If the bit is 0 follow the left child
   4. If the bit is 1 follow the right child
   5. If a leaf node is reached, track the path from the root and convert the bit string
      to a charactor accordingly by looking up the frequency table.
   6. Repeat step 1 ~ 5 until there is no bit item existing in the bit sequence    
 
 */

public class Decoder {
    HuffmanTree ht;
    String encodedbits;

    // Constructor: to decode the bit string, you need
    // 1. the Huffman tree used for the encoding
    // 2. the Huffman Frequency Table used for the encoding
    public Decoder(HuffmanTree _ht, String _encodedbits){
	    ht = _ht;
	    encodedbits = _encodedbits;
    }


    // Decode the encodedbits bit seqence and return the result
    // if the bit sequence was "10111" and "101" is "A"'s Huffman Code and "11" is "B"'s
    // Hufman code, this method should return a String "AB"

    public String decode(){
	// add your code here.

    }
      
}

