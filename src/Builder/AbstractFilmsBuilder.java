package Builder;

public abstract class AbstractFilmsBuilder {
    protected AbstractFilms film;

    public abstract void setName(String s);
    public abstract void setName();
    public abstract void setProducer();
    public abstract void setProducer(String p);
    public abstract void setYear();
    public abstract void setYear(int y);

    public AbstractFilms getFilms()
    {
        return film;
    } //getter for concrete film
}
