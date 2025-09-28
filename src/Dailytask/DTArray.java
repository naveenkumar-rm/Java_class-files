package Dailytask;

import java.util.Arrays;

public class DTArray {
    public static void main(String[] args) {
                int[] arr = {1,3,4,5,6,7,8,9};
                int n = arr.length;

                // Ascending order
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }

                System.out.print("ascending: ");
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println();

                // Descending order
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j] < arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }

                System.out.print("descending: ");
                for (int num : arr) {
                    System.out.print(num + " ");
                }

            }
        }
