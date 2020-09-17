package com.other;

import java.util.Scanner;
/**
 * 各种成绩要求
 */
public class ScoreMaster {
    public static void main(String[] args) {
        // 声明六个变量， 分别代表六门科目的成绩
        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int WaiYuIndex = 2;
        int WuLiIndex = 3;
        int HuaXueIndex = 4;
        int ShengWuIndex = 5;

        int totalScoreCount = 6;

        // 每门课的名字
        String[] names = new String[totalScoreCount];
        names[YuWenIndex] = "语文";
        names[ShuXueIndex] = "数学";
        names[WaiYuIndex] = "外语";
        names[WuLiIndex] = "物理";
        names[HuaXueIndex] = "化学";
        names[ShengWuIndex] = "生物";

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入共有多少年的成绩：");

        int yearCount = scanner.nextInt();

        double[][] scores = new double[yearCount][totalScoreCount];

        for (int i = 0; i < yearCount; i++) {
            for (int j = 0; j < totalScoreCount; j++) {
                scores[i][j] = 80 + Math.random() * 20;
                System.out.println("第" + (i + 1) + "年" + names[j] + "成绩为：" + scores[i][j]);
            }
        }

        while(true){
            System.out.println("请选择要进行的操作编号");
            System.out.println("1: 求某年最好成绩\n"+ "2: 求某年的平均成绩\n"+
                    "3: 求所有年份最好成绩\n"+
                    "4: 求某门课历年最好成绩\n"
            );

            int oprtId = scanner.nextInt();

            int year = 0;
            switch(oprtId) {
                case 1:
                    System.out.println("求哪年最好成绩");

                    year = scanner.nextInt() - 1;

                    if (year < 0 || year >= yearCount) {
                        System.out.println("非法年份");
                        break;
                    }
                    int bestOfYearScoreId = 0;
                    for (int i = 1; i < scores[year].length; i++) {
                        if (scores[year][bestOfYearScoreId] < scores[year][i]) {
                            bestOfYearScoreId = i;
                        }

                    }
                    System.out.println("第" + (year + 1) + "年最好成绩是" + names[bestOfYearScoreId] + "是" + scores[year][bestOfYearScoreId]);

                    break;
                case 2:
                    //totalScoreCount = names.length
                    System.out.println("请输入要计算第几年的平均成绩");
                    year = scanner.nextInt() - 1;
                    if (year < 0 || year >= yearCount) {
                        System.out.println("非法年份");
                        break;
                    }

                    double yearScoreSum = 0;
                    for (int i = 0; i < totalScoreCount; i++) {
                        System.out.println(i);
                        yearScoreSum = yearScoreSum + scores[year][i];
                    }

                    System.out.println("第" + (year + 1) + "年平均成绩是" + yearScoreSum / (names.length));

                    break;
                case 3:
                    System.out.println("求所有年份最好成绩");

                    int best = 0;
                    int bestYear = 0;

                    for (int i = 0; i < yearCount; i++) {
                        for (int j = 0; j < totalScoreCount; j++) {
                            if (scores[bestYear][best] < scores[i][j]) {
                               // System.out.println(scores[bestYear][best]);
                                bestYear = i;
                                best = j;
                            }

                        }
                    }
                    System.out.println("最好成绩是第"+(bestYear+1)+"年的"+names[best]+scores[bestYear][best]);
                    break;
                case 4:
                    System.out.println("请输入要计算课程编号");

                    int subject = scanner.nextInt();
                    if (subject < 0 || subject >= totalScoreCount) {
                        System.out.println("非法");
                        break;
                    }

                    int bestSubjectYear = 0;

                    for (int i = 0; i < yearCount; i++) {
                            if (scores[bestSubjectYear][subject-1] < scores[i][subject-1]) {
                                // System.out.println(scores[bestYear][best]);
                                bestSubjectYear = i;
                            }
                    }
                    System.out.println("最好成绩是第"+(bestSubjectYear+1)+"年的"+names[subject-1]+scores[bestSubjectYear][subject-1]);

                    break;

                default:
                    System.out.println("不支持：" + oprtId + "， 程序结束。");



            }


        }

    }
}
