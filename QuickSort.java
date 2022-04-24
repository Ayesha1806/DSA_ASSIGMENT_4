package DSA_4_practice;


import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 6, 4, 3, 5};
        int start = 0;
        int end = a.length - 1;
        System.out.println("before"+ Arrays.toString(a));
        Quicksort(a, start, end);
        partition(a,start,end);
        System.out.println("after"+ Arrays.toString(a));

    }

    private static void Quicksort(int[] a, int start, int end) {
        if (start > end) {
            return;
        }
        int pi = partition(a, start, end);
        Quicksort(a, start, pi - 1);
        Quicksort(a, pi + 1,end);
    }

    private static int partition(int[] a, int start, int end) {
        int pivote = end;
        int pi = start;
        for (int j = start; j < end; j++) {
            if (a[j] <= a[pivote]) {
                int temp = a[j];
                a[j] = a[pi];
                a[pi] = temp;
                pi++;
            }
        }
        int temp = a[pi];
        a[pi] = a[pivote];
        a[pivote] = temp;
        return pi;
    }
}


