package com.gmail.fomenkoc.homeworks.homework17.classes;

import com.gmail.fomenkoc.homeworks.homework17.interfaces.Iterator;

public class Collection {

	private static Number[] numbers;

	public Collection(Number[] numbers) {
		super();
		this.numbers = numbers;
	}

	public static Number[] getNumbers() {
		return numbers;
	}

	public static void setNumbers(Number[] numbers) {
		Collection.numbers = numbers;
	}

	public class ForwardReplaceOdd implements Iterator {

		private int count = 0;

		@Override
		public boolean hasNext() {
			return count < numbers.length;
		}

		@Override
		public Object next() {
			if (count % 2 != 0) {
				count++;
				return 0;
			} else {
				return numbers[count++];
			}
		}

	}

	public class BackwardPairs implements Iterator {

		private int count = Collection.numbers.length - 1;

		@Override
		public boolean hasNext() {

			return count >= 0;
		}

		@Override
		public Object next() {
			count = count - 2;
			return Collection.numbers[count + 2];

		}

	}

	private static class StaticClass implements Iterator {
		private static Number[] numbers;
		private static int count;

		public Number[] getNumbers() {
			return numbers;
		}

		public void setNumbers(Number[] numbers) {
			this.numbers = numbers;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		@Override
		public boolean hasNext() {

			return count < numbers.length;
		}

		@Override
		public Object next() {
			if (count % 2 == 0) {
				if (StaticClass.numbers[count].doubleValue() % 2 == 0) {
					StaticClass.numbers[count] = StaticClass.numbers[count]
							.doubleValue() + 1;
					System.out.println(StaticClass.numbers[count]);
				}
			}
			count++;
			return null;
		}

	}

	public ForwardReplaceOdd createForwardReplaceOdd() {

		return new ForwardReplaceOdd();
	}

	public BackwardPairs createBackwardPairs() {

		return new BackwardPairs();
	}

	public StaticClass getStaticClass(Number[] numbers) {
		StaticClass.numbers = numbers;
		return new StaticClass();
	}

}
