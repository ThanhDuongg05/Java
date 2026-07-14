import java.util.Scanner;

public class day1{
    public static void main(String[] args)
    {
        // int a=100;
        // long b= 120301203099099992L;
        // float PI=3.14F;
        // double d=1.23919239D;
        // boolean check = true;
        // System.out.println ("Gia tri cua a la: " + a);
        // System.out.println("Gia tri cua b la: " + b);
        // System.out.printf("Gia tri cua PI la: " + "%.2f\n" ,PI);
        // System.out.printf("Gia tri cua d la: " + "%.5f\n" ,d);
        
        
        
        Scanner sc =new Scanner(System.in);
        // int a;
        // a=sc.nextInt();
        // System.out.println("Gia tri cua a la:" + a);
        // float b = sc.nextFloat();
        // System.out.println("Gia tri cua b la: " + b);
        // char kiTu=sc.nextLine().charAt(0);
        // System.out.println("Ki Tu la: " +kiTu);
        // int a= sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        // System.out.println(a+","+b+","+c);
        int a=10;
        int b=2;
        int tong = a+b;
        int hieu = a-b;
        int tich = a*b;
        float thuong =a/b; // chia nguyen
        int thuongDu = a%b; // chia du
        System.out.println("gia tri cua tong la: "+ tong);
        System.out.println("gia tri cua hieu la: "+ hieu);
        System.out.println("gia tri cua tich la: "+ tich);
        System.out.printf("gia tri cua thuong la: "+"%.2f\n", thuong);
        System.out.println("gia tri cua thuong du la: "+ thuongDu);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        //abs: tri tuyet doi
        System.out.println(Math.abs(a));
        //sqrt: can bac 2 tra ve double
        int c =10;
        System.out.println(Math.sqrt(c));
        //pow: luy thua tra ve double
        System.out.println(Math.pow(a, b));
        int luyThua=(int)(Math.pow(a,b)); //ep kieu tu double sang int
        System.out.println(luyThua);
        System.out.println(Math.min(a, b));
        System.out.println(Math.max(a, b));

        //ham lam tron so: ceil(lam tron len) floor(lam tron xuong) round(lam tron phu thuoc vao thap phan)
        float d=2.67F;
        System.out.println((int)Math.ceil(d));
        System.out.println((int)Math.floor(d));
        System.out.println((int)Math.round(d));

        int x =1000000;
        int y=1000000;
        long Tich = (long)x * y ;
        System.out.println(Tich);
    }
}
