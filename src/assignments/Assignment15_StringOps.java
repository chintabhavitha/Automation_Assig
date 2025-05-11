package assignments;

public class Assignment15_StringOps {

	public static void main(String[] args) {

		String sentence = "Java programming is fun and challenging";
		System.out.println("Original String: " + sentence);

		// 1. Count the total number of words in the sentence.

		String sentence1 = "Java programming is fun and challenging";
		// (\\s+) it splits the sentence at one or more white spaces
		String [] count = sentence1.trim().split("\\s+");
		System.out.println("The total no.of words in a string is : " + count.length);

		// 2.Print the sentence words in reverse order.
		
//		String reversed = new StringBuilder(sentence1).reverse().toString();
//		System.out.println(reversed);
		
		for(int i =count.length-1; i>=0; i--) {
			System.out.print(count[i] + " ");
		}
		System.out.println();
		

		// 3.Convert the first character of each word to uppercase and print original sentence
		StringBuilder result = new StringBuilder();
		for(String ch : count) {
			if(ch.length() > 0) {
				result.append(Character.toUpperCase(ch.charAt(0)));
				result.append(ch.substring(1) + " ");
				
				
			}
		}
		System.out.println(result.toString().trim());
		
		
		
	}

}

	
