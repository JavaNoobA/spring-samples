package com.erudev.spring.basic_di.b_construct;

/**
 * @author pengfei.zhao
 * @date 2020/9/22 20:01
 */
public class ScopeReviewDemo {
    // 类级别成员
    private static String classVariable = "";

    // 对象级别成员
    private String objectVariable = "";

    public static void main(String[] args) throws Exception {
        // 方法级别成员
        String methodVariable = "";
        for (int i = 0; i < args.length; i++) {
            // 循环体局部成员
            String partVariable = args[i];

            // 此处能访问哪些变量？
            classVariable = "a";
            //objectVariable = "aaa";
        }

        // 此处能访问哪些变量？
        classVariable = "a";
        //objectVariable = "aaa";
    }

    public void test() {
        // 此处能访问哪些变量？
        classVariable = "a";
        objectVariable = "aaa";
    }

    public static void staticTest() {
        // 此处能访问哪些变量？静态方法只能访问类级别成员
        classVariable = "a";
        //objectVariable = "aaa";
    }
}
