package ad211.dolgih;

import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cart pack;
        pack = inputItems();

        System.out.println("\t Cart:");
        cartOutput(pack);
        System.out.println("Sum of all costs in package: " + pack.sum());

        System.out.println();
        System.out.println("Increasing cost by 15%: ");
        pack.increase(15);
        cartOutput(pack);
        System.out.println("Sum of all costs in package: " + pack.sum());

        System.out.println();
        System.out.println("Decreasing cost by 30%: ");
        pack.decrease(30);
        cartOutput(pack);
        System.out.println("Sum of all costs in package: " + pack.sum());


    }
    public static Cart inputItems() {
        int ItemNumber;
        Cart pack;

        Scanner StringScanner = new Scanner(System.in);

        do {
            System.out.println("Write the number of items and press 'Enter' :");
            ItemNumber = StringScanner.nextInt();
            if(ItemNumber <= 0) {
                System.out.println("Write a positive number of items, please: ");
            }
        } while (ItemNumber <= 0);
        pack = new Cart(ItemNumber);

        Scanner FloatScanner = new Scanner(System.in);

        for(int i = 0; i < ItemNumber; i++){
            System.out.println("Write name of item №" + (i + 1));
            String name = StringScanner.next();
            System.out.println("Write price of item №" + (i + 1));
            float cost = FloatScanner.nextFloat();
            pack.addItem(new Item(name,cost));
        }

        return pack;
    }

    public static void cartOutput (Cart pack) {
        for(int i = 0; i < pack.getCurrentItemNumber(); i++) {
            System.out.println("Item №" + (i + 1) + ": " + pack.getStack()[i].getName() + " - " + pack.getStack()[i].getCost());
        }
    }

}
