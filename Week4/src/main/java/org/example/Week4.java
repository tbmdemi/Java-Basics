public class Week4 {
    public static int max2Int(int a, int b) {
        // Tim gia tri lon nhat cua hai so nguyen
        return Math.max(a, b);
    }

    /**
     * using minArray to return min value of the array.
     * @param array
     * @return
     */
    public static int minArray(int[] array) {
        // Tim gia tri nho nhat cua 1 mang so nguyen
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    /**
     * Use calculateBMI with given weight and height to calculate BMI and return the indicate status.
     * @param weight
     * @param height
     * @return
     */
    public static String calculateBMI(double weight, double height){
        // Tinh BMI
        double bmi = Math.round(weight / Math.pow(height, 2)  * 10) / 10.0 ;
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi < 22.9) {
            return "Bình thường";
        } else if (bmi < 24.9) {
            return "Thừa cân";
        } else {
            return  "Béo phì";
        }
    }
}

