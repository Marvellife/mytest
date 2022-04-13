package com.jihe.itheima_18;

import java.util.*;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/22 0:36
 */
public class HasHMapDemo04 {
    public static void main(String[] args) {
        //自己写的,当时不知道和TreeSet有与之对应的Treemap()
        /* HashMap<Character,Integer> hashMap =new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        char[] arr=s.toCharArray();
        for (char c : arr) {
            if(hashMap.get(c)!=null){
                hashMap.put(c,hashMap.get(c)+1);
            }
            else{
                hashMap.put(c,1);
            }
        }
        TreeSet<Character> treeSet = new TreeSet<Character>(new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                int num=c1.compareTo(c2);
                return num;
            }
        });
        Set<Character> set =hashMap.keySet();
        for (Character s1 : set) {
            treeSet.add(s1);
        }
        for (Character character : treeSet) {
            System.out.print(character+"("+hashMap.get(character)+")");
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = scanner.nextLine();
        //HashMap<Character, Integer> hashMap = new HashMap<>();
        TreeMap<Character,Integer> hashMap=new TreeMap<>();
        for(int i=0;i<s.length();i++){
            if(hashMap.get(s.charAt(i))!=null){
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
            }
            else{
                hashMap.put(s.charAt(i),1);
            }
        }
        StringBuilder sb = new StringBuilder();
        Set<Character> set = hashMap.keySet();
        for (Character character : set) {
            sb.append(character).append("(").append(hashMap.get(character)).append(")");
        }
        System.out.println(sb.toString());

    }
}
