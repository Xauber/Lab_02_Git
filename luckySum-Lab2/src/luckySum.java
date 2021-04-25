
public class luckySum{

	public static void main(String[] args) {
		/**
		 *
		 * https://codingbat.com/prob/p130788
		 Given 3 int values, a b c, return their sum.
		 However, if one of the values is 13 then it does not count towards the sum and values to its right do not count.
		 So for example, if b is 13, then both b and c do not count.


		 luckySum(1, 2, 3) → 6
		 luckySum(1, 2, 13) → 3
		 luckySum(1, 13, 3) → 1
		 */

		luckySum sum = new luckySum();
		System.out.println(sum.luckySumAlgebra(1, 2, 3));
		System.out.println(sum.luckySumAlgebra(1, 2, 13));
		System.out.println(sum.luckySumAlgebra(1, 13, 3));

	}

		public int luckySumAlgebra(int a, int b, int c)
		{
			int sum = a + b + c;

			if(a == 13) {
				sum = sum  - a - b - c;}

			else if(b == 13) {
				sum = sum - b - c;}

			else if(c == 13) {
				sum = sum - c;}

			return sum;
		}
		//return sum of a,b,c
		
		//but if one value is 13, only the values before get added to sum
		// example: a=3, b=13, c=2 ==> sum = a; a=1, b=4, c=13 ==> sum = a+b

