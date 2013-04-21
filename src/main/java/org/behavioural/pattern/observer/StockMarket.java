package org.behavioural.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {

	private double currentPrice;

	List<StockMarketObserver> stcokMarketObservers = new ArrayList<StockMarketObserver>();

	public StockMarket(double currentPrice) {
		super();
		this.currentPrice = currentPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
		notifyAllObservers();
	}

	public void addStockMarketObserver(StockMarketObserver stockMarketObserver){
		stcokMarketObservers.add(stockMarketObserver);
	}

	public void removeStockMarketObserver(StockMarketObserver stockMarketObserver){
		stcokMarketObservers.remove(stockMarketObserver);
	}

	public void notifyAllObservers(){
		for (StockMarketObserver marketObserver : stcokMarketObservers) {
			marketObserver.latestStockMarketPrice(currentPrice);
		}
	}

}
