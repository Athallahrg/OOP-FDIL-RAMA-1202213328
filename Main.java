import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant r1 = new Restaurant();
        int customerID, orderQty;

    try{
        System.out.print("Enter Customer ID : ");
        customerID = input.nextInt();

        System.out.print("Enter how much food to make : ");
        orderQty = input.nextInt();

        Thread t1 = new Thread(r1);
        Waiters waiters = new Waiters(orderQty, customerID);
        Thread t2 = new Thread(waiters);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        input.close();

    } catch(Exception e){
        System.out.println("Input has to be integer");

    }
}

}