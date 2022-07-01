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
        cBarang brg1 = new cBarang ("Blouse",110000);
        cBarang brg2 = new cBarang ("Kemeja",100000);
        cBarang brg3 = new cBarang ("Cardigan",120000);
        cBarang brg4 = new cBarang ("Sweater",130000);
        cBarang brg5 = new cBarang ("Jaket",150000);
        
        // Daftar Data member
        int id, pin;
        int id1 = 10, pwd1 =111;
        int id2 = 11, pwd2 =222;
        int id3 = 12, pwd3 =333;
        
        // Data Admin
        int pinAdmin;
        int pwA1 = 123;
        
        //Data Owner
        int pinOwner;
        int pwO = 345;
        

        //Terdapat dua linkedlist menghimpun transaksi satu pembeli (beli) dan seluruh (jual)
        cDaftarTransaksi jual = new cDaftarTransaksi(); // Daftar Transaksi besar gabungan dari transaksi pembeli lain
        int pilih = 0,pilih2 = 0, pilih3 =0;
        int jumlah;
        int kode=99;
        

        do{
            System.out.println("––––––––––––––––––––––––––––––––––––––––");
            System.out.println("\t      𝑷𝒐𝒑𝒊𝒍𝒔.𝒊𝒅");
            System.out.println("––––––––––––––––––––––––––––––––––––––––");
            System.out.println("           𝐋𝐄𝐕𝐄𝐋 𝐏𝐄𝐍𝐆𝐆𝐔𝐍𝐀");
            System.out.println("1. Pembeli");
            System.out.println("2. Member");
            System.out.println("3. Admin");
            System.out.println("4. Owner");
            System.out.println("5. Exit ✖");
            System.out.print("Pilih\t\t\t: ");
            pilih = sc.nextInt();
            
            switch(pilih){
                case 1:
                    //Pembeli
                    kode++;
                    // Linked List memasukkan data dari pembeli
                    cDaftarTransaksi beli = new cDaftarTransaksi();
                    System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                    System.out.println("              𝐏𝐄𝐌𝐁𝐄𝐋𝐈");
                    System.out.print("Masukkan Nama\t\t: ");
                    String nama = sc.next();
                    System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                    do{
                        System.out.println("           𝐌𝐄𝐍𝐔 𝐏𝐄𝐌𝐁𝐄𝐋𝐈");
                        System.out.println("1. Tambah");
                        System.out.println("2. Hapus");
                        System.out.println("3. Lihat");
                        System.out.println("4. Back ↺");
                        System.out.print("Pilih\t\t\t: ");
                        pilih2 = sc.nextInt();
                        System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                        switch (pilih2){
                            case 1:                             
                                    cTransaksi br=null;
                                    System.out.println("\t   𝐃𝐀𝐅𝐓𝐀𝐑 𝐁𝐀𝐑𝐀𝐍𝐆");
                                    System.out.println("1. Blouse");
                                    System.out.println("2. Kemeja");
                                    System.out.println("3. Cradigan");
                                    System.out.println("4. Sweater");
                                    System.out.println("5. Jaket");
                                    System.out.println("6. Back");
                                    System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                                    do {                                        
                                        System.out.print("Pilih Nomor\t\t: ");
                                        pilih3 = sc.nextInt();
                                        if (pilih3 == 1||pilih3==2||pilih3==3||pilih3==4||pilih3==5) {
                                        System.out.print("Jumlah\t\t\t: ");
                                        jumlah = sc.nextInt();
                                        if (pilih3==1){
                                        br = new cTransaksi (String.valueOf(kode),nama,brg1,jumlah,0);
                                        beli.tambahTransaksi(br);
                                        } else if (pilih3 == 2){
                                        br = new cTransaksi (String.valueOf(kode),nama,brg2,jumlah,0);
                                        beli.tambahTransaksi(br);
                                        } else if (pilih3 == 3){
                                        br = new cTransaksi (String.valueOf(kode),nama,brg3,jumlah,0);
                                        beli.tambahTransaksi(br);
                                        } else if (pilih3 == 4){
                                        br = new cTransaksi (String.valueOf(kode),nama,brg4,jumlah,0);
                                        beli.tambahTransaksi(br);
                                        } else if (pilih3 == 5){
                                        br = new cTransaksi (String.valueOf(kode),nama,brg5,jumlah,0);
                                        beli.tambahTransaksi(br);
                                        }
                                        else if (pilih3==6) {
                                        break;
                                        }
                                        System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                                    } 
                                    } while (pilih3!=6);
                                    System.out.println("     ◂◂[Penambahan Sukses!]▸▸ ");
                                    System.out.println("            << Back <<          ");
                                    System.out.println("");
                                    System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                                break;
                            case 2:
                                // Hapus Transaksi
                                System.out.println("\t  𝐇𝐀𝐏𝐔𝐒 𝐓𝐑𝐀𝐍𝐒𝐀𝐊𝐒𝐈");
                                beli.lihatTransaksi();
                                System.out.println("");
                                System.out.print("Hapus Nomor\t\t: ");
                                int hapus = sc.nextInt();
                                beli.hapusTransaksi(hapus);
                                System.out.println("");
                                System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                                break;
                            case 3:
                                System.out.println("\t  𝐃𝐀𝐅𝐓𝐀𝐑 𝐓𝐑𝐀𝐍𝐒𝐀𝐊𝐒𝐈");
                                beli.lihatTransaksi();
                                System.out.println("");
                                System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                                break;
                            case 4:
                                //Transaksi selesai, sambungkan transaksi pembeli ke antrian transaksi toko
                                System.out.println("            << Back <<          ");
                                System.out.println("");
                                jual.sambungTransaksi(beli.getFront(), beli.getRear());
                                break;
                        }
                    }while (pilih2!=4);
                    break;
                case 2:
                    //Member
                    System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                    System.out.println("           𝐋𝐎𝐆𝐈𝐍 𝐌𝐄𝐌𝐁𝐄𝐑");
                    boolean valid = false;
                    do{
                        System.out.print("ID Member\t\t: ");
                        id = sc.nextInt();
                        System.out.print("PIN Member\t\t: ");
                        pin = sc.nextInt();
                        if (id == id1 && pin == pwd1){
                            valid = true;
                        } else if (id == id2 && pin == pwd2){
                            valid =true;
                        }else if (id == id3 && pin == pwd3){
                            valid =true;
                        }
                        if (valid == false){
                            System.out.println("       ◂◂[ID/PIN SALAH!!!]▸▸");
                            System.out.println("");
                            System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                        } else {
                            break;
                        }
                    }while (valid != true);
                    if (valid ==true) {
                        System.out.println("      ◂◂[Selamat Datang!]▸▸ ");
                        System.out.println("");
                    }
                    System.out.println("––––––––––––––––––––––––––––––––––––––––");
                    kode++;
                    // Linked List memasukkan data dari Member
                    beli = new cDaftarTransaksi();
                    do{
                        System.out.println("             𝐌𝐄𝐌𝐁𝐄𝐑");
                        System.out.println("1. Tambah");
                        System.out.println("2. Hapus");
                        System.out.println("3. Lihat");
                        System.out.println("4. Ubah PIN");
                        System.out.println("5. Back ↺");
                        System.out.print("Pilih\t\t\t: ");
                        pilih2 = sc.nextInt();
                        System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                        switch (pilih2){
                            case 1:                                  
                                    cTransaksi br=null;
                                    System.out.println("Daftar Barang:");
                                    System.out.println("1. Blouse");
                                    System.out.println("2. Kemeja");
                                    System.out.println("3. Cradigan");
                                    System.out.println("4. Sweater");
                                    System.out.println("5. Jaket");
                                    System.out.println("6. Back");
                                    System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                                    do {                                        
                                        System.out.print("Pilih Nomor\t\t: ");
                                        pilih3 = sc.nextInt();
                                        if (pilih3 == 1||pilih3==2||pilih3==3||pilih3==4||pilih3==5) {
                                        System.out.print("Jumlah\t\t\t: ");
                                        jumlah = sc.nextInt();
                                        if (pilih3==1){
                                        br = new cTransaksi (String.valueOf(kode),String.valueOf(id),brg1,jumlah,0);
                                        beli.tambahTransaksi(br);
                                        } else if (pilih3 == 2){
                                        br = new cTransaksi (String.valueOf(kode),String.valueOf(id),brg2,jumlah,0);
                                        beli.tambahTransaksi(br);
                                        } else if (pilih3 == 3){
                                        br = new cTransaksi (String.valueOf(kode),String.valueOf(id),brg3,jumlah,0);
                                        beli.tambahTransaksi(br);
                                        } else if (pilih3 == 4){
                                        br = new cTransaksi (String.valueOf(kode),String.valueOf(id),brg4,jumlah,0);
                                        beli.tambahTransaksi(br);
                                        } else if (pilih3 == 5){
                                        br = new cTransaksi (String.valueOf(kode),String.valueOf(id),brg5,jumlah,0);
                                        beli.tambahTransaksi(br);
                                        }
                                        else if (pilih3==6) {
                                        break;
                                        }
                                        System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                                    } 
                                    } while (pilih3!=6);
                                    System.out.println("     ◂◂[Penambahan Sukses!]▸▸ ");
                                    System.out.println("            << Back <<          ");
                                    System.out.println("");
                                    System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                                break;
                            case 2:
                                // Hapus Transaksi
                                System.out.println("\t  𝐇𝐀𝐏𝐔𝐒 𝐓𝐑𝐀𝐍𝐒𝐀𝐊𝐒𝐈");
                                beli.lihatTransaksi();
                                System.out.println("");
                                System.out.print("Hapus Nomor\t\t: ");
                                int hapus = sc.nextInt();
                                beli.hapusTransaksi(hapus);
                                System.out.println("");
                                System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                                break;
                            case 3:
                                System.out.println("\t  𝐃𝐀𝐅𝐓𝐀𝐑 𝐓𝐑𝐀𝐍𝐒𝐀𝐊𝐒𝐈");
                                beli.lihatTransaksiMember();
                                System.out.println("");
                                System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                                break;
                            case 4:
                                //Ubah PIN
                                
                                break;
                            case 5:
                                //Transaksi selesai, sambungkan transaksi pembeli ke antrian transaksi toko
                                System.out.println("            << Back <<          ");
                                System.out.println("");
                                jual.sambungTransaksi(beli.getFront(), beli.getRear());
                                break;
                        }
                    }while (pilih2!=4);
                    break;
                case 3:
                    System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                    //Admin --> Memproses transaksi
                    boolean validd = false;
                    do{
                        System.out.println("           𝐋𝐎𝐆𝐈𝐍 𝐀𝐃𝐌𝐈𝐍");
                        System.out.print("PIN Admin\t\t: ");
                        pinAdmin = sc.nextInt();
                        if (pinAdmin == pwA1) {
                            validd = true;
                        }
                        if (validd == false){
                            System.out.println("     ◂◂[PIN ADMIN SALAH!!!]▸▸");
                        } else {
                            break;
                        }
                    }while (validd != true);
                    if (validd ==true) {
                        System.out.println("    ◂◂[Login Admin Berhasil]▸▸");
                        System.out.println("");
                    }
                    System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
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
                            System.out.println("Proses Transaksi?");
                            System.out.println("1. Proses");
                            System.out.println("2. Back ↺");
                            System.out.print("Pilih\t\t\t: ");
                            int aksi = sc.nextInt();
                                if (aksi == 1){
                                    jual.prosesTransaksi(t);
                                    System.out.println("     ◂◂[Berhasil Diproses!]▸▸ ");
                                    System.out.println("");
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
                    System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                    boolean validdd = false;
                    do{
                        System.out.println("           𝐋𝐎𝐆𝐈𝐍 𝐎𝐖𝐍𝐄𝐑");
                        System.out.print("PIN Owner\t\t: ");
                        pinOwner = sc.nextInt();
                        if (pinOwner == pwO) {
                            validdd = true;
                        }
                        if (validdd == false){
                            System.out.println("     ◂◂[PIN OWNER SALAH!!!]▸▸");
                        } else {
                            break;
                        }
                    }while (validdd != true);
                    if (validdd ==true) {
                        System.out.println("    ◂◂[Login Owner Berhasil]▸▸");
                        System.out.println("");
                    }
                    System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                    System.out.println("Owner");
                    System.out.println("Jumlah Transaksi Diproses : "+jual.lihatDiproses());
                    System.out.println("Pemasukan :" + jual.lihatPemasukan());
                    break;
                case 5:
                    System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
                    break;
            }
        }while (pilih!=5);

    
    }
    
}
