package demo;

public class Factorial {
    public static int fact(int n){
        int f=1,t=n;
        if(n==0)
            return 1;
        else {
            for(int i=1;i<=n;i++){
                f = f *i;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        int n = 5;
       int f1= fact(n);
        System.out.println("Factorials of "+ n +" is "+f1);

    }
}
