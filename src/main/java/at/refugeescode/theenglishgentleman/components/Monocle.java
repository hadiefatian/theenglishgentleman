package at.refugeescode.theenglishgentleman.components;

import at.refugeescode.theenglishgentleman.englishgentleman.Newspaper;
import org.springframework.stereotype.Component;

@Component
public class Monocle {

    public void read(Newspaper newspaper) {

        System.out.println("Yes, I got the monocle!");
    }
}
