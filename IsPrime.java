public class IsPrime {

	public static double absoluteValue(double valu) {
		if (valu < 0) {
			return - valu;
		} else {
			return valu;
		}
	}

	public static boolean isPrime (int value) {
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(absoluteValue(-7.1));
		System.out.println(isPrime(14));
		System.out.println(isPrime(17));
	}
}

/*	public static boolean main(String[] args) {
public boolean isPrime(int n) {
boolean isPrime;
int testNum = 5;
if (testNum/testNum == 0) {
	return isPrime;
}
}

}
*/