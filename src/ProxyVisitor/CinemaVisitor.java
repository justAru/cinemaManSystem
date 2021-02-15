package ProxyVisitor;

public interface CinemaVisitor {
    String visit(Red red);
    String visit(Blue blue);
    String visit(Green green);
    String visit(White white);
    String visit(Orange orange);
    String visit(Yellow yellow);
}
