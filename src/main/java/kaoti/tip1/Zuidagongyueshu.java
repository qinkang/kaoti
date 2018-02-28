package kaoti.tip1;
/**
 * 求两个数的最大公约数和最小公倍数
 * @author qinkang
 *
 */
public class Zuidagongyueshu {
	/**
	辗转相除法：辗转相除法是求两个自然数的最大公约数的一种方法，也叫欧几里德算法。
	例如，求（319，377）：
	∵ 319÷377=0（余319）
	∴（319，377）=（377，319）；
	∵ 377÷319=1（余58）
	∴（377，319）=（319，58）；
	∵ 319÷58=5（余29）
	∴ （319，58）=（58，29）；
	∵ 58÷29=2（余0）
	∴ （58，29）= 29；
	∴ （319，377）=29。
	可以写成右边的格式。
	**/
	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		System.out.println(gcd1(a, b));
		System.out.println(gcd2(a, b));
		System.out.println(lcm(a, b));
	}
	
	/** 
	 * 最大公约数-欧几里德算法-递归算法
	 * @param a
	 * @param b
	 * @return
	 */
	private static int gcd1(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return gcd1(a, a % b);
	}
	
	/** 
	 * 最大公约数-欧几里德算法-非递归算法
	 * @param a
	 * @param b
	 * @return
	 */
	private static int gcd2(int a, int b) {
		int temp;
		while(b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	/**
	 * 最小公倍数 由于两个数的乘积等于这两个数的最大公约数与最小公倍数的积。即（a，b）×[a，b]=a×b。所以，求两个数的最小公倍数，就可以先求出它们的最大公约数，然后用上述公式求出它们的最小公倍数。[4] 
	 * 例如，求[18，20]，即得[18，20]=18×20÷（18，20）=18×20÷2=180
	 * @param a
	 * @param b
	 * @return
	 */
	private static int lcm(int a, int b) {
		return a*b/gcd1(a, b);
	}
	
}
