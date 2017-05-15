package pl.com.bottega.funlist;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FunListTest {

    @Test
    public void shouldAddElementToEmptyList() {
        //given
        FunList<String> l = FunList.empty(String.class);

        //when
        l = l.add("ala");

        //then
        assertTrue(l.contains("ala"));
    }

    @Test
    public void shouldAddElementToNonEmptyList() {
        //given
        FunList<String> l = FunList.empty(String.class);

        //when
        l = l.add("ala").add("ma").add("psa");

        //then
        assertTrue(l.contains("ala"));
        assertTrue(l.contains("ma"));
        assertTrue(l.contains("psa"));
        assertFalse(l.contains("kota"));
    }

}
