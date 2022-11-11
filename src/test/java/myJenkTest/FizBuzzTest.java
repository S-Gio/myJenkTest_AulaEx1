package myJenkTest;
import org.junit.Rule;
import org.junit.jupiter.api.*;
import org.junit.rules.ExpectedException;

import myJenkTest.tutorial.FizzBuzz;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.InputMismatchException;
import java.awt.AWTException;

public class FizBuzzTest {
	public FizzBuzz fb;
	
	@BeforeEach
	public void setup() {
		fb = new FizzBuzz();
	}
	
	@DisplayName("Play FizzBuzz with number = 0")
	@Test
	public void testNumber0() {
		try {
			fb.play(0);
			
			Assertions.assertEquals("0", "Dovrebbe dare errore ma non lo fa");
		}
		catch(IllegalArgumentException e) {
			String risultato = "Number must not be 0";
			// Verifica che il risultato sia uguale
			Assertions.assertEquals(risultato, "Number must not be 0");
		}
		
	}
	
	
	@DisplayName("Play FizzBuzz with number = 1")
	@Test
	public void testNumber1() {
		String risultato = fb.play(1);
		// Verifica che il risultato sia uguale
		Assertions.assertEquals(risultato, "1");
	}
	
	@DisplayName("Play FizzBuzz with number = 3")
	@Test
	public void testNumber3() {
		String risultato = fb.play(3);
		// Verifica che il risultato sia uguale
		Assertions.assertEquals(risultato, "Fizz");
	}
	/*
	@DisplayName("Play FizzBuzz with string = 3")
	@Test
	public void testString3() {
		String risultato = fb.play("3");
		// Verifica che il risultato sia uguale
		Assertions.assertEquals(risultato, "Fizz");
	}*/
	
	
	@DisplayName("Play FizzBuzz with number = 5")
	@Test
	public void testNumber5() {
		String risultato = fb.play(5);
		// Verifica che il risultato sia uguale
		Assertions.assertEquals(risultato, "Buzz");
	}
	/*
	@DisplayName("Play FizzBuzz with String = 5")
	@Test
	public void testString5() {
		String risultato = fb.play("5");
		// Verifica che il risultato sia uguale
		Assertions.assertEquals(risultato, "Buzz");
	}*/
	
	@DisplayName("Play FizzBuzz with number = 15")
	@Test
	public void testNumber15() {
		String risultato = fb.play(15);
		// Verifica che il risultato sia uguale
		Assertions.assertEquals(risultato, "Fizz");
	}
	/*
	@Rule
    public ExpectedException thrown = ExpectedException.none();	
	@Test
	public void testFooThrowsIndexOutOfBoundsException() {
		thrown.expect(NumberFormatException.class);
		thrown.expectMessage("ti ho detto di inserire un intero!");
		fb.play("Ciao");
	}
	*/
	/*
	@Rule
    public ExpectedException thrown0 = ExpectedException.none();
	@DisplayName("Play FizzBuzz with error = 0")
	@Test
	public void testFooThrowsIndexOutOfBoundsException0() {
		fb.play(0); // ho messo questa riga prima
		thrown0.expect(IllegalArgumentException.class);
		//thrown0.expectMessage("Number must not be 0");
		
		
	}
	*/
	@DisplayName("Play FizzBuzz with string = Ciao")
	@Test
	public void testStringCiao() {
		try {
			String risultato = fb.play("Ciao");
			Assertions.assertEquals("0", "Dovrebbe dare errore ma non lo fa");
		}catch(InputMismatchException e) {
			String risultato = "ti ho detto di inserire un intero!";
			// Verifica che il risultato sia uguale
			Assertions.assertEquals(risultato, "ti ho detto di inserire un intero!");
		}catch (NumberFormatException e) {
			String risultato = "ti ho detto di inserire un intero!";
			// Verifica che il risultato sia uguale
			Assertions.assertEquals(risultato, "ti ho detto di inserire un intero!");
		}
		
	}
	
	

}
