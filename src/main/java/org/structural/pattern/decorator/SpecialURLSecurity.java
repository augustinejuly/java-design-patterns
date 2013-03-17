package org.structural.pattern.decorator;

public class SpecialURLSecurity extends DefaultURLScanner implements URLRequest{

	public SpecialURLSecurity(URLRequest urlRequest) {
		super(urlRequest);
	}

	@Override
	public Object getValue(String url) throws SecurityException{
		additionalSecurityCheck(url);
		return super.getValue(url);
	}

	private void additionalSecurityCheck(String url){
		//do some security check and throw exception if it violates any security constraints
	}

}
