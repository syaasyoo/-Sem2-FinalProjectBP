package finalprojectsem2;
import java.util.Scanner;
/**
 *
 * @author Aisyah Azzahra & Alya Fatin
 */
public class appToko {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Daftar data Barang
        cBarang brg1 = new cBarang ("Tas",100000);
        cBarang brg2 = new cBarang ("Sandal",5000);
        cBarang brg3 = new cBarang ("Sepatu",15000);
        // Daftar Data member
        int id, pin;
        int id1 = 10, pwd1 =111;
        int id2 = 11, pwd2 =222;
        int id3 = 12, pwd3 =333;

        //Terdapat dua linkedlist menghimpun transaksi satu pembeli (beli) dan seluruh (jual)
        cDaftarTransaksi jual = new cDaftarTransaksi(); // Daftar Transaksi besar gabungan dari transaksi pembeli lain
        int pilih = 0,pilih2 = 0, pilih3 =0;
        int jumlah;
        int kode=100;
        do{
            System.out.println("\nAplikasi Toko Maju Sejahtera");
            System.out.println("1. Pembeli");
            System.out.println("2. Anggota");
            System.out.println("3. Admin");
            System.out.println("4. Pemilik");
            System.out.println("5. Exit");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    //Pembeli
                    kode++;
                    // Linked List memasukkan data dari pembeli
                    cDaftarTransaksi beli = new cDaftarTransaksi();
                    System.out.print("Masukkan Nama = ");
                    String nama = sc.next();
                    do{
                        System.out.println("\nAkun Pembeli");
                        System.out.println("1. Tambah");
                        System.out.println("2. Hapus");
                        System.out.println("3. Lihat");
                        System.out.println("4. Kembali");
                        System.out.print("Pilih = ");
                        pilih2 = sc.nextInt();
                        switch (pilih2){
                            case 1:
                                cTransaksi br=null;
                                System.out.println("Daftar Baarang:");
                                System.out.println("1. Tas");
                                System.out.println("2. Sandal");
                                System.out.println("3. Sepatu");
                                System.out.print("Pilih = ");
                                pilih3 = sc.nextInt();
                                System.out.print("Jumlah = ");
                                jumlah = sc.nextInt();
                                if (pilih3==1){
                                    br = new cTransaksi (String.valueOf(kode),nama,brg1,jumlah,0);
                                } else if (pilih3 == 2){
                                    br = new cTransaksi (String.valueOf(kode),nama,brg2,jumlah,0);
                                }  else if (pilih3 == 3){
                                    br = new cTransaksi (String.valueOf(kode),nama,brg3,jumlah,0);
                                }
                                beli.tambahTransaksi(br);
                                break;
                            case 2:
                                // Hapus Transaksi
                                beli.lihatTransaksi();
                                System.out.println("Hapus Nomor = ");
                                int hapus = sc.nextInt();
                                beli.hapusTransaksi(hapus);
                                break;
                            case 3:
                                beli.lihatTransaksi();
                                break;
                            case 4:
                                //Transaksi selesai, sambungkan transaksi pembeli ke antrian transaksi toko
                                jual.sambungTransaksi(beli.getFront(), beli.getRear());
                                break;
                        }
                    }while (pilih2!=4);
                    break;
                case 2:
                    //Anggota
                    boolean valid = false;
                    do{
                        System.out.println("Akun Anggota");
                        System.out.print("ID = ");
                        id = sc.nextInt();
                        System.out.print("PIN = ");
                        pin = sc.nextInt();
                        if (id == id1 && pin == pwd1){
                            valid = true;
                        } else if (id == id2 && pin == pwd2){
                            valid =true;
                        }else if (id == id3 && pin == pwd3){
                            valid =true;
                        }
                        if (valid == false){
                            System.out.println("ID/PIN SALAH");
                        } else {
                            break;
                        }
                    }while (valid != true);
                    if (valid ==true) {
                        System.out.println(" Selamat Datang..");
                    }
                    kode++;
                    // Linked List memasukkan data dari Member
                    beli = new cDaftarTransaksi();
                    System.out.print("Masukkan Nama = ");
                    nama = sc.next();
                    do{
                        System.out.println("\nAkun Member");
                        System.out.println("1. Tambah");
                        System.out.println("2. Hapus");
                        System.out.println("3. Lihat");
                        System.out.println("4. Kembali");
                        System.out.print("Pilih = ");
                        pilih2 = sc.nextInt();
                        switch (pilih2){
                            case 1:
                                cTransaksi br=null;
                                System.out.println("Daftar Baarang:");
                                System.out.println("1. Tas");
                                System.out.println("2. Sandal");
                                System.out.println("3. Sepatu");
                                System.out.print("Pilih = ");
                                pilih3 = sc.nextInt();
                                System.out.print("Jumlah = ");
                                jumlah = sc.nextInt();
                                if (pilih3==1){
                                    br = new cTransaksi (String.valueOf(kode),String.valueOf(id),brg1,jumlah,0);
                                } else if (pilih3 == 2){
                                    br = new cTransaksi(String.valueOf(kode),String.valueOf(id),brg2,jumlah,0);
                                }  else if (pilih3 == 3){
                                    br = new cTransaksi (String.valueOf(kode),String.valueOf(id),brg3,jumlah,0);
                                }
                                beli.tambahTransaksi(br);
                                break;
                            case 2:
                                // Hapus Transaksi
                                beli.lihatTransaksi();
                                System.out.println("Hapus Nomor = ");
                                int hapus = sc.nextInt();
                                beli.hapusTransaksi(hapus);
                                break;
                            case 3:
                                beli.lihatTransaksiMember();
                                break;
                            case 4:
                                //Transaksi selesai, sambungkan transaksi pembeli ke antrian transaksi toko
                                jual.sambungTransaksi(beli.getFront(), beli.getRear());
                                break;
                        }
                    }while (pilih2!=4);
                    break;
                case 3:
                    //Admin --> Memproses transaksi
                    System.out.println("Akun Admin");
                    jual.lihatTransaksi();
                    //memproses setiap transaksi yg belum diproses
                    cTransaksi t = jual.getFront();
                    do{
                        if (t.getStatus()==0){
                            System.out.println("\n-Proses Transaksi-");
                            System.out.println("Kode :"+t.getKode());
                            System.out.println("Pembeli :"+t.getPembeli());
                            System.out.println("Barang : "+t.getBarang().getNama());
                            System.out.println("Jumlah : "+t.getJumlah());
                            System.out.println("Pilih Aksi :");
                            System.out.println("1. Diproses");
                            System.out.println("2. Selesai");
                            System.out.print("Pilih : ");
                            int aksi = sc.nextInt();
                                if (aksi == 1){
                                    jual.prosesTransaksi(t);
                                    System.out.println("Berhasil Diproses...\n");
                                }
                                else {
                                    break;
                                }
                        }
                        t = t.next;
                    }while (t!=null);
                    break;
                case 4:
                    //Pemilik --> Mengecek Laporan
                    System.out.println("Akun Pemilik");
                    System.out.println("Jumlah Transaksi Diproses : "+jual.lihatDiproses());
                    System.out.println("Pemasukan :" + jual.lihatPemasukan());
                    break;
                case 5:
                    break;
            }
        }while (pilih!=5);

    
    }
    
}
