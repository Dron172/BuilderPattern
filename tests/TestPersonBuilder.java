import org.example.Person;
import org.example.PersonBuilder;
import org.junit.Test;

import static org.example.PersonBuilder.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

public class TestPersonBuilder {
    @Test
    public void personBuilderTest() throws IllegalArgumentException {

        Person testMom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(131)
                .setAddress("Сидней")
                .build();

        Throwable thrown = assertThrows(IllegalArgumentException.class, testMom::getAge);
        assertNotNull(thrown.getMessage());

    }
}
