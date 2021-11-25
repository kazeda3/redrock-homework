package Level_03;

import java.util.Scanner;

public class CalculateDemo {
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    String string = sc.next();
//    int b = sc.nextInt();
//    int c = 0;
//    int a = 0;
//    int b = 0;
//    int c = 0;
//    String string = null;
    public static void main(String[] args) {
        System.out.println("缺德计算器启动");
        System.out.println("暂不支持负数");
        System.out.println("请按照【数字】【空格】【符号】【空格】【数字】的格式输入表达式");
        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        float a1 = 0;
//        String string = sc.next();
//        String b = sc.next();
//        float b1 = 0;
//        a1 = Float.parseFloat(a);
//        b1 = Float.parseFloat(b);
        float a1 = sc.nextFloat();
        String string = sc.next();
        float b1 = sc.nextFloat();
        float c = 0;
        try{
            count(a1,string,b1,c);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("你输入的数据有问题");
        }
    }


    public static void count(float a,String string,float b,float c)throws Exception {
//        StringExceptionDemo stringExceptionDemo = new StringExceptionDemo();
//        stringExceptionDemo.stringException(string);
        //上面的自定义错误有点问题
        switch (string){
            case "+" :
            c = a + b;
            break;
            case "-" :
            c = a - b;
            break;
            case "*" :
            c = a * b;
            break;
            case "/" :
            DidiveZeroExceptionDemo didiveZeroExceptionDemo = new DidiveZeroExceptionDemo();
            didiveZeroExceptionDemo.divideZero(b);
            c = a / b;
            break;
        }
//        if (string.equals("+")) {
//            c = a + b;
////            System.out.println("="+c);
//        } else if (string.equals("-")) {
//            c = a - b;
////            System.out.println("="+c);
//        } else if (string.equals("*")) {
//            c = a * b;
////            System.out.println("="+c);
//        } else if (string.equals("/")) {
//            DidiveZeroExceptionDemo didiveZeroExceptionDemo = new DidiveZeroExceptionDemo();
//            didiveZeroExceptionDemo.divideZero(b);
//            c = a / b;
//            System.out.println("="+c);
//        }else {
//            System.out.println("你符号输错了");
        System.out.println("="+c);
    }
//    public void divideZero(int i)throws DidiveZeroException{
//        if(i == 0){
//            throw new DidiveZeroException();
//        }
//    }
}
