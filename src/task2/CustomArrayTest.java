package task2;

import org.junit.Assert;
import org.junit.Test;

public class CustomArrayTest {

    @Test
    public void sort() {
        int[] arr = {5, 6, 3, 2, 5, 1, 4, 9};
        int[] expected = {1, 2, 3, 4, 5, 5, 6, 9};
        Assert.assertArrayEquals(expected, new CustomArray(arr).sort());
    }
}