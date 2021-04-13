package business;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//beforetestclass and afterclasstest wrap the test. beforetest and aftertest are executed before and after the test, respectively
public class BeforeAndAfterTests {

	
	
	@Before
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	@After
	public void afterTest() {
		System.out.println("afterTest");
	}

	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("beforeClassTest");
	}
	
	@AfterClass
	public static void afterClassTest{
		System.out.println("afterClassTest");
	}

}
