package ProxyVisitor;

public interface ItemsCollection {
    public String accept(CinemaVisitor visitor);
    public abstract void addItems();
}
