package org.structural.pattern.decorator;

public class DefaultURLScanner  implements URLRequest{

	private URLRequest urlRequest;

	public DefaultURLScanner(URLRequest urlRequest) {
		this.urlRequest = urlRequest;
	}

	@Override
	public Object getValue(String url)throws SecurityException{
		System.out.println("DefaultURLScanner in progress");
		// scan the url
		String tempURL = url.toLowerCase();
		if(tempURL.contains("script")){
			throw new SecurityException("Not a valid URL");
		}
		return this.urlRequest.getValue(url);
	}

}
