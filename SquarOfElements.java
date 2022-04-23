package DSA_4;

import java.util.Arrays;

public class SquarOfElements {
    public static void main(String[] args) {
        int[] a={1,2,6,5,-7,17,-18};
        for(int i=0;i<a.length;i++){
            a[i]=a[i]*a[i];
        }
        System.out.println(Arrays.toString(a));
    }
}
