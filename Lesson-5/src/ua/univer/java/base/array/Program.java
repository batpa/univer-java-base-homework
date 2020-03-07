package ua.univer.java.base.array;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// task1();
		// task2();
//		Scanner sc = new Scanner(System.in);
//		int length = 10;
//		// TODO Auto-generated method stub
//		int[] arr = new int[length];
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("Enter int "+ +i);
//			arr[i] = sc.nextInt();
//			System.out.println(arr[i]);
//
//		}
//
//		System.out.println(arr);
//		for (int i : arr) {
//			System.out.println(i);
//		}
		taskArray68();
	}

	/**
	 * 1.создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы
	 * массива на консоль в одну строку, разделяя запятой
	 */
	private static void task1() {
		int[] oddsInt = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		for (int i = 0; i < oddsInt.length; i++) {
			System.out.print(oddsInt[i]);
			if (i != oddsInt.length - 1)
				System.out.print(",");
		}
	}

	/**
	 * ввести 10 целых значений с консоли и разместить в 2 масива четные и нечетные
	 */
	private static void task2() {
		final int LENGTH = 3;
		int[] inputArray = new int[LENGTH];
		Scanner sc = new Scanner(System.in);
		int inputIterator = 0;
		int oddIterator = 0;
		int evenIterator = 0;
		while (inputIterator < LENGTH) {
			System.out.println("Enter int " + +inputIterator);
			int inputValue = sc.nextInt();
			inputArray[inputIterator] = inputValue;
			if ((inputValue & 1) == 0) {
				oddIterator++;
			} else {
				evenIterator++;
			}
			inputIterator++;
		}
		// System.out.println(inputArray.length);
		int[] evenArray = new int[evenIterator];
		int[] oddArray = new int[oddIterator];
		int evenIndex = 0;
		int oddIndex = 0;
		System.out.println("count EVEN" + evenIterator);
		System.out.println("count ODD" + oddIterator);
		for (int inputValue : inputArray) {
			if ((inputValue & 1) == 0) {
				oddArray[oddIndex] = inputValue;
				oddIndex++;
			} else {
				evenArray[evenIndex] = inputValue;
				evenIndex++;
			}
		}
		for (int evenValue : evenArray) {
			System.out.println(evenValue);
		}
		System.out.println("ODD");
		for (int oddValue : oddArray) {
			System.out.println(oddValue);
		}
	}

	/**
	 * Дано целое число N (> 0). Сформировать и вывести целочисленный массив размера
	 * N, содержащий N первых положительных нечетных чисел: 1, 3, 5, ... .
	 */
	private static void taskArray1() {
		Scanner sc = new Scanner(System.in);
		int n;
		int[] evenArray;

		do {
			System.out.println("Please enter N >0 :");
			n = sc.nextInt();
			if (n <= 0) {
				System.out.println("Wrong Value please N >0 :");
			}
		} while (n <= 0);
		evenArray = new int[n];
		evenArray[0] = 1;
		for (int i = 1; i < evenArray.length; i++) {
			evenArray[i] = evenArray[i - 1] + 2;
		}
		for (int i : evenArray) {
			System.out.println(i);
		}
	}

	/**
	 * Array68. Дан массив размера N. Поменять местами его минимальный и макси-
	 * мальный элементы.
	 */
	private static void taskArray68() {
		int[] inputArray = { 1, 3, 5, 0, 9, 11, 13, 15, 100, 19 };

		int maxValue = inputArray[0];
		int maxIndex = 0;
		int minValue = inputArray[0];
		int minIndex = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
				maxIndex = i;
			}
			if (inputArray[i] < minValue) {
				minValue = inputArray[i];
				minIndex = i;
			}
		}
		inputArray[maxIndex] = minValue;
		inputArray[minIndex] = maxValue;
		for (int i : inputArray) {
			
			System.out.println(i);
		}
	}

}
