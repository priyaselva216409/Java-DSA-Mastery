import java.util.Arrays;
public class ReverseAnArray {
    // Recursive function using two pointers
    public static void reverse(int l,int r,int[] arr){

        // Base Case: Stop when pointers meet or cross
        if(l>=r){
            return;
        }
       // Swap elements at l and r
       int temp=arr[l];
       arr[l]=arr[r];
       arr[r]=temp;
    
       // Recursive call: move l forward and r backward
             reverse(l+1,r-1,arr);
             
    }
     
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
             int n =arr.length;

            System.out.println("Before: "+Arrays.toString(arr));

        // Initial call with first index (0) and last index (n-1)
              reverse(0,n-1,arr);

            System.out.println("After: "+Arrays.toString(arr));
    }
}
