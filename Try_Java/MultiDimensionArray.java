
public class MultiDimensionArray {
    public static void main(String[] args) {
        // 创建一个double类型的二维数组
        double[][] multiDimensionArr = new double[3][5];

        // 循环查看每个数组元素的值，在给数组元素赋值前，数组元素的值其实都是每种类型的初始值。
        for (int i = 0; i < multiDimensionArr.length; i++) {//一维长度3
            for (int j = 0; j < multiDimensionArr[i].length; j++) {
                System.out.println("multiDimensionArr[" + i + "][" + j + "]=" + multiDimensionArr[i][j]);
            }
        }

        multiDimensionArr[2] = new double[100];

        // 循环查看每个数组元素的值，在给数组元素赋值前，数组元素的值其实都是每种类型的初始值。
        for (int i = 0; i < multiDimensionArr.length; i++) {//一维长度3
            System.out.println("multiDimensionArr[" + i + "].length=" + multiDimensionArr[i].length);

            for (int j = 0; j < multiDimensionArr[i].length; j++) {
                System.out.println("multiDimensionArr[" + i + "][" + j + "]=" + multiDimensionArr[i][j]);
            }
        }

    }
}