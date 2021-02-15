package Builder;

public abstract class AbstractFilms implements Cloneable {
    String name = "";
    String producer = "";
    int creationYear;

    @Override
    public Object clone() {
        try
        {
            return super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            return null;
        }
    }
}
