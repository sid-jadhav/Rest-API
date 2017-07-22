package com.org.api.springRESTFullWebService.Lambda;

public class FirstLambda {

	public static void main(String[] args) {
		Lambda myFirstLambda = ()->System.out.println("Sid is toffani");
		myFirstLambda.sidd();
	}

}
interface Lambda{
	void sidd();
}
