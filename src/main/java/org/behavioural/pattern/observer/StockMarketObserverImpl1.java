package org.behavioural.pattern.observer;

public class StockMarketObserverImpl1 implements StockMarketObserver{
	
	private double latestPrice;

	public double getLatestPrice() {
		return latestPrice;
	}

	@Override
	public void latestStockMarketPrice(double currentPrice) {
		this.latestPrice = currentPrice;
		System.out.println("Latest Price from StockExchageObserverImpl1 :: " + latestPrice);
	}

}
