package financialforecast;

public class Test {

	public static void main(String[] args) {
		
		double principle = 12000.0;
		double rate = 0.05;
		int years = 5;
		
		double result = Forecast.calculate(principle, rate, years);
		
		System.out.format("The future value is %.2f ",  result);

	}

}
