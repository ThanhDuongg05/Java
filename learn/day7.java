import java.util.Scanner;

public class day7{

    // public static int uocNguyenTo(int n){
    //     int ans=0;
    //     for(int i=2;i<=Math.sqrt(n);i++){
    //         if(n%i==0)
    //             ++ans;
    //             while(n%i==0){
    //             n/=i;
    //         }
    //     }
    //     if(n>1) ++ans;
    //     return ans;
    // }


    // public static boolean nguyenTo(int n){
    //     if(n<2) return false;
    //     for(int i=0;i<=Math.sqrt(n);i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static boolean check(int n){
    //     int tong=0;
    //     while (n!=0) {
    //         int r=n%10;
    //         if(n!=2 && r!=3 && r!=5 && r!=7){
    //             return false;
    //         }
    //         tong+=r;
    //         n/=10;
    //     }
    //     return  nguyenTo(tong);
    // }

    // //uoc so nguyen to nho nhat
    // public static int uoc(int n){
    //     for(int i=2;i<=Math.sqrt(n);i++){
    //         if(n%i==0){
    //             return i;
    //         }
    //     }
    //     return n;
    // }


    public static int S (int n){
        if(n==0){
            return 0;
        }
        else{
            return n+S(n-1);
        }
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(S(4));
        // System.out.println(uocNguyenTo(60));
        // int a=sc.nextInt(),b=sc.nextInt();
        // int dem=0;
        // for(int i=a;i<=b;i++){
        //     if(check(i)&&nguyenTo(i)){
        //         ++dem;
        //     }
        // }
        // System.out.println(dem);
        // for(int i=1;i<=n;i++){
        //     System.out.println(uoc(i));
        // }
    }
}