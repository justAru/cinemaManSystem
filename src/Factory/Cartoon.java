package Factory;

public class Cartoon {
    String name;
    String producer;
    int year;

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return  "-----------Cartoon--------------------------\n" +
                name +
                ", producer= " + producer+
                ", year=" + year + "\n";
    }
}
