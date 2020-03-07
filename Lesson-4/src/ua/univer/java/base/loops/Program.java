package ua.univer.java.base.loops;

import java.lang.Math;

/**
 * Используя циклы и метод: print("*"), print(" "), print("\n") (для перехода на
 * новую строку). Выведите на экран: · прямоугольник · прямоугольный треугольник
 * · равносторонний треугольник · ромб
 * 
 * @author batpa
 *
 */
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("START");

		for (int i = -10; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				if (i > 0) {
					if (i == 9 || j == 20 / 2 + i || j == 20 / 2 - i)
						System.out.print("* ");
					else
						System.out.print("  ");

				}
				if (i < 0) {
					if ( j == 20 / 2 + i || j == 20 / 2 - i)
						System.out.print("* ");
					else
						System.out.print("  ");
					
				}
			}
			System.out.print("\n");
		}
		/*
		 * int maxX = 7; int maxY = 9; printHorisontalDelimiter(maxX); for (int x = 0; x
		 * <= maxY; x++) { System.out.print("\n"); for (int y = 0; y <= maxX; y++) { if
		 * (0 == y || y == maxX) System.out.print("*"); System.out.print(" "); } }
		 */
		// printHorisontalDelimiter(10);

		// printHorisontalLine(10, 10);
		// printVerticalDelimiter(10, 10);
		// renderRectangle(15,10,25,7);
	}

	// private static void renderLine(int fromX, int startPositionY, int
	// endPositionX,int heigth) {
	/**
	 * @param startPositionX
	 * @param startPositionY
	 * @param width
	 * @param heigth
	 */
	private static void renderRectangle(int startPositionX, int startPositionY, int width, int heigth) {

		printHorisontalLine(startPositionX, width);
		// printVerticalDelimiter(startPositionY-1,heigth);
		printDoubleVerticalDelimiter(startPositionX, width, heigth);
		printHorisontalLine(startPositionX, width);
	}

	private static void printVerticalDelimiter(int position, int heigth) {

		for (int y = 0; y <= heigth; y++) { // foreach row
			printNewLine();
			for (int x = 0; x <= position; x++) { // foreach colomn
				System.out.print(" ");
			}
			System.out.print("*");
		}
	}

	private static void printDoubleVerticalDelimiter(int firstLinePosition, int width, int heigth) {

		for (int y = 0; y <= heigth; y++) { // foreach row
			printNewLine();
			for (int x = 0; x < firstLinePosition; x++) { // foreach colomn
				System.out.print(" ");
			}
			System.out.print("|");
			for (int x = 0; x < width - 1; x++) {
				System.out.print(" ");
			}
			System.out.print("|");
		}
	}

	private static void printHorisontalDelimiter(int maxX) {
		printNewLine();
		for (int x = -1; x <= maxX; x++) {
			System.out.print("*");
		}
	}

	private static void printHorisontalLine(int fromPosition, int maxX) {
		printNewLine();
		for (int x = 0; x <= fromPosition + maxX; x++) {
			System.out.print((x < fromPosition) ? " " : "-");
		}
	}

	private static void printNewLine() {
		System.out.println();
	}

}
