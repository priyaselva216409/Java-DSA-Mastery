public class PrintNumbers{
    static void print(int n){
        //Base Case
        if(n==0){
            return;
        }
        //Recursive call
        print(n-1);

        //work after recursion
        System.out.println(n);
    }
    public static void main(String[] args){
        int n=5;
        print(n);
    }
}