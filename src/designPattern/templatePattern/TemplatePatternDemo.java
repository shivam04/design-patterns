package designPattern.templatePattern;

/**
 * Created by shivam.si on 25/07/20 10:45 am
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
