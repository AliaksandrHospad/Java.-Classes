import java.util.ArrayList;
import java.util.TreeSet;

public class Comparable {
    public static void main(String[] args) {
        ArrayList<Customers> cust = new ArrayList<>();
        cust.add(new Customers(1, "Ivanov test test", 15, 152));
        cust.add(new Customers(2, "Petrov test test", 14, 147));
        cust.add(new Customers(3, "Bashirov test test", 56, 156));
        cust.add(new Customers(4, "Sidorov test test", 34, 123));
        cust.add(new Customers(5, "Tyhan test test", 98, 132));
        cust.add(new Customers(6, "Pupkin test test", 74, 186));
        cust.add(new Customers(7, "Alekseev test test", 61, 199));
        System.out.println(cust);
        cust.sort(new Customers.NameComparator());
        System.out.println(cust);
        System.out.println();
        System.out.println("TADA)");



        int intervalMin = 15;
        int intervalMax = 70;
        for (int i = 0; i < 7; i++) {
            if (cust.get(i).getCreditCardNumber() >= intervalMin && cust.get(i).getCreditCardNumber() <= intervalMax){
                System.out.println(cust.get(i));
            }

        }

    }


}
