package com.jihe.itheima_15;

import java.util.Scanner;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/17 19:45
 */
public class TecherTest {
    public static void main(String[] args)  {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入分数：");
        int score=scanner.nextInt();
        try {
            Teacher.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
