/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidi_uap_ratih;
 import java.util.Scanner;
/**
 *
 * @author Ratih Mardianingsih
 */
public class Remidi_uap_ratih {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan=new
            Scanner(System.in);
        int tahun;
        String jurusan = null;
        String choice;
        String nim, nama;
        do{
            System.out.print("masukkan NIM:");
            nim = masukan.nextLine();
            System.out.print("masukkan NAMA:");
            nama = masukan.nextLine();
            
            System.out.println("nim =" +nim);
            System.out.println("nama=" +nama);
            
            String[] arrayke = nim.split("\\.");
            tahun = Integer.parseInt(arrayke[0]);
            
            System.out.println("Tahun ajaran :" + "20" + tahun + "-20" + (tahun + 1));
            
            if(arrayke[1].equals("31")){
                jurusan = "D3-Sistem Informasi";
           } else if (arrayke[1].equals("51")){
                jurusan = "S1-Sistem Informasi";     
           }  else if(arrayke[1].equals("52")){
                jurusan = "S1-Teknologi Informatika";
           } else {
               jurusan = "tidak dapat menemukan jurusan dari nim anda";
           }
            
            System.out.println("jurusan =" + jurusan);
            System.out.println("no urut masuk =" + arrayke[2].replaceAll("\\b0+(?!\\b)",""));
            
            System.out.print("Apakah anda ingin memasukkan data lagi [ya/tidak]:");
            choice = masukan.nextLine();
            
        }while(choice.equals("ya")|| choice.equals("YA")|| choice.equals("y"));
        System.exit(0);
    }
    
}
