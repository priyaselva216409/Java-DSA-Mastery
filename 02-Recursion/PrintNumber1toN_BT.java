//TC and Sc = O(n)
//writing priting statement after function call - backtracking
public class PrintNumber1toN_BT{
    public static void print1toN(int i,int n){
        //Base Class
        if(i>n){
            return;
        }

       //Recursive call
        print1toN(i+1,n);

        //Print the current number
        System.out.println(i);

    }
    public static void main(String[] args){
        int n=4;
        print1toN(1,n);
    }
}