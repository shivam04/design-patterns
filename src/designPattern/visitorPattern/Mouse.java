package designPattern.visitorPattern;

/**
 * Created by shivam.si on 25/07/20 10:50 am
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
