package designPattern.visitorPattern;

/**
 * Created by shivam.si on 25/07/20 10:49 am
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
