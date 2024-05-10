package com.flibustier.SpringJava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SomethingTest {

    static Something something = new Something();

    @Test
    public void TestGetCharacters(){
        something.getClowns(0);

        assertEquals("Big ass clown", Something.clowns.getFirst());


    }

}