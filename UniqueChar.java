import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UniqueChar {
	static final int MAX = 127;
	static final int[] count = new int[MAX];
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the sentence:");
		String str = sc.nextLine();
		Pattern pattern = Pattern.compile("[A-z ]*");
		Matcher matcher = pattern.matcher(str);
		
		if(!matcher.matches()) {
			System.out.println("Invalid Sentence");
			return ;
		}	
		for(int i=0; i<str.length(); i++) {
			count[(int)str.charAt(i)]+=1;
		}
		boolean noUniqueChar = false;
		for(int i=0;i<str.length();i++) {
			if(count[(int)str.charAt(i)]==1 && (int)str.charAt(i)!=32) {
				noUniqueChar = true;
				System.out.println(str.charAt(i));
			}
		}
		if(!noUniqueChar) {
			System.out.println("No unique characters");
		}	
	}
}
