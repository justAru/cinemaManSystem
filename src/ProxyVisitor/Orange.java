package ProxyVisitor;

import Factory.Cartoon;
import Factory.WaltDisneyCartoons;
import Factory.WarnerBrosCartoons;

import java.util.ArrayList;

public class Orange implements ItemsCollection {
    ArrayList<Cartoon> orange;

    public Orange()
    {
        orange = new ArrayList<>();
    }

    @Override
    public String accept(CinemaVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public void addItems() {
        System.out.println("*********Orange Hall***********");
        orange.add(new WaltDisneyCartoons());
        for(Cartoon p: orange)
        {
            System.out.println(p.toString());
        }
    }
}
