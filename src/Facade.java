import Strategy.Arrange;
import Strategy.ManagerOccupation;
import Strategy.Visit;
import Strategy.VisitorOccupation;

import java.util.Scanner;

public class Facade {
    Scanner scan;
    VisitorOccupation visitorOccupation;
    ManagerOccupation managerOccupation;

    public Facade() {
        this.scan = new Scanner(System.in);
        this.visitorOccupation = new VisitorOccupation();
        this.managerOccupation = new ManagerOccupation();
    }

    public void chooseOccupation() {
        while (true) {
            System.out.println("\n\nWelcome");
            System.out.println("Type 1 - if you are a visitor. Type 2 - if you are a manager");
            int input = scan.nextInt();

            if (input == 1) {
                visitorOccupation.setUserBehaviour(new Visit());
                visitorOccupation.performOperation();
            } else if (input == 2) {
                managerOccupation.setUserBehaviour(new Arrange());
                managerOccupation.performOperation();
            }
        }
    }
}
