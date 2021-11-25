package Level_03;

import java.util.Arrays;
import java.util.List;

public class StringExceptionDemo {
    public void stringException(String s) throws StringException {
//        boolean a = s.equals("+");
//        boolean b = s.equals("-");
//        boolean c = s.equals("*");
//        boolean d = s.equals("/");
//        String[] strings = {"+","-","*","/"};
        String[] array =  {"+","-","*","/"};
        boolean bl = Arrays.asList(array).contains("s");
        if (bl != true){
            throw new StringException();
        }
        //由于一些莫名其妙的问题，这个错误即使符号正确也会被抛出，所以只能放着不能用了，我是fw
//        String string ="+-*/";
//        if(string.indexOf(s) == -1){
//            throw new StringException();
//        }
    }
}
