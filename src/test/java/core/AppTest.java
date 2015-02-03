package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@BeforeClass
	public static void BeforeClass() throws Exception {
		System.out.println("BeforeClass method will be executed first method starts");
	}

	@AfterClass
	public static void AfterClass() throws Exception {
		System.out.println("AfterClass method will be executed after last test method completed");
				
	}

	@Before
	public void Before() throws Exception {
		System.out.println("Before method will be executed before every test methods");
	
	
	}

	@After
	public void After() throws Exception {
		System.out.println("After method will be executed after every test methods");
	}

	@Test
	public void Test_01_assertEquals_Positive(){
		assertEquals("String not the same", "Testing JUnit 4", App.s);
		System.out.println("Test_01_assertEquals_Positive");
	}
	
	@Test
	public void Test_02_assertEquals_Negeative() {
		assertEquals("String not the same.", "Testing TestNG 6", App.s);
		System.out.println("Test_02_assertEquals_Negative");
		
	}
	
	@Test
	public void Test_03_assertEquals_Ignored() {
		assertEquals("String not the same.", "Testing JUnit 3", App.s);
		System.out.println("Test_03_assertEquals_Ignore - not ready yet");
		
	}

	@Test
	public void Test_04_assertSame_Positive(){
		assertSame("Integer is the same.", 57, App.i);
		System.out.println("Test_04_assertEquals_Positive");
	}
	

	@Test
	public void Test_05_assertSame_Negeative() {
		assertSame("Integer not the same.", 54, App.i);
		System.out.println("Test_05_assertSame_Negative");
		
	}
	
	@Test
	public void Test_06_assertEquals_Ignore() {
		assertSame("Integer is ignored.", 59, App.i);
		System.out.println("Test_06_assertSame_Ignore");
		
	}

	@Test
	public void Test_07_assertFalse_Positive(){
		assertFalse("Boolean should be false", App.f);
		System.out.println("Test_07_assertFalse_Positive");
	}
	
	@Test
	public void Test_08_assertFalse_Negeative() {
		assertFalse("Boolean should be false", App.t);
		System.out.println("Test_08_assertFalse_Negeative");
		
	}

	@Test
	public void Test_09_assertTrue_Positive(){
		assertTrue("Boolean should be true", App.t);
		System.out.println("Test_09_assertTrue_Positive");
	}
	
	@Test
	public void Test_10_assertTrue_Negeative() {
		assertTrue("Boolean should be true", App.f);
		System.out.println("Test_10_assertTrue_Negeative");


		
	}
}
	


