package jUnitTestingPack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrIncorrect {

	@Test
	public void test() {
		JUnitFunctions JUnit=new JUnitFunctions();
		String result = JUnit.addTwoStr("hello", "world");
		assertEquals("hello world", result);
	}

}
