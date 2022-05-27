package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import classes.Market;
import classes.Supermarket;
import classes.TypeMarket;
import exceptions.ExceptionMarket;

public class TestSupermarketGetBiggestMarketByArea {
	static Market m1;
	static Market m2;
	static Market m3;
	static Market m4;
	static Market m5;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");

		m1 = new Market("Sephora", 20, TypeMarket.BEAUTY);
		m2 = new Market("Douglas", 15, TypeMarket.BEAUTY);
		m3 = new Market("Mobexpert", 40, TypeMarket.DECORATION);
		m4 = new Market("Zara", 20, TypeMarket.DRESS);
		m5 = new Market("HM", 20, TypeMarket.DRESS);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	// right bicep testing
	@Test
	public void testRight() {
		System.out.println("Test RIGHT");
		ArrayList<Market> listM = new ArrayList<Market>();
		listM.add(m1);
		listM.add(m2);
		listM.add(m3);
		listM.add(m4);
		listM.add(m5);

		Supermarket sm = new Supermarket("Mall Bucharest", listM);

		try {
			Market result = sm.getBiggestMarketByArea(TypeMarket.BEAUTY);

			String expected = "Sephora";

			// more weird than the other one
			if (result.getName().equals(expected)) {
				assertTrue(true);
			} else {
				assertTrue(false);
				// fail();
			}

			// assertEquals(expected, result.getName());

		} catch (ExceptionMarket e) {
			e.printStackTrace();
			fail("I'm not expecting to fail - not ok");
		}
	}

	@Test
	public void testBoundary() {
		System.out.println("testBoundary");

		ArrayList<Market> listM = new ArrayList<Market>();
		listM.add(m1);
		Supermarket sm = new Supermarket("Mall Bucharest", listM);

		try {
			Market result = sm.getBiggestMarketByArea(TypeMarket.BEAUTY);

			assertEquals("Sephora", result.getName());
		} catch (ExceptionMarket e) {
			e.printStackTrace();
			fail("NOT OK");

		}
	}

	@Test(expected = ExceptionMarket.class)
	public void testException() throws ExceptionMarket {

		ArrayList<Market> listM = new ArrayList<>();

		Supermarket sm = new Supermarket("Mall Vitan", listM);

		sm.getBiggestMarketByArea(TypeMarket.BEAUTY);

	}

	@Test
	public void testException2() {

		ArrayList<Market> listM = new ArrayList<>();

		Supermarket sm = new Supermarket("Mall Vitan", listM);

		try {
			sm.getBiggestMarketByArea(TypeMarket.BEAUTY);
			fail("NOT OK should fail");
		} catch (ExceptionMarket e) {

			e.printStackTrace();

			assertTrue("It;s working", true);
		}

	}

	@Test
	public void testPerformance() throws ExceptionMarket {
		System.out.println("testPerformance");
		ArrayList<Market> listM = new ArrayList<Market>();
		listM.add(m1);
		listM.add(m2);
		listM.add(m3);
		listM.add(m4);
		listM.add(m5);

		Supermarket sm = new Supermarket("Mall Bucharest", listM);

		double startTime = System.currentTimeMillis();
		sm.getBiggestMarketByArea(TypeMarket.BEAUTY);
		double stopTime = System.currentTimeMillis();

		assertTrue("It's fast!", stopTime - startTime < 5);

	}

	public Market getLargestMarket(ArrayList<Market> list, TypeMarket marketType) {

		Market m = null;

		// sort list by area (TYPE)

		return m;
	}

	@Test
	public void testCrossCheck() throws ExceptionMarket {
		System.out.println("testCrossCheck");
		ArrayList<Market> listM = new ArrayList<Market>();
		listM.add(m1);
		listM.add(m2);
		listM.add(m3);
		listM.add(m4);
		listM.add(m5);

		Supermarket sm = new Supermarket("Mall Bucharest", listM);

		Market expected = getLargestMarket(listM, TypeMarket.BEAUTY);
		Market actualResult = sm.getBiggestMarketByArea(TypeMarket.BEAUTY);
		assertEquals(expected, actualResult);

	}

	@Test
	public void testInversion() throws ExceptionMarket {
		System.out.println("testInversion");
		ArrayList<Market> listM = new ArrayList<Market>();
		listM.add(m1);
		listM.add(m2);
		listM.add(m3);
		listM.add(m4);
		listM.add(m5);

		Supermarket sm = new Supermarket("Mall Bucharest", listM);

		Market result = sm.getBiggestMarketByArea(TypeMarket.BEAUTY);

		for (int i = 0; i < listM.size(); i++) {
			if (result.getName().equals(listM.get(i))) {
				// maxArea
				// save position
			}
		}
		// check if the pos is between [0, listM.size() )
	}

}
