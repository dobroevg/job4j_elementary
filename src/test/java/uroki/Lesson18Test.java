package uroki;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Lesson18Test {

    @Test
    void test2x2() {
        assertEquals(4, 2 * 2);
    }

    @Test
    void testJoin() {
        String[] list = {"ye", "pu", "bl"};
        String result = Lesson18.join("-", list);
        assertEquals("[ye-pu-bl]", result);
    }

    @Test
    void testJoinWithEmptyParametrs() {
        assertEquals("[]", Lesson18.join("..."));
    }

    @Test
    void testJoinWithSingleString() {
        assertTrue(Lesson18.join(",", "hello").equals("[hello]"));
    }

    @Test
    void testJoinWithNull() {
        assertEquals(null, Lesson18.join(null, "один", "два"));
    }
}