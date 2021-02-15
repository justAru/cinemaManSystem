package ProxyVisitor;

import Builder.AbstractFilmsBuilder;
import Builder.AbstractFilms;
import Builder.Builder;
import Builder.ConcreteFilm;
import Builder.NetflixFilms;
import Builder.UniversalPicturesFilms;
import Builder.WarnerBrosFilms;
import Factory.Cartoon;
import Factory.WaltDisneyCartoons;

import java.util.ArrayList;


public class Red implements ItemsCollection {
    ArrayList<ConcreteFilm> blue;

    @Override
    public String accept(CinemaVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public void addItems() {
        System.out.println("***********Red Hall**************");
        AbstractFilms film = new ConcreteFilm();
        AbstractFilmsBuilder builder = new NetflixFilms(film);
        Builder collector = new Builder();

        film = collector.collect(builder);
        System.out.println(film);
    }
}
