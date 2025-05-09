package assignments;

public class Assignment15_StringOps {

	public static void main(String[] args) {

		String sentence = "Java programming is fun and challenging";

		// 1. Count the total number of words in the sentence.
		
		System.out.println(sentence);
		String[] words = sentence.trim().split("\\s+"); // (\\s+) it splits the sentence at one or more white spaces
		System.out.println(words.length);
		

		
		//2.Print the sentence words in reverse order.
		System.out.println(sentence);
		
		for(int i=words.length-1; i>=0; i--) {
			System.out.print(words[i] + " ");
		}
		
		//3.Convert the first character of each word to uppercase and print original sentence
		
		
	}

}
