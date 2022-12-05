public class Sampan extends TransportasiAir {
    
        protected Layar
    
        //Constructor Handphone
        Sampan(int JumlahKursi, int Biaya, int Layar)
            this.Layar = Layar;
        }
    
        //Overriding
        public void informasi() {
        
                System.out.printf("Transportasi Air jenis Sampan dengan kursi berjumlah "+JumlahKursi+ "ditetapkan dengan biaya "+Biaya);
            
        //Method berlayar
        public void berlayar(int Layar) {
            System.out.printf("Transportasi Air jenis Sampan sedang berlayar menggunakan "+no_hp" layar);
        }
        
        public void Berlabuh() {
            System.out.printf("Transportasi Air jenis Sampan sedang berlabuh di pantai tanpa jangkar");
        }
       
        }
    
    }
}
