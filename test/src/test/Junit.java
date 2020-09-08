package test;
import java.util.Arrays;

public class Junit {
	
	public int multiply(int num1, int num2)
	{
		return num1 * num2;
	}

	public String concatenate(String one, String two) {
		return one+two+"";
	}
	

	public String[] sortStrings(String[] arrInput) {
		Arrays.sort(arrInput);
		return arrInput;
	}
}
