package Builder;

public class Builder {
    public AbstractFilms collect(AbstractFilmsBuilder builder)
    {
        builder.setName();
        builder.setProducer();
        builder.setYear();
        return builder.getFilms();
    }
}
