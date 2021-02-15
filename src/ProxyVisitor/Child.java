package ProxyVisitor;

public class Child implements CinemaVisitor {
    @Override
    public String visit(Red red) {
        System.out.println("\nIn the Red hall:");
        red.addItems();
        return "child: wow!";
    }

    @Override
    public String visit(Blue blue) {
        System.out.println("\nIn the Blue hall:");
        blue.addItems();
        return "child: wow!";
    }

    @Override
    public String visit(Green green) {
        System.out.println("\nIn the Green hall:");
        green.addItems();
        return "child: wow!";
    }

    @Override
    public String visit(White white) {
        System.out.println("\nIn the White hall:");
        white.addItems();
        return "child: wow!";
    }

    @Override
    public String visit(Orange orange) {
        System.out.println("\nIn the Orange hall:");
        orange.addItems();
        return "child: wow!";
    }

    @Override
    public String visit(Yellow yellow) {
        System.out.println("\nIn the Yellow hall:");
        yellow.addItems();
        return "child: wow!";
    }
}
