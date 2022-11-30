package org.perscholas.exercise;

import java.util.Arrays;
import java.util.Scanner;

//public void question_2() {
//	 
//}

public class ArrayExercise {

	public static void main(String[] args) {

		ArrayExercise myAnswer = new ArrayExercise();

		myAnswer.question_1();

		myAnswer.question_2();

		myAnswer.question_3();

		myAnswer.question_4();

		myAnswer.question_5();

		myAnswer.question_6();

		myAnswer.question_7();

		myAnswer.question_8();

		myAnswer.question_9();

		myAnswer.question_10();

		myAnswer.question_11();
	}

	public void question_1() {
		System.out.println("\nAnswer for # 1");

		int arr[] = { 1, 2, 3 };

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

	}

	public void question_2() {
		System.out.println("\nAnswer for # 2");

		int arr2[] = { 13, 5, 7, 68, 2 };

		int mid = arr2.length / 2;

		System.out.println(arr2[mid]);
	}

	public void question_3() {
		System.out.println("\nAnswer for # 3");
		String color[] = { "red", "green", "blue", "yellow" };

		System.out.println(color.length);

		String[] newColor = color.clone();

		System.out.println(Arrays.toString(newColor));
	}

	public void question_4() {
		System.out.println("\nAnswer for # 4");

		int[] myArray = new int[5];

		myArray[0] = 25;
		myArray[1] = 26;
		myArray[2] = 27;
		myArray[3] = 28;
		myArray[4] = 29;

		System.out.println(myArray[0]);

		System.out.println(myArray[myArray.length - 1]);

//		System.out.println(myArray[myArray.length]);

//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//		at org.perscholas.exercise.ArrayExercise.question_4(ArrayExercise.java:72)
//		at org.perscholas.exercise.ArrayExercise.main(ArrayExercise.java:22)

//		myArray[5] = 30;

//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//		at org.perscholas.exercise.ArrayExercise.question_4(ArrayExercise.java:80)
//		at org.perscholas.exercise.ArrayExercise.main(ArrayExercise.java:22)
	}

	public void question_5() {
		System.out.println("\nAnswer for # 5");

		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}

		System.out.println(Arrays.toString(array));
	}

	public void question_6() {
		System.out.println("\nAnswer for # 6");

		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = i * 2;
		}

		System.out.println(Arrays.toString(array));
	}

	public void question_7() {
		System.out.println("\n Answer for # 7");

		int[] array = { 12, 23, 34, 45, 56 };
		int mid = array.length / 2;

		for (int i = 0; i < array.length; i++) {
			if (i != mid) {
				System.out.println(array[i]);
			}

		}

	}

	public void question_8() {
		System.out.println("\n Answer for # 8");

		int[] array = { 12, 23, 34, 45, 56 };

		int mid = array.length / 2;

		int temp = array[0];
		array[0] = array[mid];
		array[mid] = temp;

		System.out.println(Arrays.toString(array));

	}

	public void question_9() {
		System.out.println("\n Answer for # 9");

		int[] array = { 4, 2, 9, 13, 1, 0 };

		for (int i = 0; i < array.length; i++) {
			int small = array[i];
			for (int j = i + 1; j < array.length; j++) {

				if (array[j] < small) {

					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}

		System.out.println("Array in ascending order: " + Arrays.toString(array));

		System.out.println("The smallest number is: " + array[0]);

		System.out.println("The biggest number is : " + array[array.length - 1]);
	}

	public void question_10() {
		System.out.println("\n Answer for # 10");

		Object[] array = { 3, "second", 12.14 };

		System.out.println(Arrays.toString(array));

	}

	public void question_11() {
		System.out.println("\n Answer for # 10");

		Scanner sc = new Scanner(System.in);

		System.out.println("How many favorite things do you have?");

		int val = sc.nextInt();
		String[] array = new String[val];
		sc.nextLine();
		int i = 0;

		while (i < array.length) {

			System.out.println("Enter your thing:");
			
			String ss = sc.nextLine();
			array[i] = ss;
			i++;
		}
		System.out.println("Your favorite  things are:" + Arrays.toString(array));

		sc.close();

	}

}// class
