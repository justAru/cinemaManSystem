package Builder;

public class WarnerBrosFilms extends AbstractFilmsBuilder {
    public WarnerBrosFilms(AbstractFilms film) {
        this.film = film;
    }

    @Override
    public void setName(String s) {
    this.film.name = s;
    }

    @Override
    public void setName() {
    this.film.name = "Чудо женщина";
    }

    @Override
    public void setProducer() {
    this.film.producer = "Пэтти Дженкинс";
    }

    @Override
    public void setProducer(String p) {
        this.film.producer = p;
    }

    @Override
    public void setYear() {
    this.film.creationYear = 2017;
    }

    @Override
    public void setYear(int y) {
    this.film.creationYear = y;
    }
}
