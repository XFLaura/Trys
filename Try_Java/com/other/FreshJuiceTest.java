package com.other;

class FreshJuice {
    //enum 枚举类型
    enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
    FreshJuiceSize size;
}

public class FreshJuiceTest {
    public static void main(String[] args){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM  ;
    }
}
//.java ->.class->解释执行