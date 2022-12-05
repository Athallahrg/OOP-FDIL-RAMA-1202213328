public class MainApp {

    public static void main(String[] args) {

        Perangkat perangkat = new Perangkat("Adata", 2, 1.80F);
        perangkat.informasi();
        System.out.println("");

        // Laptop
        Laptop seagate = new Laptop("Seagate", 8, 2.40F, true);
        System.out.println("<<<LAPTOP>>>");

        seagate.informasi();
        seagate.bukaGame("Valorant");
        seagate.kirimEmail("sukiyakipapi@gmail.com");
        seagate.kirimEmail("atenkspakbor@gmail.com", "nanankkorenering@gmail.com\n");

        // Handphone
        Handphone handisk = new Handphone("Sandisk", 3, 2.20F, false);
        System.out.println("\n<<<HANDPHONE>>>");

        handisk.informasi();
        handisk.telfon(62812232);
        handisk.kirimSMS(628529182);
        handisk.kirimSMS(628121, 6281333);
    }
}