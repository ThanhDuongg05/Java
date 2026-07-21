import java.util.Scanner;

public class day6 {

    // public static int timUCLN(int a, int b){
    //     // bien doi (a,b) =>(b,a%b)
    //     while(b!=0){
    //         System.out.println((a+" "+ b));
    //         int r=a%b;
    //         a=b;
    //         b=r;
    //     }
    //     return a;
    // }

    // public static int timUCNN(int a,int b){
    //     return a*b/timUCLN(a, b);
	// }	

    public static void phanTich(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                while(n%i==0){
                    System.out.print(i+" ");
                    n/=i;
                }
            }
        }
        if(n>1){ // nay dung cho nhung so co so mu lon hon can bac 2
            System.out.println(n);
        }
    }

    public static boolean checkSNT(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    //fibonance f(n)=f(n-1)+f(n-2)+...
    public static boolean fibo(long n){
        if(n==0 || n==1){
            return true;
        }
        long fn1=1,fn2=0;
        for(int i=2;i<=92;i++){
            long fn=fn1+fn2;
            System.out.println(i+" : "+fn);
            if(fn==n){
                return true;
            }
            fn2=fn1;
            fn1=fn;
        }
        return false;
    }

    public static long fiboNhoNhatLonHonN(long n){
        if(n==1){
            return 1;
        }
        long fn1=1,fn2=0;
        for(int i=3;i<=92;i++){
            long fn=fn1+fn2;
            System.out.println(i+" : "+fn);
            if(fn>=n){
                return fn;
            }
            fn2=fn1;
            fn1=fn;
        }
        return -1;
    }



    public static int bac(int n,int p){
        int sum=0;
        //duyet cac boi cua p<=n
        for(int i=p;i<=n;i+=p){
            int j=i; // dung bien tam dua i vao de chia bien tam cho i ko bi anh huong
            while(j%p==0){
                ++sum;
                j/=p;
            }
        }
        return sum;
    }

    // legendre: 𝐸𝑝(𝑛!)=∑∞𝑘=1⌊𝑛𝑝𝑘
    public static int legendry(int n , int p){
        int sum=0;
        for(int i=p;i<=n;i+=p){
            sum+=n/i;
        }
        return sum;
    }

    // ly thuyet dong du:
    // (A+B)% C =((A%C) +(B%C))%C
    // (A-B)% C =((A%C) -(B%C))%C
    // (A*B)% C =((A%C) *(B%C))%C
    // (A/B)% C =((A%C) /(B^-1%C))%C


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // System.out.println(timUCLN(26,18));
        // System.out.println("________________");
        // System.out.println(timUCNN(26, 18));
        // phanTich(60);
        // long n=sc.nextLong();
        // for(int i=2;i<=Math.sqrt(n);i++)
        // {
        //     if(checkSNT(i)){
        //         System.out.print(1l*i*i+" ");
        //     }
        // }
        int n=sc.nextInt(),p=sc.nextInt();
        // long gt=1;
        // for(int i=1;i<=n;i++){
        //     gt*=i;
        // }
        // int dem=0;
        // while(gt%p==0){
        //     ++dem;            
        //     gt/=p;
        // }
        // System.out.println(dem);
        // System.out.println(fibo(34));
        // System.out.println(fiboNhoNhatLonHonN(32));\
        System.out.println(bac(n,p));
    }
}