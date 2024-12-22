package com.exemple.projet2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class SortPersonsExampleTest {

    @Test
    public void testSortPersons() {

        List<Person> people = new ArrayList<>();
        people.add(new Person(" Hamid ", " Jamila "));
        people.add(new Person(" Martin ", " Bob "));
        people.add(new Person(" Hamid ", " Charles "));
        people.add(new Person(" Bernard ", " Jamila "));

        Collections.sort(people);

        assertEquals("Bernard, Jamila", people.get(0).toString());
        assertEquals("Hamid, Charles", people.get(1).toString());
        assertEquals("Hamid, Jamila", people.get(2).toString());
        assertEquals("Martin, Bob", people.get(3).toString());
    }
}
