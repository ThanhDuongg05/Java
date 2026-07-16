import java.util.Scanner;

public class day3
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // for(int i=1;i<=10;i++){
        //     System.out.println(i);
        //     i+=1;
        // }


        // int n=sc.nextInt();
        // for(int i =0;i<=n;i++)
        // {
        //     System.out.println("hello World!");
        // }


        // int a=10,b=20;
        // for(int i = a;i<=b;i++){
        //     System.out.print(i+" ");
        // }
        // ngc lai



        //in ra cac so chan trong doan tu 1 toi n
        // int n=sc.nextInt();
        // for(int i=1;i<n;i++)
        // {
        //     if(i%2==0){
        //         System.out.print(i);
        //     }
        // }

        // int n=sc.nextInt();
        // long S=0;
        // for(int i=1;i<=n;i++){
        //     S+=i;
        // }
        // System.out.println(S);

        for(int i=1;i<=5;i++){
            System.out.println(i);
            if(i==3){
                break;// dung neu bang
            }
            System.out.println("Hello");
        }
        for(int i=1;i<=5;i++){
            System.out.println(i);
            if(i==3){
                continue;//no quay lai vong lap moi va bo qua cau lenh duoi
            }
            System.out.println("Hello");
        }
    }
}