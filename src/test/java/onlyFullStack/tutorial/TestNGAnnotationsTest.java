package onlyFullStack.tutorial;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationsTest {

    @BeforeGroups(groups = "sample")
    public void beforeGroups() {
        System.out.println("@BeforeGroups");
    }

    @AfterGroups(groups = "sample")
    public void afterGroups() {
        System.out.println("@AfterGroups");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AfterMethod");
    }

    @Test(groups = "sample")
    public void runTest1() {
        System.out.println("@Test - runTest1");
    }

    @Test
    public void runTest2() {
        System.out.println("@Test - runTest2");
    }
    @Test
    public void firstTest() {
        String sample = "Employee";
        Assert.assertEquals("EMPLOYEE", sample.toUpperCase());
        System.out.println("@Test - firstTest");
    }
}