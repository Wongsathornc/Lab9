package test;

public class FizzBuzz {
	public String CalculateNumber(int x) {
		int number = x;
		String result = "";
		if(x%3 == 0 && x%5 == 0) {
			result = "FizzBuzz";
		} else if(x%3 == 0) {
			result = "Fizz";
		}else if(x%5 == 0) {
			result = "Buzz";
		}else  {
			result = ""+x;
		}
		return result;
	}
}
