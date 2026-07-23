import java.util.Scanner;

public class day8{

    
    public static int S(int n){
        if(n==0){
            return 0;
        }
        else{
            return n*n+S(n-1);
        }
    }

    public static int Tong(int n){
        if(n==1){
            return 1;
        }
        else{
            //return (int) Math.pow(-1,n)*n+S(n-1);
            if(n%2==0){
                return n+S(n-1);
            }
            else{
                return -n+S(n-1);
            }
        }
    }

    public static int GT(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*GT(n-1);
        }
    }

    public static int Fibo(int n){
        if(n<=1){
            return n;
        }
        else{
            return Fibo(n-1)+Fibo(n-2);
        }
    }
    //tinh fibo bang vong lap thi ngan gon hon


    public static int toHop(int n,int k){
        if(k==0||k==n){
            return 1;
        }
        else{
            return toHop((n-1), k-1)+toHop((n-1), k);
        }
    }


    //luy thua nhi phan
    public static int mod =1000000007;
    public static long binpow(long a,long b){
        if(b==0){
            return 1;
        }
        //dii tinh a^b/2
        long x=binpow(a, b/2);
        if(b%2==1){
            return ((x%mod)*(x%mod)%mod *(a%mod))%mod;
        }
        else{
            return (x%mod)*(x%mod)%mod;
        }
    }

    //chuyen thap phan sang nhi phan
    public static void thapSangNhi(long n){
        if(n == 0 )return;
        else{
            thapSangNhi(n/2);
            System.out.print(n%2);
        }
    }

    //thap luc sang nhi
    public static void dq(long n){
        if(n==0){
            return;
        }
        else{
            dq(n/16);
            long r=n%16;
            if(r<9){
                System.out.print(r);
            }
            else{
                //10=>A,11=>B
                System.out.print((char)(r+55));
            }
        }
    }

    // in phai qua trai
    public static void in1(long n){
        if(n<10){
            System.out.print(n);
        }
        else{
            System.out.print(n%10);
            in1(n/10);
        }
    }
    public static void in2(long n){
        if(n<10){
            System.out.print(n);
        }
        else{
            in2(n/10);
            System.out.print(n%10+"");
        }
    }

    public static int chan(long n){
        if(n<10){
            if(n%2==0){
                return n;
            }
            else{
                return 0;
            }
        }
        else{
            if(n%2==0){
                return n%10+chan(n/10);
            }
            else{
                return chan(n/10);
            }
        }
    }

    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(S(4));
        System.out.println(binpow(2, 1000000000L));
        thapSangNhi(22);
        System.out.println("");
        dq(762);
        System.out.println("");
        in1(23213);
        System.out.println("");
        in2(23213);
        

        // int []a=new int[100];// xin cap phat mang 100 phan tu va su dung de quan ly
        // float []b=new float[100];
        // char[]c=new char[50];

        
        int n=sc.nextInt();
        int []a=new int[n];
        // //thong qua chi so
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(a[i]+" ");
        // }


        // // duyet mang bang for each
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }
        // for(int x:a){
        //     System.out.print(x+" ");
        // }

        //dem xem mang co bao nhiu cap phan tu co tong bang k
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=10,count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]+a[j]==k){
                    count++;
                }
            }
        }


        //trung binh cong
        int dem=0;
        int tong=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(kt(a[i])){
                tong+=a[i];
                dem++;
            }
        }
        System.out.printf("%.3f",(double)tong/dem);
    }
    public static boolean kt(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}


// int n=sc.nextInt();
// int[]a=new int[n];
// for(int i=0;i<n;i++){
//     a[i]=sc.nextInt();
// }
// int maxElenment=a[0],minElemnet=a[0];
// for(int i=1;i<n;i++){
//     if(a[i]>maxElenment){
//         maxElenment=a[i];
//     }
//     if(a[i]<minElemnet){
//         minElemnet=a[i];
//     }
//     System.out.println(maxElenment+" "+minElemnet);
// }

// public static doubling(int a[],int n){
//     for(int i=0;i<n;i++){
//         a[i]*=2;
//     }
// }
// duoi ham main 
// goi ham 
// doubling(a,n);
// for(int x:a){
//     System.out.print(x+" ");
// }