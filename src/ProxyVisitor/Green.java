package ProxyVisitor;

import Factory.Cartoon;
import Factory.WarnerBrosCartoons;

import java.util.ArrayList;

public class Green implements ItemsCollection {
    ArrayList<Cartoon> green;

    public Green()
    {
        green = new ArrayList<>();
    }

    @Override
    public String accept(CinemaVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public void addItems() {
        System.out.println("*********Green Hall***********");
    green.add(new WarnerBrosCartoons());
        for(Cartoon p: green)
        {
            System.out.println(p.toString());
        }
    }
}
