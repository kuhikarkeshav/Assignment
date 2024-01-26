import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
  String output = sortString(input);
        
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);

        scanner.close();
    }

    public static String sortString(String input) {
        String[] words = input.split(" ");

        Arrays.sort(words, new CustomComparator());

        return String.join(" ", words);
    }

    private static class CustomComparator implements Comparator<String> {
  
        public int compare(String s1, String s2) {
            int lengthComparison = Integer.compare(s2.length(), s1.length());
            if (lengthComparison != 0) {
                return lengthComparison;
            }

            int occurrencesComparison = Integer.compare(countOccurrences(s2, 'e'), countOccurrences(s1, 'e'));
            return occurrencesComparison;
        }
    }

    private static int countOccurrences(String s, char target) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }
}
	


