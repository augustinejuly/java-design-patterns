package org.structural.pattern.decorator;

public class DefaultURLScanner  implements URLRequest{

	private URLRequest urlRequest;

	public DefaultURLScanner(URLRequest urlRequest) {
		this.urlRequest = urlRequest;
	}

	@Override
	public Object getValue(String url)throws SecurityException{
		// scan the url
		String tempURL = url.toLowerCase();
		if(tempURL.contains("javascript")){
			throw new SecurityException("Not a valid URL");
		}
		return this.urlRequest.getValue(url);
	}

}
