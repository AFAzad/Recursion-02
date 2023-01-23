/* Check if an Array is sorted(Strictly Increasing) */
public class ArrSorted {

    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1){ //base case
            return true;
        }

        if(arr[idx] <arr[idx+1]){
            return isSorted(arr, idx+1); // if array is not sorted
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        int arr[] = {5, 7 , 9 , 11, 13, 17};
        

        System.out.print(isSorted(arr, 0)+" "); // Checking 


    }
}
