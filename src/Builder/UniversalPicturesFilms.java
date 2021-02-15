package Builder;

public class UniversalPicturesFilms extends AbstractFilmsBuilder {
    public UniversalPicturesFilms(AbstractFilms film) {
        this.film = film;
    }

    @Override
    public void setName(String s) {
    this.film.name = s;
    }

    @Override
    public void setName() {
    this.film.name = "Мир Юрского периода";
    }

    @Override
    public void setProducer() {
    this.film.producer = "Коллин Треворроу";
    }

    @Override
    public void setProducer(String p) {
        this.film.producer = p;
    }

    @Override
    public void setYear() {
    this.film.creationYear = 2015;
    }

    @Override
    public void setYear(int y) {
    this.film.creationYear = y;
    }
}
