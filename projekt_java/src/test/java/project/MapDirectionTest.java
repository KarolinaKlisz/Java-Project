package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapDirectionTest {

    @Test
    public void checkNext(){
        // given
        MapDirection north = MapDirection.NORTH;
        MapDirection south = MapDirection.SOUTH;
        MapDirection east = MapDirection.EAST;
        MapDirection west = MapDirection.WEST;

        // when
        MapDirection north_next = north.next();
        MapDirection south_next = south.next();
        MapDirection east_next = east.next();
        MapDirection west_next = west.next();

        // then
        assertEquals(MapDirection.EAST, north_next);
        assertEquals(MapDirection.WEST, south_next);
        assertEquals(MapDirection.SOUTH, east_next);
        assertEquals(MapDirection.NORTH, west_next);
    }

    @Test
    public void checkPrevious(){
        // given
        MapDirection north = MapDirection.NORTH;
        MapDirection south = MapDirection.SOUTH;
        MapDirection east = MapDirection.EAST;
        MapDirection west = MapDirection.WEST;

        // when
        MapDirection north_previous = north.previous();
        MapDirection south_previous = south.previous();
        MapDirection east_previous = east.previous();
        MapDirection west_previous = west.previous();

        // then
        assertEquals(MapDirection.WEST, north_previous);
        assertEquals(MapDirection.EAST, south_previous);
        assertEquals(MapDirection.NORTH, east_previous);
        assertEquals(MapDirection.SOUTH, west_previous);
    }

}

