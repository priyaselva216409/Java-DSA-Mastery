// //Recursion: The function  calls itself until the specific condition is satisfied

// Stack space : The memory used to store function calls when they are executed.

// When a function calls another function (or itself in recursion),
// Java stores that function call in a special memory area called the Call Stack


public class SimpleExample {
    static int cnt=0; //static because java does not allow global variables

    static void print(){
        if(cnt==3) return; //base condition
         
        System.out.println(cnt);
        cnt++;
        print(); //recursive call
    }
    public static void main(String[] args){
        print();
    }
}
