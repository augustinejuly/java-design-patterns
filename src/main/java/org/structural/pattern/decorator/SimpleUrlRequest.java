package org.structural.pattern.decorator;

public class SimpleUrlRequest implements URLRequest{

	@Override
	public Object getValue(String url) throws SecurityException {
		return "retrun some output after processing";
	}

}
