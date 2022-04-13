package com.jihe.itheima_15;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/17 19:40
 */
public class Teacher {
    public static void checkScore(int score) throws ScoreException {
        if(score<0||score>100){
            throw new ScoreException("你给的分数有误应该在0-100之间！");
        }
        else
        {
            System.out.println("分数正常");
        }
    }
}
