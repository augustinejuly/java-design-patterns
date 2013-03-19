package org.behavioural.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class JavaObserver implements Observer{

	private int recentUpdatedValue;

	@Override
	public void update(Observable o, Object number) {
		System.out.println("The value of number got changed to "+ number);
		this.recentUpdatedValue= (Integer)number;
	}

	public int getRecentUpdatedValue() {
		return recentUpdatedValue;
	}

	public static class Data extends Observable{

		@SuppressWarnings("unused")
		private int number;

		public Data(int number) {
			this.number = number;
		}

		public void setNumber(int number) {
			this.number = number;
			setChanged();
			notifyObservers(number);
		}

	}

}
