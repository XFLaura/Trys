import java.util.*;
import java.math.BigInteger;

public class MathChange {


    public static void main(String[] args){

        System.out.println("Please enter a decimal number:");
        Scanner scanner = new Scanner(System.in);

        String binaryNum = decimalToBinary(scanner.nextInt());

        System.out.println(binaryNum);


        System.out.println("Please enter a binary number:");

        int decimalNum = binaryToDecimal(scanner.next());

        System.out.println(decimalNum);

    }

    /**
     * @Description: 十进制转换成二进制
     * @param decimalSource
     * @return String
     */
    public static String decimalToBinary(int decimalSource) {
        BigInteger bi = new BigInteger(String.valueOf(decimalSource)); //转换成BigInteger类型，默认是十进制
        return bi.toString(2); //参数2指定的是转化成二进制
    }

    /**
     * @Description: 二进制转换成十进制
     * @param binarySource
     * @return int
     */
    public static int binaryToDecimal(String binarySource) {
        BigInteger bi = new BigInteger(binarySource, 2);  //转换为BigInteger类型，参数2指定的是二进制
        return Integer.parseInt(bi.toString());     //默认转换成十进制
    }




}