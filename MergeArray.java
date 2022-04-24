package DSA_4_practice;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] a={3,4,1,6,8,2};
        int start=0;
        int end=a.length-1;
        System.out.println("before "+Arrays.toString(a));
        MergeSort(a,start,end);
        //Merge(a,start,end,mid);

        System.out.println("after "+Arrays.toString(a));

    }

    private static void MergeSort(int[] a, int start, int end) {
        if(start>=end) {
            return;
        }
        else {
            int mid = (start + end) / 2;
            MergeSort(a, start, mid);
            MergeSort(a, mid + 1, end);
            Merge(a, start, end, mid);
        }
    }

    private static void Merge(int[] a, int start, int end, int mid) {
        int i=start;
        int j=mid+1;
        int k=0;
        int[] temp=new int[(end-start)+1];
        while (i<=mid && j<=end){
            if(a[i]<=a[j]){
               temp[k]=a[i];
               k++;
               i++;
            }
            else{
                temp[k]=a[j];
                k++;
                j++;
            }
        }
        while(i>mid && j<=end){
            temp[k]=a[j];
            k++;
            j++;
        }
        while (j>end && i<=mid){
            temp[k]=a[i];
            k++;
            i++;
        }
        for(int m=start;m<=end;m++){
            a[m]=temp[m-start];
        }

    }
}
