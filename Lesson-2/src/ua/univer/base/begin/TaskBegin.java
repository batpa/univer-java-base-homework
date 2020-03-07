package ua.univer.base.begin;
import ua.univer.base.digit.*;
/*
 * Begin11. Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
 * 
 */
//sout System.out.println();
public class TaskBegin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		calcSum();
//		calcDiff();
//		TaskBegin.calcSum();
		Digit dd = new  Digit();
		System.out.println(dd.calcSum(5.44, 4.22));
		int aaa= 5;
		int bbb = 10;
		System.out.println( divid( aaa,bbb) );
		System.out.println(0.1+0.2);
	}
	private static void calcSum() {
		int x = 1;
		int y = 2;
		int sum = x+y;
		System.out.println(sum);
	}
	
	private static double divid(double x, double y) {
		return (double)5/10;
	}
	
	public static void calcDiff() {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 2;
		int diff = x-y;
		System.out.println(diff);

	}

}
