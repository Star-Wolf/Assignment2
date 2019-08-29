import static org.junit.jupiter.api.Assertions.*;

class FinderTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void getMax() {
        int[] arrTest = new int[]{1, 2, 4, 10, 3};
        int test = Finder.getMax(arrTest);
        int actual = 10;
        assertEquals(test, actual);
    }

    @org.junit.jupiter.api.Test
    void getMin() {
        int[] arrTest = new int[]{1, 2, 4, 10, 3};
        int test = Finder.getMin(arrTest);
        int actual = 1;
        assertEquals(test, actual);

    }

    @org.junit.jupiter.api.Test
    void getMin2() {

        assertEquals(Finder.getMin(null), null);
        //int[] arrTest = new int[]{};
        //int test = Finder.getMin(arrTest);

        //assertNull(test);

    }

    @org.junit.jupiter.api.Test
    void getMax2() {
        assertEquals(Finder.getMax(null), null);

    }


}