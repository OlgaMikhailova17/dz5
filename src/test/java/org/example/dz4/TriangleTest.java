package org.example.dz4;

import dz4.NotTriangleException;
import dz4.NullStoronaException;
import dz4.OtrizatStoronaException;
import dz4.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @Test
    public void testArea1() throws OtrizatStoronaException, NotTriangleException, NullStoronaException {
        Triangle triangle = new Triangle();
        int n = triangle.area(5,29,30);
        assertEquals(72,n);
    }
    public ExpectedException thrown= ExpectedException.none();
    @Test
    public void testArea2() throws OtrizatStoronaException, NotTriangleException, NullStoronaException {
        Triangle triangle1 = new Triangle();
        thrown.expect(NullStoronaException.class);
        triangle1.area(0,3,2);
    }

    @Test
    public void testArea3() throws OtrizatStoronaException, NotTriangleException, NullStoronaException {
        Triangle triangle2 = new Triangle();
        thrown.expect(OtrizatStoronaException.class);
        triangle2.area(-1,3,2);
    }

    @Test
    public void testArea4() throws OtrizatStoronaException, NotTriangleException, NullStoronaException {
        Triangle triangle3 = new Triangle();
        thrown.expect(NullStoronaException.class);
        triangle3.area(4,3,9);
    }

}
