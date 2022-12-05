public class Perangkat {

    String drive;
    int ram;
    float processor;

    //Constructor Perangkat
    Perangkat(String drive, int ram, float processor) {

        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
    //Method informasi
    public void informasi() {
        System.out.printf("Perangkat tidak diketahui memiliki drive tipe Adata dengan ram sebesar %d GB dan processor secepat %.2f Ghz \n", this.ram, this.processor);
    }

}
