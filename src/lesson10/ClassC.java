package lesson10;

public class ClassC {

    private ClassA classA;
    private ClassB classB;

    public ClassC(ClassA classA, ClassB classB) {
        this.classA = classA;
        this.classB = classB;
    }

    public ClassC(int a, int b) {
        this.classA = new ClassA(a);
        this.classB = new ClassB(b);
    }

    public void methodA() {
        classA.methodA();
    }

    public void anotherMethodA() {
        classA.anotherMethodA();
    }

    public void methodB() {
        classB.methodB();
    }

    public void anotherMethodB() {
        classB.anotherMethodB();
    }

}
