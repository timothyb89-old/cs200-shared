public class TestQuicksort {

    public static void main(String [] args){
	if (args.length<2){
	    System.out.println("Please enter your command.");
	    System.out.println("e.g. java TestQuicksort [InputFilePath][OutputFilePath]");
	}else{
	    Quicksort qs = new Quicksort();
	    qs.quicksortToFile(args[0], args[1]);
	    
	}	
    }
}