package at.refugeescode.theenglishgentleman.englishgentleman;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class EnglishGentlemanTest {

    @Autowired
    EnglishGentleman englishGentleman;

    @Test
    void heHadAGoodDay() {
        englishGentleman.read(new Newspaper());
        englishGentleman.smoked(new Cigar());

        boolean hadAGoodDay = englishGentleman.hadAGoodDay();
        assertEquals(true, hadAGoodDay);
    }
}