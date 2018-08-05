
import java.math.BigInteger;

public class Misc {

	private BigInteger fact(int n, BigInteger fact) {
		if (n == 0)
			return fact;
		else
			return fact(n - 1, BigInteger.valueOf(n).multiply(fact));
	}

	public static void main(String... arg) {
		int value = 1000;
		// BigInteger fact = new Misc().fact(value, BigInteger.valueOf(1));
		// System.out.println(fact);

		BigInteger fact = BigInteger.valueOf(1);
		for (int i = 1; i <= value; i++) {
			//System.out.println(fact);
			fact = fact.multiply(BigInteger.valueOf(i));
		}

		System.out.println(fact);

	}
}
