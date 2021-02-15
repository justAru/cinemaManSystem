package Factory;

public class ManageClass {
    Factory factory;

    public ManageClass(Factory factory){
        this.factory = factory;
    }

    public Cartoon createPainting(String type){
        Cartoon crt = factory.findFilm(type);
        return crt;
    }
}
