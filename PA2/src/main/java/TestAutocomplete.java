public class TestAutocomplete {

    public static void main(String [] args){
	if (args.length<3){
	    System.out.println("Please enter your command.");
	    System.out.println("e.g. java TestAutocomplete [InputFilePath][max_no][String1]");
	}else{
	    Autocomplete ac = new Autocomplete();
	    String [] results = ac.listCandidates(args[0], Integer.parseInt(args[1]), args[2].toLowerCase());
	    for (int i = 0; i < results.length; i++){
		if (results[i]!=null)
		System.out.println(results[i]);
	    }
	}	
    }
}