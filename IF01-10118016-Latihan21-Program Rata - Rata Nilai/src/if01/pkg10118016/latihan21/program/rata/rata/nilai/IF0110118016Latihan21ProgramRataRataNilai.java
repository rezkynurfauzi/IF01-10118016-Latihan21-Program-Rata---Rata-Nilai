/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan21.program.rata.rata.nilai;
import java.util.Scanner;
/**
 *
 * @author Rezky
 */
public class IF0110118016Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumlahMhs;
        int[]  nilaiMhs = new int[10];
        double rataNilai = 0 ;
        
        //input
        System.out.print("Masukkan banyaknya mahasiswa : ");
        Scanner tempMhs = new Scanner(System.in);
        jumlahMhs = tempMhs.nextInt();
        
        //perhitungan dan output
        for(int i= 1 ; i<=jumlahMhs ; i++){
            System.out.print("Masukkan nilai mahasiswa ke- " + i + " : ");
            Scanner tempNilai = new Scanner(System.in);
            nilaiMhs[i] = tempNilai.nextInt();
            rataNilai += nilaiMhs[i];
            
        }
        System.out.println("Rata-rata Nilai dari Mahasiswa adalah : " + (rataNilai / jumlahMhs));
        System.out.println("(Develovep by Rezky Nur Fauzi)");
    }
    
}
