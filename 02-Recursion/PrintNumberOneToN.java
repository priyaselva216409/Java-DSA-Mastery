//TC and Sc = O(n)
public class PrintNumberOneToN{
    public static void print1toN(int i,int n){
        //Base Class
        if(i>n){
            return;
        }
        //Print the current number
        System.out.println(i);

        //Recursive call
        print1toN(i+1,n);

    }
    public static void main(String[] args){
        int n=4;
        print1toN(1,n);
    }
}
