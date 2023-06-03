/**
 * have a skeleton of an algorithm, different subclass provide different function logic
 */
public class TemplateMethod {
    public static void main(String[] args) {
        Generator generator1 = new GeneratorA();
        Generator generator2 = new GeneratorB();
        generator1.generate();
        generator2.generate();
    }

}

abstract class Generator {
    public void task1() {
        System.out.println("carrying out task1");
    }
    public abstract  void task2();
    public void task3() {
        System.out.println("carrying out task3");
    }
    public void generate() {
        task1();
        task2();
        task3();
    }
}
class GeneratorA extends Generator {
    @Override
    public void task2() {
        System.out.println("carrying out task1 using A way");
    }
}
class GeneratorB extends Generator {
    @Override
    public void task2() {
        System.out.println("carrying out task2 using B way");
    }
}
