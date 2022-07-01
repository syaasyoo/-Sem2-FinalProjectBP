package finalprojectsem2;

public class cDaftarTransaksi {
    cTransaksi front, rear;
    int jumlah;
    double nominal;
    cDaftarTransaksi (){
        front = rear = null;
        jumlah = 0;
    }
    public cTransaksi getFront(){
        return front;
    }
    public cTransaksi getRear(){
        return rear;
    }
    public void tambahTransaksi (cTransaksi baru){ // Untuk penambahan item
        if (rear == null){
            front = rear = baru;
        }
        else {
            rear.next = baru;
            rear=baru;
        }
        
    }
    public void lihatTransaksi (){
        int i=1;
        for (cTransaksi t=front; t!=null; t=t.next){
            System.out.print(i+". ");
            System.out.print(t.getKode()+"-");
            System.out.print(t.getPembeli()+"-");
            System.out.print(t.getBarang().getNama()+"-");
            System.out.print(t.getJumlah()+"-");
            System.out.println(t.getStatus()+"");
            i++;
        }
    }
    public void lihatTransaksiMember (){
        //Metode dengan perbedaan nama, metode lain dapat dilakukan dng penggunaan parameter
        int i=1;
        double total = 0, diskon;
        System.out.println("\n Daftar Transaksi Member: ");
        for (cTransaksi t=front; t!=null; t=t.next){
            System.out.print(i+".");
            System.out.print(t.getKode()+"-");
            System.out.print(t.getPembeli()+"-");
            System.out.print(t.getBarang().getNama()+"-");
            System.out.print(t.getJumlah()+"-");
            System.out.println(t.getStatus()+"");
            i++;
            total = total + (t.getBarang().getHarga()*t.getJumlah());
        }
        System.out.println("Total Belanja: "+total);
        System.out.println("Diskon       : "+(0.05 * total));
        System.out.println("Biaya        : "+(total - (0.05*total)));
    }
    public void hapusTransaksi (int nomor){
        // Bug : jika transaksi kosong dan dilakukan penghapusan maka akan terjadi nullPointer
        // Solusi : Dapat dilakukan dengan melakukan pengecekan di method jumlah transaksi yg
        // dilakukan, jika transaksi <= 0 maka method tidak dipanggil
        cTransaksi t = front;
        cTransaksi prev = null;
        int i = 1;
        if (nomor ==1){ // Dihapus nomer 1
            if (t.next == null){
                front = rear = null;
            }
            else {
                front = front.next;
                t.next = null;
            }
            System.out.println("\t [("+t.getBarang().getNama()+") dihapus!]");
        }
        if (nomor > 1 && t.next != null) { // posisi tengah
            for (;t != null;t=t.next){
                if (i == nomor){
                    break;
                }
                i++;
                prev = t; // menyimpan t sebelumnya dihapus
            }
            // Yang dihapus di ujung belakang
            if (t.next == null){
                rear = prev;
                rear.next = null;
            } else { // Jika tidak simpul t dilompati
                prev.next = t.next;
                t.next = null;
            }
            System.out.println("\t [("+t.getBarang().getNama()+") dihapus!]");
        }

    }
    public void sambungTransaksi (cTransaksi depan, cTransaksi belakang){
        // Pengecekan jika antrian kosong
        if (rear == null){
            front = depan;
            rear  = belakang;
        }
        else {
            // Sambungkan transaksi
            rear.next = depan; // ekor transaksi lama dihubungkan dengan depan
            // Update posisi rear
            rear = belakang; // ekor baru diisi belakang dr transaksi pembeli
        }



    }
    public void prosesTransaksi (cTransaksi t){
        t.setStatus(1);
    }
    public int lihatDiproses () {
        cTransaksi t = front;
        int proses = 0;
        for (;t!=null; t=t.next){
            if (t.getStatus() == 1){
                proses++;
            }
        } return proses;
    }
    public double lihatPemasukan (){
        cTransaksi t = front;
        // Terdapat Bug dimana perhitungan pembeli dan Member disamakan sehingga pembeli ikut
        // dapat diskon
        // Solusi: membedakan variable yang menghimpun pembeli dan member
        // Pemasukan lama tidak disimpan
        for (;t!=null; t=t.next){
            if (t.getStatus() == 1) {
                nominal = nominal + t.getBarang().getHarga() * t.getJumlah();
                // cek member berdasarkan data nama/kode pembeli
                if (t.getPembeli().compareToIgnoreCase("10") == 0 || t.getPembeli().compareToIgnoreCase("11") == 0 || t.getPembeli().compareToIgnoreCase("12")== 0 ) {
                    // untuk member
                    nominal = nominal - (0.05*nominal);
                }
                    ;

            }

        } return nominal;
    }
}
