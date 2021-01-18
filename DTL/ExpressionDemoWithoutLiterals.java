public class ExpressionDemoWithoutLiterals{
	public static void main(String[] args){
		byte b1=10;
		byte b2=20;
		
		//Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
		// It means that the subexpression b1+b2 is performed using integers, not bytes. 
		byte b3=b1+b2;
		System.out.println(b3);

		//because the operands were automatically promoted to an int when the expression was evaluated, 
		//the result has also been promoted to int. Therefore, the result of the
		// expression is now of type int, 
		//which cannot be assigned to a byte without the use of a cast.
		b2=b2*3;
		System.out.println(b2);

		//short
		short s1=10;
		short s2=20;
		short s3=s1+s2;
		System.out.println(s3);

		//char
		char ch1='a';
		char ch2='b';
		char ch3=ch1+ch2;
		System.out.println(ch3);


	}
}