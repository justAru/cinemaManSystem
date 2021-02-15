package ProxyVisitor;

import Strategy.Arrange;

public class Manager implements CinemaVisitor{
    @Override
    public String visit(Red red) {
        red.addItems();
        return "Everything is OK!\n";
    }

    @Override
    public String visit(Blue blue) {
        blue.addItems();
        return "Everything is OK!\n";
    }

    @Override
    public String visit(Green green) {
        green.addItems();
        return "Everything is OK!\n";
    }

    @Override
    public String visit(White white) {
        white.addItems();
        return "Everything is OK!\n";
    }

    @Override
    public String visit(Orange orange) {
        orange.addItems();
        return "Everything is OK!\n";
    }

    @Override
    public String visit(Yellow yellow) {
        yellow.addItems();
        return "Everything is OK!\n";
    }
}
