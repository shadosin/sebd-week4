package com.kenzie.supportingmaterials;

import org.junit.jupiter.api.Test;

public class StringEqualityTest {
    @Test
    public void doubleEqualsTest() {
        String nameObject = new String("Earl");
        String nameLiteral = "Earl";

        System.out.println(nameLiteral == nameObject);

        // Notice this is NOT EQUALS!
        assert(nameLiteral != nameObject);
    }

    @Test
    public void equalsTest() {
        String nameObject = new String("Earl");
        String nameLiteral = "Earl";

        System.out.println(nameLiteral.equals(nameObject));
        assert(nameLiteral.equals(nameObject));
    }
}
