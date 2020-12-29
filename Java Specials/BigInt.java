/*input
10000000000000000001534544555788886656789897
20548487555555554477777777777755787879797999
*/
import java.util.*;
import java.math.BigInteger;
class BigInt{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		BigInteger num1 = new BigInteger(s1,10);
		BigInteger num2 = new BigInteger(s2,10);
		System.out.println(num1.bitLength());
		System.out.println(num2.bitCount());
		System.out.println(num2.add(num1));
		System.out.println(num2.multiply(num1));
		System.out.println(num2.gcd(num1));
		System.out.println(num1.nextProbablePrime());
}
}
