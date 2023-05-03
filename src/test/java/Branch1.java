import java.util.Scanner;

public class Branch1 {

    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter car price: ");
            double carPrice = scanner.nextDouble();

            double loanAmount = carPrice;
            double interestRate = 0.05;
            int loanTermMonths = 60;

            double monthlyInterestRate = interestRate / 12;
            double monthlyPayment = (loanAmount * monthlyInterestRate) /
                    (1 - Math.pow(1 + monthlyInterestRate, -loanTermMonths));

            System.out.printf("Monthly car loan payment: $%.2f%n", monthlyPayment);

            scanner.close();
        }
    }

//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.println("Car Price");
//        int price=scanner.nextInt();
//
//        System.out.println("interest rate");
//        int interestRate=scanner.nextInt();
//
//        System.out.println("Total months");
//        int numberOfMonths = scanner.nextInt();
//
//        int interestCalc = price*interestRate/100;
//        System.out.println("Your total interest is " + interestCalc);
//
//        int totalPrice = price +interestCalc;
//        System.out.println("Your total price is " + totalPrice);
//
//        System.out.println("Your monthly payment is " + totalPrice/numberOfMonths);
//
//        /*
//        Monthly car payment
//         */













