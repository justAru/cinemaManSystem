package Strategy;

import ProxyVisitor.*;

import java.util.Scanner;

public class VisitorOccupation extends CinemaAppUser{
    public VisitorOccupation() {
        userBehaviour = new Visit();
    }

    Scanner scan = new Scanner(System.in);

    public void makeChoose(){
        Red red = new Red();
        Blue blue = new Blue();
        Green green = new Green();
        Yellow yellow = new Yellow();
        Orange orange = new Orange();
        White white = new White();
        System.out.println("What movie do you want?");
        System.out.println("<1>");
        red.addItems();
        System.out.println("<2>");
        yellow.addItems();
        System.out.println("<3>");
        white.addItems();
        System.out.println("<4>");
        blue.addItems();
        System.out.println("<5>");
        green.addItems();
        System.out.println("<6>");
        orange.addItems();
    }

    @Override
    public void performOperation() {
        Red red = new Red();
        Blue blue = new Blue();
        Green green = new Green();
        Yellow yellow = new Yellow();
        Orange orange = new Orange();
        White white = new White();

        while (true) {
            System.out.println("Please choose: ");
            System.out.println("<1_________Adult_______>");
            System.out.println("<2_________Child_______>");
            System.out.println("<3_________Retiree_____>");
            System.out.println("<4_________Student_____>");
            System.out.println("<0_________Exit________>");
            int i = scan.nextInt();
            if (i == 1) {
                System.out.println("\n1 ticket for adult");
                CinemaVisitor visitor = new ProxyVisitor("adult");
                makeChoose();
                int input = scan.nextInt();
                if (input == 1) {
                    System.out.println(visitor.visit(red));
                } else if (input == 2) {
                    System.out.println(visitor.visit(yellow));
                } else if (input == 3) {
                    System.out.println(visitor.visit(white));
                } else if (input == 4) {
                    System.out.println(visitor.visit(blue));
                } else if (input == 5) {
                    System.out.println(visitor.visit(green));
                } else if (input == 6) {
                    System.out.println(visitor.visit(orange));
                }
            } else if (i == 2) {
                System.out.println("\n1 ticket for child");
                CinemaVisitor visitor = new ProxyVisitor("child");
                makeChoose();
                int input = scan.nextInt();
                if (input == 1) {
                    System.out.println(visitor.visit(red));
                } else if (input == 2) {
                    System.out.println(visitor.visit(yellow));
                } else if (input == 3) {
                    System.out.println(visitor.visit(white));
                } else if (input == 4) {
                    System.out.println(visitor.visit(blue));
                } else if (input == 5) {
                    System.out.println(visitor.visit(green));
                } else if (input == 6) {
                    System.out.println(visitor.visit(orange));
                }
            } else if (i == 3) {
                System.out.println("\n1 ticket for retiree");
                CinemaVisitor visitor = new ProxyVisitor("retiree");
                makeChoose();
                int input = scan.nextInt();
                if (input == 1) {
                    System.out.println(visitor.visit(red));
                } else if (input == 2) {
                    System.out.println(visitor.visit(yellow));
                } else if (input == 3) {
                    System.out.println(visitor.visit(white));
                } else if (input == 4) {
                    System.out.println(visitor.visit(blue));
                } else if (input == 5) {
                    System.out.println(visitor.visit(green));
                } else if (input == 6) {
                    System.out.println(visitor.visit(orange));
                }
            } else if (i == 4) {
                System.out.println("\n1 ticket for student");
                CinemaVisitor visitor = new ProxyVisitor("student");
                makeChoose();
                int input = scan.nextInt();
                if (input == 1) {
                    System.out.println(visitor.visit(red));
                } else if (input == 2) {
                    System.out.println(visitor.visit(yellow));
                } else if (input == 3) {
                    System.out.println(visitor.visit(white));
                } else if (input == 4) {
                    System.out.println(visitor.visit(blue));
                } else if (input == 5) {
                    System.out.println(visitor.visit(green));
                } else if (input == 6) {
                    System.out.println(visitor.visit(orange));
                }
            } else if (i == 0) {
                break;
            }
            break;
        }
    }
}
