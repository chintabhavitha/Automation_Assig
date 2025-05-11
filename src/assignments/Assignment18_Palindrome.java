package assignments;

public class Assignment18_Palindrome {

	public static void main(String[] args) {

		String[] sentence = { "A man, a plan, a canal: Panama", "race a car" };

		// to print the array
		for (String updatedSentence : sentence) {
			// remove all spaces, special characters, alphanumeric and convert all characters  in to lower case
			String result = updatedSentence.replaceAll("[^0-9A-Za-z]", "").toLowerCase();

			System.out.println("Original sentence: " + updatedSentence);
			System.out.println("Updated Sentence: " + result);
			
			//reverse the string
			String Reversed = new StringBuilder(result).reverse().toString();
			
			if(result.equals(Reversed)) {
				System.out.println(Reversed + " is a palindrome");
			}else {
				System.out.println(Reversed + " is not a palindrome");
			}

		}

	}

}
