package org.structural.pattern.decorator;

public class SimpleUrlRequest implements URLRequest{

	@Override
	public Object getValue(String url) throws SecurityException {
		System.out.println("SimpleUrlRequest in progress");
		//retrun some output after processing
		return url;
	}

}
