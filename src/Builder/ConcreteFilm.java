package Builder;

public class ConcreteFilm extends AbstractFilms {
    Builder builder;

    public ConcreteFilm() {
        builder = new Builder();
    }

    @Override
    public String toString() {
        return  "-----------Film------------------------------\n" +
                name +
                ", producer= " + producer+
                ", year=" + creationYear + "\n";
    }
}
