import org.junit.*;
import tester.*;

import org.junit.*;
import org.junit.rules.*;
import static org.junit.Assert.*;
import java.lang.reflect.*;
import java.lang.*;
import java.util.*;
import java.io.*;

@SecretClass
public class SecretTest {
	// instead of explicitly coding the following rules here,
	// your test class can also just extend the class JUnitWithPoints
	@Rule
	public final PointsLogger pointsLogger = new PointsLogger();
	@ClassRule
	public final static PointsSummary pointsSummary = new PointsSummary();

	@Test(timeout=100)
	@tester.annotations.Bonus(exID = "GA4.6a", bonus = 47.11)
	@Replace({"ToTest.toTest"})
	public void test() {
		assertEquals("Should return 42", 42, ToTest.toTest());
	}

	@Test(timeout=100)
	@tester.annotations.Bonus(exID = "GA4.6a", bonus = 23.00)
	@Replace({"ToTest.toTest2"})
	public void test2() {
		assertEquals("Should return 23", 23, ToTest.toTest2());
	}
}