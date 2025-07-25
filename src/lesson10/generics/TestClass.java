package lesson10.generics;

public class TestClass<T> {

    private T someValue;

    public T getSomeValue() {
        return someValue;
    }

    public void setSomeValue(T someValue) {
        this.someValue = someValue;
    }
}
