import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import ua.univer.base.conditions.TaskIfElse;
import ua.univer.base.conditions.TaskSwitch;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		// initIfElseTask();
		//System.out.println(checkIsintercalaryYear());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int");
		int i = sc.nextInt();
		System.out.println(i);
		System.out.println("Enter word");
		System.out.println(sc.next());

	}

	/**
	 * 
	 * 1)Если год равномерно делится на 4, перейдите к шагу 2. В противном случае
	 * перейдите к шагу 5. 2)Если год делится на 100, перейдите к шагу 3. В
	 * противном случае перейдите к шагу 4. 3)Если год делится на 400, перейдите к
	 * шагу 4. В противном случае перейдите к шагу 5. 4)Год представляет собой
	 * високосный год (в нем 366 дней). 5)Год не является високосным (365 дней).
	 */
	private static int checkIsintercalaryYear() {
		int year = 500;
		int countDays = 365;
		System.out.println(year % 4);
		return (year % 4 != 0) ? countDays
				: (year % 100 != 0) ? (year % 400 != 0) ? countDays + 1 : countDays : countDays + 1;

	}

	private static void initIfElseTask() {
		TaskIfElse ifElse = new TaskIfElse();
		ifElse.task4();
		TaskSwitch initSwitch = new TaskSwitch();
		initSwitch.task4();

		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 7, 10, 11, 16, 1, 5, 16, 16);
		List<Character> charList = Arrays.asList('z', 'Y', 'G', ';');
		long positiveCount = ifElse.positiveCount(intList);
		long negativeCount = ifElse.negativeCount(intList);
		int min = ifElse.getMinValue(intList);
		int max = ifElse.getMaxValue(intList);
		ifElse.OrderCharValue(charList);
		System.out.println("Min Value" + min);
		System.out.println("Max Value" + max);
		long countMinValue = ifElse.getCountElementInCollection(intList, min);
		long countMaxValue = ifElse.getCountElementInCollection(intList, max);
		System.out.println("countMinValue= " + countMinValue);
		System.out.println("countMaxValue= " + countMaxValue);
		long summElement = ifElse.calcSumElement(intList);
		System.out.println("Sum All Value=" + summElement);
		float averageElement = ifElse.calcAvgElement(intList);
		System.out.println("Avereage = " + averageElement);
	}
}
