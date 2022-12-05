public class TransportasiAir {
    
    public TransportasiAir(int jumlahKursi, int biaya) {
        JumlahKursi = jumlahKursi;
        Biaya = biaya;
    }
    protected int JumlahKursi ;
    protected int Biaya;
    

    //Method informasi
    public void informasi() {
        System.out.printf("Transportasi Air jenis tidak diketahui dengan kursi berjumlah "+JumlahKursi+"ditetapkan dengan biaya"+Biaya);
    
    }
}

