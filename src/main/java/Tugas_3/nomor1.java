package Tugas_3;
import java.util.Scanner;
public class nomor1 {
     public static void main (String[] args){
         System.out.println("***** SQUENTIAL SEARCH *****"+"\n");
         String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Kiki H", "Tesla"};
         String input;
         
         Scanner scan = new Scanner(System.in);
         System.out.println("Masukan Data Yang Dicari: ");
         input = scan.nextLine();
         
         System.out.println("Isi Data Yang Dicari: ");
         for (int i=0; i<data.length; i++)   {
             System.out.print(data[i] + " ");
         }
         System.out.println("");
         
         for (int i=0; i<=data.length; i++) {
         if (input.equalsIgnoreCase(data[i])) {
             System.out.print("Data "+input+" berada pada indeks ke - " + i);
             break;
            }
        }
         System.out.println("\n");
         System.out.println();
         System.out.println("***** Terima Kasih *****");
    }
}