package Strategy;

import ProxyVisitor.*;

public class ManagerOccupation extends CinemaAppUser{
    public ManagerOccupation() {
        userBehaviour = new Arrange();
    }

    @Override
    public void performOperation() {
        Red red = new Red();
        Blue blue = new Blue();
        Green green = new Green();
        Yellow yellow = new Yellow();
        Orange orange = new Orange();
        White white = new White();

        CinemaVisitor visitor = new ProxyVisitor("manager");
        System.out.println(visitor.visit(red));
        System.out.println(visitor.visit(blue));
        System.out.println(visitor.visit(green));
        System.out.println(visitor.visit(yellow));
        System.out.println(visitor.visit(orange));
        System.out.println(visitor.visit(white));
    }
}
