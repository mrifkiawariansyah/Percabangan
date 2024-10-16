package TugasPercabangan;
import java.util.Scanner;
public class LulusTidakLulus {
    public static void main(String[] args) {
       int nilai;
       Scanner sc = new Scanner(System.in);
       System.out.print("Masukan nilai akhir: " );
       nilai = sc.nextInt();
       if(nilai >= 75){
        System.out.println("Anda dinyartakan lulus");
       }else{
        System.out.println("Anda tidak lulus");
       }sc.close();

    }
    
}
