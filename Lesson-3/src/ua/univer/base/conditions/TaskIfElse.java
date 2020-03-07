package ua.univer.base.conditions;

import java.util.Comparator;
import java.util.List;

public class TaskIfElse {

	public void task4() {
		int a = 3, b = -4, c = 2;
		System.out.println(a);
	}
	
	public long countElements(List<Integer> intCollection) {
		return intCollection.stream().count();
	}

	public long positiveCount(List<Integer> intCollection) {
		return intCollection.stream().filter(item -> item > 0).count();
	}

	public long negativeCount(List<Integer> intCollection) {
		return intCollection.stream().filter(item -> item < 0).count();
	}

	public int getMinValue(List<Integer> intCollection) {
		return intCollection.stream().min(Comparator.comparing(Integer::valueOf)).get();
	}

	public int getMaxValue(List<Integer> intCollection) {
		return intCollection.stream().max(Comparator.comparing(Integer::valueOf)).get();
	}

	public void OrderCharValue(List<Character> charCollection) {
		charCollection.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

	public long getCountElementInCollection(List<Integer> intCollection, int compareValue) {
		return intCollection.stream().filter(item -> item == compareValue).count();
	}

	public long calcSumElement(List<Integer> intCollection) {
		return intCollection.stream().reduce(0, Integer::sum);
	}
	
	public float calcAvgElement(List<Integer> intCollection) {
		return (float)calcSumElement(intCollection)/countElements(intCollection);
	}

}
