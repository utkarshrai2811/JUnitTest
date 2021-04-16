import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class addStrings {

    @Test
    void addStrings() {
        jUnitTesting addString = new jUnitTesting();
        String result = addString.addStrings("Hello","Shraddha");
        assertEquals("HelloShraddha",result);
        result = addString.addStrings("Hello","Mansi");
        assertEquals("HelloMansi",result);
        result = addString.addStrings("Hello ","Fellas");
        assertEquals("HelloFellas",result);



    }
}
