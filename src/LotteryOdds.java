import java.math.BigInteger;

public class LotteryOdds 
{

	public static void main(String[] args) 
	
	{
		//declare variables
		int poolSize = 69; // 69
		int numberSelected = 5; // 5
    	BigInteger poolOfBalls = new BigInteger("26");
    	
    	//calculate factorial of poolSize, numberSelected and (poolSize - numberSelected) and assign them to BigIntegers
    	BigInteger factorialPoolSize=factorial(poolSize);
		BigInteger factorialNumberSelected=factorial(numberSelected);
		BigInteger factorialOfpoolSizeMinusnumberSelected=factorial(poolSize-numberSelected);
		
		//Calculate Superduper magic equation!! i.e. factorial(poolSize) / (factorial(numberSelected) * (factorial(poolSize-numberSelected)))
		BigInteger oddsOfselectingAllRightNumbers  = factorialPoolSize.divide(factorialNumberSelected.multiply(factorialOfpoolSizeMinusnumberSelected)).multiply(poolOfBalls);
	    
	    System.out.println("The odds of winning the PowerBall are 1:" + oddsOfselectingAllRightNumbers);
	    System.out.println("The PowerBall website says that it's 1:292201338");
	    
    }

	//method to find the factorial of integer 
	static BigInteger factorial(int number)
    {
        // Initialize result
        BigInteger factorialOfNumber = new BigInteger("1"); // Or BigInteger.ONE
 
        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= number; i++)
            factorialOfNumber = factorialOfNumber.multiply(BigInteger.valueOf(i));
        //the method returns the factorial of the integer passed 
        return factorialOfNumber;
    }

	
}
