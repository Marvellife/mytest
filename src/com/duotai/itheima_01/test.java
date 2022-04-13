package com.duotai.itheima_01;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/11 0:31
 */
public class test {
    public static void main(String[] args) {
        /*百钱买百鸡：
         * 公鸡5块钱一只
         * 母鸡3块钱一只
         * 小鸡一块钱3只
         * 设：
         *       公鸡x只，母鸡y只，小鸡z只
         * */
       /* for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) {
                for (int z = 0; z <= 100; z++) {
                    if ((x + y + z ==100) && (15 * x + 9* y + z == 300)) {
                        System.out.println("公鸡：" + x + "  母鸡：" + y + "  小鸡：" + z);
                    }

                }
            }
        }*/
        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) {
                int z = 100 - x - y;
                if ((z % 3 == 0) && (5 * x + 3 * y + z/3 == 100)) {
                    System.out.println("公鸡：" + x + "  母鸡：" + y + "  小鸡：" + z);
                }

            }
        }
    }
}

