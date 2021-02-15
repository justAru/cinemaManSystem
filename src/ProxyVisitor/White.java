package ProxyVisitor;

import Builder.*;

public class White implements ItemsCollection {
    @Override
    public String accept(CinemaVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public void addItems() {
        System.out.println("**********White Hall**********");
        AbstractFilms film = new ConcreteFilm();
        AbstractFilmsBuilder builder = new WarnerBrosFilms(film);
        Builder collector = new Builder();

        film = collector.collect(builder);
        System.out.println(film);
    }
}
