package test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.junit.Test;
import main.KWIC;

public class KWICTest {

	@Test
	public void testEmptyInputFileCanBeHandled() {
		// Run LineParser with "emptyFile.txt"
		// compare 
	}
	
	@Test
	public void testNonExistentInputFile() throws FileNotFoundException {
		// Run LineParser with "fakeFile.txt"
		// Expect no exception will be thrown
	}
	
	@Test
	public void testWholeProcessGoodInput1() {
		// Run LineParser with "goodInput1.txt"
		String correctOutput = "";
		assertEquals("", correctOutput);
	}
	
	@Test
	public void testWholeProcessGoodInput2() {
		// Run LineParser with "goodInput2.txt"
		String correctOutput = "";
		assertEquals("", correctOutput);
	}
	
	@Test
	public void testWholeProcessEmptyInput() {
		// Run LineParser with "emptyFile.txt"
		String correctOutput = "";
		assertEquals("", correctOutput);
	}
	
	@Test
	public void testLineParserSetOutput1() {
		// Run LineParser with "goodInput1.txt"
		Set<String[]> setOfStrings = new HashSet<String[]>();
		setOfStrings.add(new String[] {"Hello", "Tonda"});
		setOfStrings.add(new String[] {"We", "go", "without", "Robertovi"});
		setOfStrings.add(new String[] {"What", "up"});
		// Compare set output from LineParser to setOfStrings
	}
	
	@Test
	public void testLineParserSetOutput2() {
		// Run LineParser with "goodInput2.txt"
		Set<String[]> setOfStrings = new HashSet<String[]>();
		setOfStrings.add(new String[] {"Hello", "Tonda"});
		// Compare set output from LineParser to setOfStrings
		
	}
	
	@Test
	public void testLineParserSetOutputEmptyInput() {
		// Run LineParser with "emptyFile.txt"
		Set<String[]> setOfStrings = null; // REPLACE with output from LineParser
		assertEquals(setOfStrings.size(), 0);
	}
}
