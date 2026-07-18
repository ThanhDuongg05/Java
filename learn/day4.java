import java.util.Scanner;

public class day4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        //    int n=3;
        //    int i=1;
        //    while(i<=n){
        //     System.out.println(i);
        //     if(n%2==1)
        //     {
        //         continue;
        //     }
        //     i++;
        //    }

        // int n=12345;
        // // Dem chu so,tih tong chu so,dem chu so chan, chu so le,...
        // int dem=0;
        // while(n!=0){
        // ++dem;
        // n/=10;
        // }
        // System.out.println(dem);

        // int n=sc.nextInt();
        // int dem=0;
        // while(n!=0 && n>=0){
        //     ++dem;
        //     n/=10;
        // }
        // System.out.println(dem);
        

        // int n=sc.nextInt();
        // int sum=0;
        // //c1
        // while (n!=0 && n>0) {
        //     long temp=0;
        //     sum+=temp;
        //     n/=10;
        // }
        // System.out.println(sum);

        // //c2
        // while (n!=0&&n>0) {
        //     sum+=n%10;
        //     n/=10;
        // }
        // System.out.println(sum);

        // long n=sc.nextLong();
        // long chaiBia=n/28;
        // long voChai=n/28;
        // while(voChai>=3){
        //     long temp = voChai/3;
        //     chaiBia+=temp;
        //     voChai=temp+voChai%3;
        // }
        // System.out.println(chaiBia);

        //do while
        // int n=1;
        // do{
        //     System.out.println(n);
        //     n++;
        // }while(n<=4);


        //vong for long nhau
        // for(int i=0;i<=3;i++)
        // {
        //     System.out.println("ABC");
        //     for(int j=0;j<=2;j++){
        //         System.out.println(i+" "+j);
        //         if(j==3){
        //             break;
        //         }
        //     }
        //     System.out.println("XYZ");
        // }

        // //break bang nhan
        // duong:for(int i=0;i<=3;i++)
        // {
        //     System.out.println("ABC");
        //     for(int j=0;j<=2;j++){
        //         System.out.println(i+" "+j);
        //         if(j==3){
        //             break duong;
        //         }
        //     }
        //     System.out.println("XYZ");
        // }
            // *****
            // *****
            // *****
            // *****
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        
        //duong bien
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        //cheo chinh
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //cheo phu
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        //tren phai chinh
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //duoi phai chinh
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        

        //tren trai
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j<n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
