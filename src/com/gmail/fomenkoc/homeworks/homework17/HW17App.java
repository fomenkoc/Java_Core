package com.gmail.fomenkoc.homeworks.homework17;

import com.gmail.fomenkoc.homeworks.homework17.classes.Collection;
import com.gmail.fomenkoc.homeworks.homework17.interfaces.Iterator;

public class HW17App {

	public static void main(String[] args) {

		Number[] numbers = { 2, 65, 321, 87, 11, 86, 357, 1165, 64, 74, 21, 33,
				77, 33, 159, 180, 6587, 352, 779, 222, 566, 3332, 1818, 654 };

		Collection col = new Collection(numbers);

		System.out.println("Task 1");

		Iterator iteratorOne = col.createForwardReplaceOdd();

		while (iteratorOne.hasNext()) {
			System.out.println(iteratorOne.next());
		}

		System.out.println();
		System.out.println("Task 2");

		Iterator iteratorTwo = col.createBackwardPairs();

		while (iteratorTwo.hasNext()) {
			System.out.println(iteratorTwo.next());
		}

		System.out.println();
		System.out.println("Task 3");

		Iterator iteratorThree = new Iterator() {
			private int count = Collection.getNumbers().length - 1;
			private int localCounter = 0;

			@Override
			public Object next() {
				count = count - 3;
				if (Collection.getNumbers()[count + 3].doubleValue() % 2 != 0) {
					System.out.println(Collection.getNumbers()[count + 3]);
				}
				return Collection.getNumbers()[count + 3];

			}

			@Override
			public boolean hasNext() {
				return count >= 0;
			}
		};

		while (iteratorThree.hasNext()) {
			iteratorThree.next();
		}

		Iterator iteratorFour = new FifthItem(numbers);

		System.out.println();
		System.out.println("Task 4");

		while (iteratorFour.hasNext()) {
			iteratorFour.next();
		}

		System.out.println();
		System.out.println("Task 5");

		Iterator iteratorFive = col.getStaticClass(numbers);

		while (iteratorFive.hasNext()) {
			iteratorFive.next();
		}

	}
}

class FifthItem implements Iterator {

	private Number[] numbers;
	private int count;

	public FifthItem(Number[] numbers) {
		super();
		this.numbers = numbers;
		this.count = 0;
	}

	public Number[] getNumbers() {
		return numbers;
	}

	public void setNumbers(Number[] numbers) {
		this.numbers = numbers;
	}

	@Override
	public boolean hasNext() {

		return this.count < this.numbers.length;
	}

	@Override
	public Object next() {
		this.count += 5;
		if (this.numbers[count - 5].doubleValue() % 2 == 0) {
			System.out.println(this.numbers[count - 5].doubleValue() - 100);
		}
		return null;
	}

}
