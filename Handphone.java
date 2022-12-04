public class Handphone extends Perangkat {

    boolean fingerprint;

    //Constructor Handphone
    Handphone(String drive, int ram, float processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    //Overriding
    public void informasi() {
        if (fingerprint) {
            System.out.printf("Handphone mempunyai drive bertipe %s dengan ram sebesar %d GB dan processor secepat %.2f Ghz. Setelah itu,  handphone juga mempunyai Fingerprint \n", this.drive, this.ram, this.processor);
        } else {
            System.out.printf("Handphone mempunyai drive bertipe %s dengan ram sebesar %d GB dan processor secepat %.2f Ghz. Namun, handphone TIDAK mempunyai Fingerprint \n", this.drive, this.ram, this.processor);
        }
    }
    //Method Telfon
    public void telfon(int no_hp) {
        System.out.printf("Handphone berhasil menyambungkan telephone ke No %d ", no_hp);
    }
    //Method Kirim Sms
    public void kirimSMS(int no_hp) {
        System.out.printf("\nHandphone berhasil mengirimkan SMS ke No %d", no_hp);
    }
    //Method Kirim sms ke 2 nomor
    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.printf("\nHandphone berhasil mengirimkan SMS ke No %d dan %d", no_hp1, no_hp2);
    }

}