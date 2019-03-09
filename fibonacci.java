import java.math.BigInteger;

public class fibonacci implements fib {
	public BigInteger fibo(int n) {
		BigInteger A,B,C;
		A=BigInteger.ZERO;
		B=BigInteger.ONE;
		C=BigInteger.ONE;
		if(n==1) {
			return A;
		}
		if(n==2) {
			return B;
		}
		for(int i=3;i<=n;i++) {
			C=A.add(B);
			A=B;
			B=C;
		}
		return C;
	}
}
