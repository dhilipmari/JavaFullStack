package Lamda;

public class NumberCategoryUtility {



		    public static NumberCategory checkAmicable() {

	        return (num1, num2) -> {

	            int sumDivisorsNum1 = sumDivisors(num1);

	            int sumDivisorsNum2 = sumDivisors(num2);



	            return sumDivisorsNum1 == num2 && sumDivisorsNum2 == num1;

	        };

	    }
