package DSA_4;


import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a1={1,3,4,5};
        int[] a2={2,4,6,8};
        int start=0;
        int mid1= a1.length;

        int end=a2.length;





        int[] temp=new int[(a1.length+a2.length)];
        int i=0;
        int j=0;
        int k=0;
        while (i<mid1 && j<end){
            if(a1[i]<a2[j]){
                temp[k]=a1[i];
                k++;
                i++;
            }
            else{
                temp[k]=a2[j];
                k++;
                j++;
            }
        }
        while (i<mid1){
            temp[k]=a1[i];
            k++;
            i++;
        }
        while (j<end){
            temp[k]=a2[j];
            k++;
            j++;
        }
        System.out.println(Arrays.toString(temp));

    }
}
