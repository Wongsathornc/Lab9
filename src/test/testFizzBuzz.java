package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class testFizzBuzz {

	FizzBuzz testFizzBuzz;
	
	@BeforeEach
	public void setUp() throws Exception {
		testFizzBuzz = new FizzBuzz();
	}
	
}
