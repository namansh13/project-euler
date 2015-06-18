package ch;

import java.util.*;

public class QuickSort {
	public static void main(String[] args) {
		// int[] a = { 3, 4, 2, 1, 7, 5, 3, 79, 8 };
		List<Integer> a = new LinkedList<Integer>();
		a.add(3);
		a.add(4);
		a.add(2);
		a.add(1);
		System.out.println(a);
		a = quicksort(a);
		// a = QuickSort.quicksort(a);
		System.out.println(a);
		System.out.println(args.length);
		
	}

	public static <E extends Comparable<? super E>> List<E> quicksort(List<E> a) {
		if (!a.isEmpty()) {
			E pivot = a.get(0);
			List<E> less = new LinkedList<E>();
			List<E> more = new LinkedList<E>();
			List<E> equal = new LinkedList<E>();
			
			for (E i : a) {
				if (i.compareTo(pivot) < 0)
					less.add(i);
				else if (i.compareTo(pivot) > 0)
					more.add(i);
				else
					equal.add(i);
			}
			System.out.println(less+" "+more);
			less = quicksort(less);
			more = quicksort(more);
			less.addAll(equal);
			less.addAll(more);
			return less;
		}
		return a;
	}
}
