package TugasPercabangan;
import java.util.Scanner;
public class pecahan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahUang,u100rb,u50rb,u20rb,u10rb,u5rb,u2rb,u1rb,u500,u200,u100;
        System.out.print("Masukkan uang: ");
        jumlahUang = sc.nextInt();

        u100rb = jumlahUang / 100000;
        jumlahUang = jumlahUang % 100000;
        System.out.println(u100rb+ " Lembar 100000");

        u50rb = jumlahUang / 50000;
        jumlahUang = jumlahUang % 50000;
        System.out.println(u50rb+ " Lembar 50000");

        u20rb = jumlahUang / 20000;
        jumlahUang = jumlahUang % 20000;
        System.out.println(u20rb+ " Lembar 20000");

        u10rb = jumlahUang / 10000;
        jumlahUang = jumlahUang % 10000;
        System.out.println(u10rb+ " Lembar 10000");

        u5rb = jumlahUang / 5000;
        jumlahUang = jumlahUang % 5000;
        System.out.println(u5rb+ " Lembar 5000");

        u2rb = jumlahUang / 2000;
        jumlahUang = jumlahUang % 2000;
        System.out.println(u2rb+ " Lembar 2000");

        u1rb = jumlahUang / 1000;
        jumlahUang = jumlahUang % 1000;
        System.out.println(u1rb+ " Lembar 1000");

        u500 = jumlahUang / 500;
        jumlahUang = jumlahUang % 500;
        System.out.println(u500+ " keping 500");

        u200 = jumlahUang / 200;
        jumlahUang = jumlahUang % 200;
        System.out.println(u200+ " keping 200");

        u100 = jumlahUang / 100;
        jumlahUang = jumlahUang % 100;
        System.out.println(u100+ " Keping 100");
        sc.close();
    }
}
