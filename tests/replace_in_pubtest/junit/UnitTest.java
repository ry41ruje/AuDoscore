import static org.junit.Assert.assertEquals;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

import tester.annotations.Ex;
import tester.annotations.Exercises;
import tester.annotations.Points;
import tester.annotations.Replace;

@Exercises({ @Ex(exID = "GA4.6a", points = 12.5)})
public class UnitTest {
	// instead of explicitly coding the following rules here,
	// your test class can also just extend the class JUnitWithPoints
	@Rule
	public final PointsLogger pointsLogger = new PointsLogger();
	@ClassRule
	public final static PointsSummary pointsSummary = new PointsSummary();

	@Test(timeout=200)
	@Points(exID = "GA4.6a", bonus = 47.11)
	@Replace({"ToTest.toTest"})
	public void test() {
		assertEquals("Should return 42", 42, ToTest.toTest());
	}

	@Test(timeout=200)
	@Points(exID = "GA4.6a", bonus = 23.00)
	@Replace({"ToTest.toTest2"})
	public void test2() {
		assertEquals("Should return 23", 23, ToTest.toTest2());
	}
}
