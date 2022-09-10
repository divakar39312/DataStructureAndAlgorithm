package com.Bridgelabz;

public class BubbleSort {
	
	public void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}


	public void printArray1(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

//Main method
	public static void main(String args[]) {
		BubbleSort ob = new BubbleSort();
		int arr[] = { 21, 44, 25, 12, 22, 16, 80 };
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray1(arr);
	}
}
