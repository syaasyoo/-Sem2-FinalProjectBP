package finalprojectsem2;

public class cTransaksi {
    String kode;
    String pembeli;
    cBarang barang;
    int jumlahBarang;
    int status;
    cTransaksi next;

    cTransaksi(String k, String p, cBarang b, int j, int s) {
        kode=k;
        pembeli=p;
        barang=b;
        jumlahBarang=j;
        status=s;
        next=null;
    }
    
    public  void  setStatus(int s){ //Untuk melihat transaksi diproses atau tidak
        status=s;
    }
    public String getKode(){
        return kode;
    }
    public String getPembeli(){
        return pembeli;
    }
    public cBarang getBarang(){
        return barang;
    }
    public int getJumlah(){ //Diperlukan saat perhitungan jumlah total --> Jum x harga
        return jumlahBarang;
    }
    public int getStatus(){
        return status;
    }
    
   
}
