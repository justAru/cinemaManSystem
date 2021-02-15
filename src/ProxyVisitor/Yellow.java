package ProxyVisitor;

import Builder.*;

public class Yellow implements ItemsCollection {
    @Override
    public String accept(CinemaVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public void addItems() {
        System.out.println("**********Yellow Hall**********");
        AbstractFilms film = new ConcreteFilm();
        AbstractFilmsBuilder builder = new UniversalPicturesFilms(film);
        Builder collector = new Builder();

        film = collector.collect(builder);
        System.out.println(film);
    }
}
