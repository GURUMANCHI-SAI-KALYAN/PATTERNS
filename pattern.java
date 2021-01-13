package samplePackages;
import java.util.regex.*;

  public class pattern {
	public static void main(String[] args) {

		System.out.println(Pattern.matches("[0-9]{3}[: :]*[0-9]{3}", "500 085"));

	}
}

