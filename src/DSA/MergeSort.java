package DSA;
import java.util.Arrays;

public class MergeSort {


    public static void main(String args[]){

        System.out.println("welcome Merge Sort");

        int[] a = {6,5,7,3,8,2,4,1};
        MergeSort mergeSort = new MergeSort();

       mergeSort.mergesort(a);
       System.out.println("Elements after mergesort");
       for(int i=0; i<a.length; i++){

        System.out.println(a[i]);
       }
    }


    private void mergesort(int[] a){

      int middle = a.length/2;

      if(a.length<2){
        return;
      }


      int[] lefthalf = new int[middle];
      int[] righthalf = new int[a.length-middle];


      for(int i=0; i<middle; i++){
        lefthalf[i] = a[i];
      }

      for(int i=middle; i<a.length; i++){
        righthalf[i-middle] = a[i];
      }

      mergesort(lefthalf);
      mergesort(righthalf);

      merge(a, lefthalf, righthalf);


    }


   private void merge(int a[], int lefthalf[], int[] righthalf){

    int i=0, j=0, k=0;

    while(i<lefthalf.length && j<righthalf.length){
        if(lefthalf[i] <= righthalf[j]){
            a[k] = lefthalf[i];
            i++;
            k++;
        }else{
            a[k] = righthalf[j];
            j++;
            k++;
        }
    } 
    while (i<lefthalf.length) {

        a[k] = lefthalf[i];
        i++;
        k++;
    }
    while (j<righthalf.length) {

        a[k] = righthalf[j];
        j++;
        k++;
    }

    }


    
}
