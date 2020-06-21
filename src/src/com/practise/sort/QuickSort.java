package src.com.practise.sort;

import java.util.Arrays;

public class QuickSort {
    public static void quickSortRecursion(int array[],int low,int high){
        int pi=quickSortPivotDetermine(array,low,high);
        if(low<pi-1){
            quickSortRecursion(array,low,pi-1);
        }
        if(pi<high){

            quickSortRecursion(array,pi,high);
        }
    }
    public static int quickSortPivotDetermine(int array[],int low,int high){
        int pivotElement=(low+high)/2;
        while(low<=high){
            while(array[low]<array[pivotElement]){
                low++;
            }
            while(array[high]>array[pivotElement]){
                high--;
            }
            if(low<=high){
                int temp=array[low];
                array[low]=array[high];
                array[high]=temp;
                low++;
                high--;

            }
        }
        return low;
    }
    public static  void main(String args[]){
        int inputarray[] = {8347, 34824, 23, 34384, 2, 884, 47238, 9998};
         quickSortRecursion(inputarray,0,inputarray.length-1);
        Arrays.stream(inputarray).forEach(
                data -> {
                    System.out.println(data);
                }

        );

    }
}
