import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrianglesTest {

    private Triangles triangles;

    @BeforeEach
    public void setUp(){
        triangles = new Triangles();
    }

    @Test
    public void getRow() {
        String expected = "********************";
        int width = 20;
        String actual = triangles.getRow(width);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getTriangleTest1() {
        String expected =
                "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n" +
                        "*****\n" +
                        "******\n" +
                        "*******\n" +
                        "********\n" +
                        "*********\n"+
                        "**********\n";
        String actual = triangles.getTriangle(10);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getTriangleTest2() {
        String expected =
                "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n";
        String actual = triangles.getTriangle(4);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetLargeTriangle() {
        String expected =
                "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n" +
                        "*****\n" +
                        "******\n" +
                        "*******\n" +
                        "********\n" +
                        "*********\n";
        String actual = triangles.getLargeTriangle();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testGetSmallTriangle() {
        String expected =
                "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n";
        String actual = triangles.getSmallTriangle();
        Assertions.assertEquals(expected, actual);
    }
}
