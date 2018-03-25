package at.refugeescode.theenglishgentleman.components;

import at.refugeescode.theenglishgentleman.englishgentleman.Cigar;
import org.springframework.stereotype.Component;

@Component
public class Lighter {

    public void light(Cigar cigar) {

        System.out.println("Yes, I lit the cigar!");
    }
}
