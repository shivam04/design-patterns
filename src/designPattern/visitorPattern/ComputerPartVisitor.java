package designPattern.visitorPattern;

/**
 * Created by shivam.si on 25/07/20 10:50 am
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
