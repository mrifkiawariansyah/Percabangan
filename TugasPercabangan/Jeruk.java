package TugasPercabangan;
import java.util.Scanner;
public class Jeruk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan jumlah jeruk yang ingin dibeli: ");
        int jumlah = scanner.nextInt();
        int totalHarga;
        if (jumlah == 1) {
            totalHarga = 3000;
        } else if (jumlah == 2) {
            totalHarga = 5000;
        } else if (jumlah == 5) {
            totalHarga = 10000;
        } else if (jumlah % 5 == 0){
            totalHarga = jumlah * 10000 / 5;
        } else if (jumlah > 5) {
            totalHarga = (jumlah / 5) * 10000 + (jumlah % 5) * 3000 - 1000;
        } else {
            totalHarga = 0;
        }
        System.out.println("beli" + jumlah + " = " + totalHarga + "Rupiah");
        scanner.close();


    }
}
