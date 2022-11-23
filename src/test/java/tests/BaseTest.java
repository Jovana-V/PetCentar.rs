package tests;

import helpers.BaseHelper;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class BaseTest extends BaseHelper {
    @BeforeAll
    public static void testInit() {

        driver.manage().window().maximize();

    }

    @AfterAll
    public static void testTearDown() {
//        driver.close();
        //driver.quit();
    }

}