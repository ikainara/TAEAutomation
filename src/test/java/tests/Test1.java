package tests;

import BaseTest.BaseAbstractTest;
import org.testng.annotations.Test;


public class Test1 extends BaseAbstractTest {

    public Test1(String browser) {
        super("edge");
    }

    @Test
    public void test() {
        int a = 5+6;
    }
}
