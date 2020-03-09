package test_area;

import main_area.Direction;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.awt.*;
import java.awt.geom.Area;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * @author chengcai
 * @since 2020-03-08
 * */

class AreaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("测试一个 point 是否在 Area 中")
    void test_Area() {
        Point A = new Point(10, 10, Direction.SOUTH);
        Point B = new Point(-10, 10, Direction.SOUTH);
        Point C = new Point(-10, -10, Direction.SOUTH);
        Point D = new Point(10, -10, Direction.SOUTH);
        Area area = new Area(A, B, C, D);

        assertTrue(area.contains(new Point(2, 2, Direction.SOUTH)));
        assertTrue(area.contains(new Point(10, 10, Direction.SOUTH)));
        assertFalse(area.contains(new Point(20, 2, Direction.SOUTH)));
        assertFalse(area.contains(new Point(-11, -11, Direction.SOUTH)));
        assertFalse(area.contains(new Point(-11, 1, Direction.SOUTH)));
        assertFalse(area.contains(new Point(1, 11, Direction.SOUTH)));

    }

}