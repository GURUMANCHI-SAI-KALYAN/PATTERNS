package samplePackages;
import java.util.regex.*;

  public class pattern {
	public static void main(String[] args) {

		System.out.println(Pattern.matches("^[0-9]{5}[^$*#a-zA-Z]*$", "500085"));
//		 System.out.println(Pattern.matches("[^-]{1}", "8"));

	}
}

