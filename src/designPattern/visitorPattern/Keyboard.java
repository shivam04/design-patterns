package designPattern.visitorPattern;

/**
 * Created by shivam.si on 25/07/20 10:49 am
 */
public class Keyboard implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
