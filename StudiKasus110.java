import java.util.Scanner;
public class StudiKasus110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pricePerCup = 18000;
        int cupCount, amountPaid;
        int totalPrice, discount, totalPayment;
        int change, shortage;

        System.out.print("Enter the number of cups: ");
        cupCount = sc.nextInt();
        System.out.print("Enter the amount paid: ");
        amountPaid = sc.nextInt();
        totalPrice = cupCount * pricePerCup;
        discount = 0;

        if (totalPrice >= 100000) {
            discount = totalPrice * 10 / 100;
        }

        totalPayment = totalPrice - discount;

        System.out.println("Total price   : Rp" + totalPrice);
        System.out.println("Discount      : Rp" + discount);
        System.out.println("Total payment : Rp" + totalPayment);

        if (amountPaid >= totalPayment) {
            change = amountPaid - totalPayment;
            System.out.println("Change        : Rp" + change);
        } else {
            shortage = totalPayment - amountPaid;
            System.out.println("Insufficient money, short by Rp" + shortage);
        }

        sc.close();
    }
}

    
        