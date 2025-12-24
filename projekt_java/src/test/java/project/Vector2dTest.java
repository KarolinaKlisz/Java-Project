package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector2dTest {

    @Test
    public void checkEquals(){
        // given
        Vector2d vector1 = new Vector2d(1,3);
        Vector2d vector2 = vector1;

        // when
        boolean equals = vector2.equals(vector1);

        // then
        assertTrue(equals);
    }

    @Test
    public void testToString(){
        assertEquals("(1,5)", new Vector2d(1, 5).toString());
    }

    @Test
    void precedes() {
        assertTrue(new Vector2d(0, 0).precedes(new Vector2d(0, 0)));
        assertTrue(new Vector2d(1, 0).precedes(new Vector2d(2, 1)));
        assertTrue(new Vector2d(1, 0).precedes(new Vector2d(1, 1)));
        assertFalse(new Vector2d(0, 0).precedes(new Vector2d(-1, 0)));
    }

    @Test
    void follows() {
        assertTrue(new Vector2d(0, 0).follows(new Vector2d(0, 0)));
        assertTrue(new Vector2d(2, 1).follows(new Vector2d(1, 0)));
        assertTrue(new Vector2d(1, 1).follows(new Vector2d(1, 0)));
        assertFalse(new Vector2d(-1, 0).follows(new Vector2d(0, 0)));
    }

    @Test
    void upperRight() {
        assertEquals(new Vector2d(1,2), new Vector2d(0, 0).upperRight(new Vector2d(1, 2)));
        assertEquals(new Vector2d(1, 2), new Vector2d(1, -1).upperRight(new Vector2d(0, 2)));
    }

    @Test
    void lowerLeft() {
        assertEquals(new Vector2d(1,2), new Vector2d(2, 3).lowerLeft(new Vector2d(1, 2)));
        assertEquals(new Vector2d(1, 2), new Vector2d(1, 3).lowerLeft(new Vector2d(4, 2)));
    }

    @Test
    void add() {
        assertEquals(new Vector2d(-1,2), new Vector2d(-2, 5).add(new Vector2d(1, -3)));
    }

    @Test
    void subtract() {
        assertEquals(new Vector2d(-1,2), new Vector2d(-2, 5).subtract(new Vector2d(-1, 3)));
    }

    @Test
    void opposite() {
        assertEquals(new Vector2d(-1,2), new Vector2d(1, -2).opposite());
    }
}