package src.com.practise.sort;
import java.util.Arrays;

public class MergeSort {
    public static void merge(int array[], int left, int mid, int right) {
/*int lenghtofLeft=mid-left+1;
int lengthofRight=right-mid;
int leftArrays[]=new int[lenghtofLeft];
int righArrays[]=new int[lengthofRight];

for(int i=0;i<lenghtofLeft;i++)
    leftArrays[i]=array[i+left];
for(int i=0;i<lengthofRight && mid+1+i<array.length-1;i++)
    righArrays[i]=array[mid+1+i];
int leftIndex=0;
int rightIndex=0;
for(int i=left;i<right+1;i++){
    if(leftIndex<lenghtofLeft && rightIndex<lengthofRight){
        if(leftArrays[leftIndex]<righArrays[rightIndex]){
            array[i]=leftArrays[leftIndex];
            leftIndex++;
        }else{
            array[i]=righArrays[rightIndex];
            rightIndex++;
        }
    }

    else if(leftIndex<lenghtofLeft){
        array[i]=leftArrays[leftIndex];
        leftIndex++;
    }
    else if(rightIndex<lengthofRight){
        array[i]=righArrays[rightIndex];
        rightIndex++;
    }


}*/
        // calculating lengths
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        // creating temporary subarrays
        int leftArray[] = new int[lengthLeft];
        int rightArray[] = new int[lengthRight];

        // copying our sorted subarrays into temporaries
        for (int i = 0; i < lengthLeft; ++i) {
            leftArray[i] = array[left + i];
            System.out.println("left vlaue is " + leftArray[i]);
        }

        for (int i = 0; i < lengthRight; ++i) {
            rightArray[i] = array[mid + 1 + i];
            System.out.println("right value is " + rightArray[i] + "size is" + lengthRight + "mid and i is" + mid + "i is " + i);
        }


        // iterators containing current index of temp subarrays
        int leftIndex = 0;
        int rightIndex = 0;
        int temp;
        // copying from leftArray and rightArray back into array
        for (int i = left; i < right + 1; i++) {
            // if there are still uncopied elements in R and L, copy minimum of the two
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;

                } else if (rightArray[rightIndex] < leftArray[leftIndex]) {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // if all the elements have been copied from rightArray, copy the rest of leftArray
            else if (leftIndex < lengthLeft) {
                System.out.println("Iterating left array" + left + "and i is " + i + "and left value is " + leftArray[leftIndex]);
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // if all the elements have been copied from leftArray, copy the rest of rightArray
            else if (rightIndex < lengthRight) {
                System.out.println("Iterating right array" + right);
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void mergeSort(int array[], int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    public static void main(String[] args) {
        int inputarray[] = {8347, 34824, 23, 34384, 2, 884, 47238, 9998};
        mergeSort(inputarray, 0, inputarray.length - 1);
        Arrays.stream(inputarray).forEach(
                data -> {
                    System.out.println(data);
                }

        );

    }

}