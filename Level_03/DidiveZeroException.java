package Level_03;

public class DidiveZeroException extends Exception{
    public DidiveZeroException(){}

    public DidiveZeroException(String message){
        super(message);
//        System.out.println("分母不可以为0哦");
        //没用，输出不了
    }
}
