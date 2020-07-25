package designPattern.visitorPattern;

/**
 * Created by shivam.si on 25/07/20 10:51 am
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
