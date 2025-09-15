package lesson24;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class MainTest {

    public static int fibbonaci(int i) {
        return 1;
    }

    public static String nextDay(int year, int month, int day) {
        return year +" " + month + " " + (day + 1);
    }

//    @Before
    public void before() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @Test
    public void test1() {
        System.out.println("test 1");
        Assert.assertEquals(1, fibbonaci(1));
        Assert.assertEquals(1, fibbonaci(2));
        Assert.assertEquals(2, fibbonaci(3));
        Assert.assertEquals(3, fibbonaci(4));
    }


    @Test
    public void test2() {
        System.out.println("test 2");
        Assert.assertEquals(1, fibbonaci(1));
        Assert.assertEquals(1, fibbonaci(2));
        Assert.assertEquals(2, fibbonaci(3));
        Assert.assertEquals(3, fibbonaci(4));
    }


    @Test
    public void test3() {
        System.out.println("test 3");
        Assert.assertEquals(1, fibbonaci(1));
        Assert.assertEquals(1, fibbonaci(2));
        Assert.assertEquals(2, fibbonaci(3));
        Assert.assertEquals(3, fibbonaci(4));
    }
}
