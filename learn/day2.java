import java.util.Scanner;

public class day2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // int n = sc.nextInt();
        // int a=100;
        // int m= a++; tang sau
        // m =a=100, a++ => 101
        // ++a; tang trc
        // ++a=101=>m=101
        // a--; giam sau
        // --a; giam trc
        // int b=50;
        // a+=b;  a=a+b
        // a-=b;  a=a-b
        // a*=b;  a=a*b
        // System.out.println(a);
        // int n=21;
        // if(n%2==0)
        // {
        //     System.out.println("Chan");
        // }
        // else{
        //     System.out.println("Le");
        // }
        // if(n%2 == 0){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("NO");
        // }
        // if((n%3==0)&&(n%5==0))
        // {
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("NO");
        // }
        // if((n%3==0)&&(n%7!=0))
        // {
        //     System.out.println("Yes");
        // }
        // else
        // {
        //     System.out.println("NO");
        // }
        // if((n%3==0)||(n%7==0))
        // {
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("NO");
        // }
        // if((n>30)&&(n<50))
        // {
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("NO");
        // }
        // if((n>=30)&&(n%2==0 || n%3==0||n%5==0))
        // {
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("NO");
        // }

        // int donVi=n%10;
        // if((n>=10)&&(n<=99)&&(donVi==2||donVi==3||donVi==5)){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("NO");
        // }
        // int t=sc.nextInt();
        // if(t==1 || t==3||t==5||t==7||t==8||t==10||t==12){
        //     System.out.println("31");
        // }
        // else if(t==2)
        // {
        //     System.err.println("28");
        // }
        // else if(t==4||t==6||t==9||t==11){
        //     System.out.println(30);
        // }
        // else{
        //     System.out.println("khong hop le");
        // }
        double x = sc.nextDouble(),y=sc.nextDouble(),z=sc.nextDouble(),o=sc.nextDouble();
        double dtb= (x+y+2*z+3*o)/7;
        if(dtb>=8){
            System.out.println("Gioi");
        }
        else if(dtb<8&&dtb>=6.5)
        {
            System.out.println("Kha");
        }
        else if(dtb<6.5&&dtb>=5)
        {
            System.out.println("Trung binh");
        }
        else if(dtb<5){
            System.out.println("Yeu");
        }
        System.out.println(dtb);

        //A:Z 65-90
        //a:z 97-122
        //0-9 48-57

        char kiTu='u';
        kiTu -= 32;
        System.out.println(kiTu);
        System.out.println(kiTu-3);
        System.out.println((int)kiTu);
    }
}