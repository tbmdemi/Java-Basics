import org.example.Week4;
import org.junit.Assert;
import org.junit.Test;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        int actualResult = Week4.max2Int(-5, 5);
        int expectedResult = 5;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMax2Int2(){
        int actualResult = Week4.max2Int(0, 5);
        int expectedResult = 5;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMax2Int3(){
        int actualResult = Week4.max2Int(-5, 0);
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMax2Int4(){
        int actualResult = Week4.max2Int(3, 4);
        int expectedResult = 4;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMax2Int5(){
        int actualResult = Week4.max2Int(-0, 0);
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinArray1(){
        int[] array = {1, 2 ,3 ,4 , 10};
        int actualResult = Week4.minArray(array);
        int expectResult = 1;
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void testMinArray2(){
        int[] array = {0, 0 ,0, 0, 0} ;
        int actualResult = Week4.minArray(array);
        int expectResult = 0;
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void testMinArray3(){
        int[] array = {-1, 46, -456, 3245, -4563} ;
        int actualResult = Week4.minArray(array);
        int expectResult = -4563;
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void testMinArray4(){
        int[] array = {-3, -4, -6, -1, -10} ;
        int actualResult = Week4.minArray(array);
        int expectResult = -10;
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void testMinArray5(){
        int[] array = {23, 345, 43657, 235457, 34645} ;
        int actualResult = Week4.minArray(array);
        int expectResult = 23;
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void testCalculateBMI1(){
        double height = 1.75;
        double weight = 70;
        String actualResult = Week4.calculateBMI(weight, height);
        String expectResult = "Thừa cân";
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void testCalculateBMI2(){
        double height = 2;
        double weight = 70;
        String actualResult = Week4.calculateBMI(weight, height);
        String expectResult = "Thiếu cân";
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void testCalculateBMI3(){
        double height = 1.6;
        double weight = 50;
        String actualResult = Week4.calculateBMI(weight, height);
        String expectResult = "Bình thường";
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void testCalculateBMI4(){
        double height = 1.7;
        double weight = 90;
        String actualResult = Week4.calculateBMI(weight, height);
        String expectResult = "Béo phì";
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void testCalculateBMI5(){
        double height = 2;
        double weight = 90;
        String actualResult = Week4.calculateBMI(weight, height);
        String expectResult = "Bình thường";
        Assert.assertEquals(expectResult, actualResult);
    }
} 