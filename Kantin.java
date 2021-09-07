/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kantin;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Kantin {

    public int Harga;

    public void menu(String hari, String waktu) {

        if ("senin".equals(hari) && "pagi".equals(waktu)) {
            System.out.println("Tahu");
            Harga = 8000;
           
            
                
            }
            if("senin".equals(hari) && "siang".equals(waktu)){
                System.out.println("Ayam panggang");
                Harga =8500;
        }
            if("senin".equals(hari) && "malam".equals(waktu)){
                System.out.println("Jahir Bakar");
                Harga = 10000;
            }
            if("selasa".equals(hari) && "pagi".equals(waktu)){
                System.out.println("Tempe");
                Harga = 5000;
            }
            if("selasa".equals(hari) && "siang".equals(waktu)){
                System.out.println("Tongkol");
                Harga = 9000;
            }
            if("selasa".equals(hari) && "malam".equals(waktu)){
                System.out.println("Jahir arsik");
                Harga = 9000;
            }
            if("rabu".equals(hari) && "Pagi".equals(waktu)){
                System.out.println("telur");
                Harga = 7000;
            }
            if("rabu".equals(hari) && "siang".equals(waktu)){
                System.out.println("ayam");
                Harga = 7000;
            }
            if("rabu".equals(hari) && "malam".equals(waktu)){
                System.out.println("ayam goreng");
                Harga = 7000;
            }
            if("kamis".equals(hari) && "pagi".equals(waktu)){
                System.out.println("ikan teri");
                Harga = 5000;
            }
            if("kamis".equals(hari) && "siang".equals(waktu)){
                System.out.println("ayam bakar");
                Harga = 8000;
            }
            if("kamis".equals(hari) && "malam".equals(waktu)){
                System.out.println("ikan bakar");
                Harga = 9000;
            }
            if("jumat".equals(hari) && "pagi".equals(waktu)){
                System.out.println("Tahu");
                Harga = 4000;
            }
            if("jumat".equals(hari) && "siang".equals(waktu)){
                System.out.println("ayam panggang");
                Harga = 20000;
            }
            if("jumat".equals(hari) && "malam".equals(waktu)){
                System.out.println("ikan bakar");
                Harga = 9000;
            }
            if("sabtu".equals(hari) && "pagi".equals(waktu)){
                System.out.println("ikan mujahir");
                Harga = 8000;
            }
            if("sabtu".equals(hari) && "siang".equals(waktu)){
                System.out.println("ayam bakar");
                Harga = 25000;
            }
            if("sabtu".equals(hari) && "malam".equals(waktu)){
                System.out.println("ayam goreng");
                Harga = 23000;
            }
            if("minggu".equals(hari) && "pagi".equals(waktu)){
                System.out.println("Bubur");
                Harga = 7000;
            }
            if("minggu".equals(hari) && "siang".equals(waktu)){
                System.out.println("mie goreng");
                Harga = 7000;
            }
            if("minggu".equals(hari) && "malam".equals(waktu)){
                System.out.println("Nasi goreng");
                Harga = 7000;
            }
                
    }

    public void minuman(int minuman) {
        switch (minuman) {
            case 1:
                System.out.println("Juice segar");break;
                
            case 2:
                System.out.println("Teh manis dingin");break;
            case 3:
                System.out.println("Air putih");break;
            case 4:
                System.out.println("Es buah");break;
            default:
                System.out.println("Maaf,Pilihan Anda tidak tersedia. Coba Lagi!! Jangan marah ya");
        }
    }

    public static void main(String[] args) {
        Kantin k = new Kantin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hari yang Anda inginkan: ");
        String hari = sc.next();
        System.out.println("Waktu yang Anda inginkan: ");
        
        String waktu = sc.next();
        k.menu(hari, waktu);
        System.out.println("Pilih minuman : \n1.Juice segar \n2.Teh manis dingin \n3.Air putih \n4.Es buah");
        System.out.println("Jenis Minuman yang Anda inginkan: ");
                
        int minuman = sc.nextInt();
        k.minuman(minuman);
       
        System.out.println("Total Pembayaran: " + k.Harga);
    }

}
