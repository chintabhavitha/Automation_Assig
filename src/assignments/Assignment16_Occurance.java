package assignments;

public class Assignment16_Occurance {

	public static void main(String[] args) {
		String Sentence = "Java Programming is fun and challenging";
		
		//Divide in to multiple words
		String[] words = Sentence.trim().split("\\s+");
		
		//
		//to count the no.of java word there in sentence
		int count = 0;
		
		for(int i =0; i< words.length; i++) {
			String word = words[i].replaceAll("[^0-9-a-z-A-Z]", " ");
			if(word.equals("Java")) {
				count++;
				System.out.println("Index of java word is :" + i );
			}
		}
		System.out.println("Total no.of occurance of java is : "+ count);
	}

}
