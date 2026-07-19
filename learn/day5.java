import java.util.Scanner;

public class day5{
    public static void xinChao(){
        System.out.println("Xin Chao (-,-)");
    }

    // public static int tinhTong(int a,int b){
    //     if(true) //dieu kien luon dung
    //         return 500; // tra ve 500 va ket thuc lun 
    //     int tong=a+b; // se ko bao gio dc thuc hien
    //     return tong;
    // }


    public static int tinhTong(int a,int b){ // tham so
        int tong=a+b;
        return tong;
    }

    //kiem tra n co phai co tong chu so chia het cho 5 ko
    public static boolean checkN(int n){
        int tong=0;
        while(n!=0){
            tong +=n%10;
            n/=10;
        }
        if(tong %5==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void A() {
        System.out.println("A");
    }
    public static void B(){
        A();
        System.out.println("B");
        A();
    }

    public static int tinhSum(int n){
        int sum=0;
        while(n!=0){
            sum +=n%10;
            n/=10;
        }
        return sum;
    }

    public static boolean checkChan(int n){
        if(n%2==0)
            return true;
        else
            return false;
    }

    public static void uocSo(int n){
        int ans=1;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                ans *= i;
                if(i!=n/i){
                ans*=n/i;
                }
            }
        }
        System.out.println(ans);
    }

    public static boolean checkNguyenTo(int n){
        if(n<2)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean thuanNghich(int n){
        int lat=0, tmp=n;
        while(n!=0){
            lat =lat *10+ n%10;
            n/=10;
        }
        if(lat==tmp){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean scp(int n){
        int can=(int)Math.sqrt(n);
        if(can*can==n)
            return true;
        else
            return false;
    }


    public static boolean soLocPhat(int n){
        while(n!=0){
            int r=n%10;
            if(r!=0 && r!=6 && r!=8)
            {
                return false;
            }
            n/=10;
        }
        return true;
    }
    //liet ke cac so co tong chu so chia het cho 5
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        xinChao(); // funtion call
        System.out.println("Tong 5 + 10 = " + tinhTong(5, 10)); // doi so
        System.out.println("123450 co tong chia het cho 5 ko? " + checkN(123450));
        
        System.out.println(checkN(123450));


        System.out.print("Nhap vao so n: ");
        int n = sc.nextInt();
        if (checkChan(tinhSum(n))) {
            System.out.println("Yes (Tong cac chu so cua " + n + " la so chan)");
        } else {
            System.out.println("No (Tong cac chu so cua " + n + " la so le)");
        }


        // 3. liet ke cac so co tong chu so chia het cho 5 tu 1 den n
        System.out.println("Cac so tu 1 den " + n + " co tong chu so chia het cho 5 la:");
        for (int i = 1; i <= n; i++) {
            if (checkN(i)) {
                System.out.print(i + " "); // Dùng print thay vì println để in trên cùng 1 dòng cho dễ nhìn
            }
        }

        uocSo(n);

        if(checkNguyenTo(n)) System.out.println("Yes");
        else System.out.println("No");

        if(thuanNghich(n))System.out.println("Yes");
        else System.out.println("No");

        sc.close(); // Đóng Scanner để giải phóng bộ nhớ (Thói quen tốt)
    }
}