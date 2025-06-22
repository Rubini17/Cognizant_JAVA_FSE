package financialforecast;

public class Forecast {
	
	   public static double calculate(double principal, double rate, int years) {
	        if (years == 0) {
	            return principal;
	        }

	        return calculate(principal, rate, years - 1) * (1 + rate);
	    }
	   
	   
}
