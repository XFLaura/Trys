package com.other;

public class Example {

    public static void main(String[] args) {

        int YuWen = 0;
        int ShuXue = 1;
        int WuLi = 2;
        int HuaXue = 3;
        int ShengWu = 4;
        int WaiYu = 5;

        int totalScoreCount = 6;
        double[] scores = new double[totalScoreCount];
        String[] scoreNames = new String[totalScoreCount];

        scoreNames[YuWen] = "语文";
        scoreNames[ShuXue] = "数学";
        scoreNames[WaiYu] = "外语";
        scoreNames[WuLi] = "物理";
        scoreNames[ShengWu] = "生物";
        scoreNames[HuaXue] = "化学";

        for (int i = 0; i < totalScoreCount; i++) {
            scores[i] = 97 + Math.random() * 3;
            System.out.println(scoreNames[i] + scores[i]);
        }

        scores[4]=99.99;
        scores[5]=99.99;
        double maxScore = 0;
        int maxScoreIndex = -1;

        for (int i = 0; i < totalScoreCount; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxScoreIndex = i;
            }
        }

        System.out.println("最好"+scoreNames[maxScoreIndex]+":"+maxScore);

        System.out.println(maxScore );//最高分数

        for (int j = 0; j < totalScoreCount; j++) {
//            System.out.println(j);//选出和最高分数相同的科目

            if (maxScore ==  scores[j]) {
                System.out.println(scores[j]);//选出和最高分数相同的科目

                System.out.println(scoreNames[j] +"："+ scores[j]);//选出和最高分数相同的科目
            }

        }

        //System.out.println("最好"+scoreNames[maxScoreIndex]+":"+maxScore);

    }



}
