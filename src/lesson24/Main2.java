package lesson24;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Main2 {

    public static void main(String[] args)
            throws NoSuchMethodException,
            InvocationTargetException,
            InstantiationException,
            IllegalAccessException,
            ClassNotFoundException {

        Class<?> counterClass = Class.forName("lesson24.Counter");
        Method[] methods = counterClass.getMethods();
        counterClass.getModifiers();
        counterClass.getAnnotations();
        Constructor<?>[] constructors = counterClass.getConstructors();
        Constructor<?> constructor = counterClass.getDeclaredConstructor();
        Constructor<?> constructor1 = counterClass.getConstructor(int.class);
//        Counter counter = new Counter();
//        counterClass.getDeclaredConstructor()
        constructor.setAccessible(true);
        Object object = constructor.newInstance();
        System.out.println(object);
        Method inc = counterClass.getMethod("inc");

        for (int i = 0; i < 15; i++) {
            Object invoke = inc.invoke(object);
            System.out.println(object);
        }

        Method setCount = counterClass.getDeclaredMethod("setCount", int.class);
        setCount.setAccessible(true);
        setCount.invoke(object, 103);

        System.out.println(object);
        constructor.setAccessible(false);

        System.out.println();

        Properties properties = System.getProperties();
        String javaVersionString = properties.getProperty("java.version"); // 1.8  9 11 12
        Integer javaVersion = Integer.valueOf(javaVersionString);

        Class<?> clazz;
        if (javaVersion > 8) {
            clazz = Class.forName("java.lang.fx.reflect.Constructor");
        } else {
            clazz = Class.forName("java.lang.reflect.Constructor");
        }

        System.out.println();
    }
}
