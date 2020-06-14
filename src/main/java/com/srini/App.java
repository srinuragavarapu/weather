package com.srini;

/*
 * Application starter
 */
public class App {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Please provide latitude and longitude. Example : 39.7456,-97.0892");
			return;
		}
		ForecastHelper fh = new ForecastHelper();
		ForecastModel fm = fh.getForeCast(args[0]);
		if (fm != null) {
			Show.inTable(fm);
		}
	}

}
