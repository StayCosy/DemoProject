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

    public static void main(String[] args) {
        GenericMethod.add(1, 5);
        GenericMethod.add("1", "5");
    }
}
