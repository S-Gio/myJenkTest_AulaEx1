package myJenkTest;
import org.junit.jupiter.api.*;
import myJenkTest.tutorial.FizzBuzz;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
	
	
	
	@DisplayName("Play FizzBuzz with number = 5")
	@Test
	public void testNumber5() {
		String risultato = fb.play(5);
		// Verifica che il risultato sia uguale
		Assertions.assertEquals(risultato, "Buzz");
	}
	
	@DisplayName("Play FizzBuzz with number = 15")
	@Test
	public void testNumber15() {
		String risultato = fb.play(15);
		// Verifica che il risultato sia uguale
		Assertions.assertEquals(risultato, "Fizz");
	}
	
	//test metodo play()
	@DisplayName("Play FizzBuzz with string input")
	@Test
	public void testNumberStr() throws AWTException { 
		String input = "ciao";
		String risultato = fb.play();
		Robot robot = new Robot();
		for(int idx = 0; idx<input.length(); idx++) {
			robot.keyPress(input.toCharArray()[idx]);
			robot.keyRelease(input.toCharArray()[idx]);
			
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		// Verifica che il risultato sia uguale
		Assertions.assertEquals(risultato, "Fizz");
	}
}
