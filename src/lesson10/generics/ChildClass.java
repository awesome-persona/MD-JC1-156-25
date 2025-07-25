package lesson10.generics;

public class ChildClass<L> extends TestClass<String> {


    public static void main(String[] args) {
        ChildClass<? extends Number> childClass = new ChildClass<>();
        String someValue = childClass.getSomeValue();

    }



    public <M extends Number> Number toDo(M value, L value2) {
        if (value instanceof Integer i) {
            return (i + 100);
        } else if (value instanceof Double d) {
            return d + 0.01;
        } else {
            return value;
        }
    }

     public static <K> void someFix(K value) { }

     public <K, H> void someFix(K value, H value2, L value3) { }
}
