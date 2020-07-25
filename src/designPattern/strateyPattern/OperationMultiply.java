package designPattern.strateyPattern;

/**
 * Created by shivam.si on 25/07/20 10:40 am
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
