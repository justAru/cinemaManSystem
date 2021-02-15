package ProxyVisitor;

import Factory.Cartoon;
import Factory.PixarAnimationStudio;
import Factory.WarnerBrosCartoons;

import java.util.ArrayList;

public class Blue implements ItemsCollection {
    ArrayList<Cartoon> blue;

    public Blue()
    {
        blue = new ArrayList<>();
    }

    @Override
    public String accept(CinemaVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public void addItems() {
        System.out.println("*********Blue Hall***********");
        blue.add(new PixarAnimationStudio());
        for(Cartoon p: blue)
        {
            System.out.println(p.toString());
        }
    }
}
