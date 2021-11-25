package Level_03;

public class DidiveZeroExceptionDemo {
    public void divideZero(float i)throws DidiveZeroException{
        if(i == 0){
            throw new DidiveZeroException();
        }
    }
}
