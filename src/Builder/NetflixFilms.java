package Builder;

public class NetflixFilms extends AbstractFilmsBuilder {
    public NetflixFilms(AbstractFilms film) {
        this.film = film;
    }

    @Override
    public void setName(String s) {
    this.film.name = s;
    }

    @Override
    public void setName() {
    this.film.name = "Holidate";
    }

    @Override
    public void setProducer() { this.film.producer = "Джон Уайтсел";
    }

    @Override
    public void setProducer(String p) {
    this.film.producer = p;
    }

    @Override
    public void setYear() {
    this.film.creationYear = 2020;
    }

    @Override
    public void setYear(int y) {
    this.film.creationYear = y;
    }
}
