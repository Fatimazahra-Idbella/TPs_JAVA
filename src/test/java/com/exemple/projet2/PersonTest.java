package com.exemple.projet2;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    public void testCompareTo_ShouldSortByLastNameThenFirstName() {
        Person person1 = new Person("Hamid", "Jamila");
        Person person2 = new Person("Hamid", "Charles");
        Person person3 = new Person("Bernard", "Jamila");

        // Comparer par nom de famille
        assertTrue(person3.compareTo(person1) < 0); // Bernard < Hamid
        assertTrue(person1.compareTo(person3) > 0); // Hamid > Bernard

        // Comparer par prénom quand les noms de famille sont identiques
        assertTrue(person1.compareTo(person2) > 0); // Jamila > Charles
        assertTrue(person2.compareTo(person1) < 0); // Charles < Jamila

        assertEquals(0, person1.compareTo(new Person("Hamid", "Jamila")));
    }

    public void testToString_ShouldReturnFormattedName() {
        Person person = new Person("Martin", "Bob");

        assertEquals("Martin, Bob", person.toString());
    }

    public void testGetters_ShouldReturnCorrectValues() {
        Person person = new Person("Doe", "John");

        assertEquals("Doe", person.getLastName());
        assertEquals("John", person.getFirstName());
    }
}
