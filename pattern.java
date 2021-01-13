package samplePackages;
import java.util.regex.*;

  public class pattern {
	public static void main(String[] args) {

		System.out.println(Pattern.matches("![a-zA-Z][1-9][0-9]{5}", "A00084"));
	}
}

