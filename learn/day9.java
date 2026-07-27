import java.util.Scanner;
import java.util.Comparator;
public class day9{

    public static int tong(int n){
        int ans=0;
        while(n!=0){
            ans+=n%10;
            n/=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // int n= sc.nextInt();
        // int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        // sap xep thi dung Integer Long chu dung int long la bi loi
        //sap xep tang dan
        // Array.sort(a,2,5);//O(NlogN):10^7: Tim sort
        // //i=2=>i=4
        // for(int i=0;i<n;i++){
        //     System.out.print(a[i]+" ");
        // }
         Integer [] a ={1,4,111,5,7,996,13};
        Array.sort(a,new Comparator<Integer>(){
            @Override
            public int compare(Interger o1, Integer o2){
                if(tong(o1)!=tong(o2)){
                    if(tong(o1)<tong(o2)){
                        return -1;
                    }
                    else{
                        return 1;
                    }
                }
                else{
                    if(o1<o2) return -1;
                    else(return 1;)
                }
            }
        });
        for(int x:a){
            System.out.print(x+" ");
        }

        Array.sort(a,new Comparator<Integer>(){
            @Override
            public int compare(Interger o1, Integer o2){
                if(tong(o1)<tong(o2)){
                        return -1;
                }
                    else{
                        return 1;
                    }
            }
        });
        for(int x:a){
            System.out.print(x+" ");
        }


        
        Integer [] a ={1,4,2,5,7,6,3};
        Array.sort(a,new Comparator<Integer>(){
            @Override
            public int compare(Interger o1, Integer o2){
                //tra ve -1 hoac 1(1 so am hoac 1 so duong)
                //neu ban muon o1 xuat hien truoc o2 trong thu tu sap xep => tra ve -1
                // neu ban mjuon o1 xuat hien sau o2 => tra ve 1
                if(o1<o2){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });
        for(int x:a){
            System.out.print(x+" ");
        }

        Integer [] a ={1,4,-2,5,-7,-6,3};
        Array.sort(a,new Comparator<Integer>(){
            @Override
            public int compare(Interger o1, Integer o2){
                if(Math.abs(o1)<Math.abs(o2)){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });
        for(int x:a){
            System.out.print(x+" ");
        }

        //gia tri giong nhau thi dung va in ra 
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }
        // for(int i=0;i<n;i++){
        //     //neu a[i] la gia tri dau tien ma ban gap => a[i]
        //     boolean seen=false;
        //     for(int j=0;j<i;j++){
        //         if(a[i] == a[j])
        //         {
        //             seen=true;
        //             break;
        //         }
        //     }
        //     if(seen == false){
        //         System.out.print(a[i]+" ");
        //     }
        // }


        // dem gia tri khac nhau
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }
        // int dem=0;
        // for(int i=0;i<n;i++){
        //     //neu a[i] la gia tri dau tien ma ban gap => a[i]
        //     boolean seen=false;
        //     for(int j=0;j<i;j++){
        //         if(a[i] == a[j])
        //         {
        //             seen=true;
        //             break;
        //         }
        //     }
        //     if(seen == false){
        //         ++dem;
        //     }
        // }
        // System.out.println(dem);


        //tan suat xuat hien 
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }
        
        // for(int i=0;i<n;i++){
        //     // in ra a[i] kem theo tan suat cua no
        //     boolean check =true;
        //     for(int j=0;j<i;j++){
        //         if(a[i] == a[j]){
        //             check=false;
        //             break;
        //         }
        //     }
        //     if(check){
        //         int dem=1;
        //         for(int j=i+1;j<n;j++){
        //             if(a[i]==a[j]) ++dem;
        //         }
        //         System.out.println(a[i]+" "+dem);
        //     }
        // }

        //c2:
        // danh dau khi ko la so am
        // loi la rat nhanh
        // int [] cnt=new int[1000001];
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }
        // for(int i=0;i<n;i++){
        //     cnt[a[i]]=1;
        // }
        // int dem=0;
        // for(int i=0;i<=1000000;i++){
        //     System.out.println(i+" "+cnt[i]);
        //     if(cnt[i]==1){
        //         ++dem;
        //     }
        // }
        // System.out.print(dem);


        // int [] cnt=new int[1000001];
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }
        // for(int i=0;i<n;i++){
        //     cnt[a[i]]++;
        // }
        // int dem=0;
        // for(int i=0;i<=1000000;i++){
        //     if(cnt[i]!=0){
        //     System.out.println(i+" "+cnt[i]);
        //     }
        // }  


    }
}