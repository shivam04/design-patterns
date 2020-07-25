package designPattern.strateyPattern;

/**
 * Created by shivam.si on 25/07/20 10:39 am
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
