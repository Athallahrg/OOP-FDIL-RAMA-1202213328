public class Laptop extends Perangkat {

    protected boolean webcam;
    
    //Constructor Laptop
    Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    // Overriding
    public void informasi() {
        if (webcam) {
            System.out.printf("Laptop mempunyai drive tipe %s dengan ram sebesar %d GB dan processor secepat %.2f Ghz. Selain itu laptop juga mempunyai Webcam \n", this.drive, this.ram, this.processor);
        } else {
            System.out.printf("Laptop mempunyai drive tipe %s dengan ram sebesar %d GB dan processor secepat %.2f Ghz. Namun, laptop ini TIDAK mempunyai Webcam \n", this.drive, this.ram, this.processor);
        }
    }
    //Method Buka Game
    public void bukaGame(String nama_game) {
        System.out.printf("Laptop berhasil membukakan game %s", nama_game);
    }
    //Method Kirim Email
    public void kirimEmail(String email) {
        System.out.printf("\nLaptop berhasil mengirimkan sebuah Email ke %s", email);
    }
    // Method Kirim 2 Email 
    public void kirimEmail(String email1, String email2) {
        System.out.printf("\nLaptop berhasil mengirimkan sebuah Email ke %s dan %s", email1, email2);
    }

}
