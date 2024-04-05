package RecursionQ;// thsi is folder name auto import 
class Function{
    int Fib(int n){
        // System.out.println("hello");
        if(n==0) return 0;
        if(n==1) return 1;
        return Fib(n-1)+Fib(n-2);
     }
     int Fac(int n){
        if(n==1) return 1;
        return n* Fac(n-1);
     }
}

public class Factorial {
    public static void main(String args[]){
    //    int n=Integer.parseInt(args[0]);
       Function f=new Function();
        int ans=f.Fib(6);// here function shoulde define in some class (generally function class)
        int fatANS=f.Fac(6);
        System.out.println(fatANS);
        System.out.println(ans);
    }
}
