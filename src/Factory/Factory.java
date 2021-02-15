package Factory;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private Map<String, Cartoon> cartoons = new HashMap<String, Cartoon>();

    public Cartoon findFilm(String type) {

        if(cartoons.containsKey(type))
        {
            return cartoons.get(type);
        }
        else
        {
            Cartoon crt = null;

            if(type.equals("Walt"))
            {
                crt = new WaltDisneyCartoons();
            }
            if(type.equals("Warner Bros."))
            {
                crt = new WarnerBrosCartoons();
            }
            if(type.equals("Pixar"))
            {
                crt = new PixarAnimationStudio();
            }
            cartoons.put(type, crt);
            return crt;
        }
    }
}
