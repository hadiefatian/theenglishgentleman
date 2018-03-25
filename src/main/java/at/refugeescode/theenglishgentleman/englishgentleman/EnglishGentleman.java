package at.refugeescode.theenglishgentleman.englishgentleman;

import at.refugeescode.theenglishgentleman.components.Lighter;
import at.refugeescode.theenglishgentleman.components.Monocle;
import org.springframework.stereotype.Component;

@Component
public class EnglishGentleman {

    private Lighter lighter;
    private Monocle monocle;
    private boolean heSmoked;
    private boolean heReadNewspaper;

    public EnglishGentleman(Lighter lighter, Monocle monocle) {
        this.lighter = lighter;
        this.monocle = monocle;
    }

    public void read(Newspaper newspaper) {
        monocle.read(newspaper);
        heReadNewspaper = true;
    }

    public void smoked(Cigar cigar) {
        lighter.light(cigar);
        heSmoked = true;
    }

    public boolean hadAGoodDay() {
        return heReadNewspaper && heSmoked;
    }
}