package org.behavioural.pattern.observer;

//import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StockMarketObserverTest {

	private StockMarket stockMarket;

	private StockMarketObserver stockMarketObserver1;

	private StockMarketObserver stockMarketObserver2;

	@Before
	public void setUp(){
		stockMarket = new StockMarket(5.15);
		stockMarketObserver1 = new StockMarketObserverImpl1();
		stockMarketObserver2 = new StockMarketObserverImpl2();
	}

	@Test
	public void testStockObservers() throws Exception {
		stockMarket.addStockMarketObserver(stockMarketObserver1);
		stockMarket.addStockMarketObserver(stockMarketObserver2);

		assertEquals(0.0, ((StockMarketObserverImpl1)stockMarketObserver1).getLatestPrice() ,0.0);
		assertEquals(0.0, ((StockMarketObserverImpl2)stockMarketObserver2).getLatestPrice() ,0.0);

		stockMarket.notifyAllObservers();
		assertEquals(stockMarket.getCurrentPrice(), ((StockMarketObserverImpl1)stockMarketObserver1).getLatestPrice() ,0.0);
		assertEquals(stockMarket.getCurrentPrice(), ((StockMarketObserverImpl2)stockMarketObserver2).getLatestPrice() ,0.0);

		stockMarket.setCurrentPrice(10.67);
		assertEquals(stockMarket.getCurrentPrice(), ((StockMarketObserverImpl1)stockMarketObserver1).getLatestPrice() ,0.0);
		assertEquals(stockMarket.getCurrentPrice(), ((StockMarketObserverImpl2)stockMarketObserver2).getLatestPrice() ,0.0);
	}

}
