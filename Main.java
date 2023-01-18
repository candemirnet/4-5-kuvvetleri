import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n , i2;
        Scanner imp = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        n = imp.nextInt();

        System.out.println("4'ün Kuvvetleri");
        for(int i = 1; i<= n;  i*=4){
            System.out.println(i);
         }
        System.out.println("5'in Kuvvetleri");
        for(i2 = 1;i2 <=n; i2*=5){
            System.out.println(i2);
        }
    }
}