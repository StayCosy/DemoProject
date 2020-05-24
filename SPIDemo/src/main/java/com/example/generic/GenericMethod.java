package com.example.generic;

/**
 * 范型方法
 */
public class GenericMethod {

    public static <T> T add(T t1, T t2) {
        if (t1 instanceof Integer && t2 instanceof Integer) {
            Integer a = (Integer) t1 + (Integer) t2;
            System.out.println("Integer t1 + t2 = " + a);
        }
        if (t1 instanceof String && t2 instanceof String) {
            System.out.println("String t1 + t2 = " + t1 + t2);
        }
        return t1;
    }

    public static <K> K add(K k1) {
        if (k1 instanceof Integer) {
            System.out.println("String value = " + k1);
        }
        if (k1 instanceof String) {
            System.out.println("Integer value = " + k1);
        }
        return k1;
    }

    // 范型重载T、K、E是同一种类型
    /*public static <E> E add(E e1,E e2) {
        if (e1 instanceof String) {
            System.out.println("E is String " + e1);
        }
        if (e1 instanceof Integer) {
            System.out.println("E is Integer " + e1);
        }
        return e1;
    }*/

    public static void main(String[] args) {
        GenericMethod.add(1, 5);
        GenericMethod.add("1", "5");
        GenericMethod.add("1");
        GenericMethod.add(1);
    }
}
