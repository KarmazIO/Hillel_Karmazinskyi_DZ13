import com.dz13.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayFuncsTest {
    Main main = new Main();
    int[][] array1 = {{5, 7, 3}, {7, 0, 1}, {8, 1, 2, 12}};

    @Test
    public void checkSquare() {
        Assertions.assertTrue(Main.checkIfSquare(array1) == false);
    }

    @Test
    public void averageOfArray() {
        Assertions.assertEquals(4.6, Main.getArrayAverage(array1));
    }


}
