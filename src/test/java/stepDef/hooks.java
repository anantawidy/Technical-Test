package stepDef;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

import static helper.utility.quitDriver;
import static helper.utility.startDriver;

public class hooks {
    @BeforeAll
    public static void beforeTest() {
        startDriver();
    }
        @AfterAll
        public static void afterTest(){
            quitDriver();
        }
}
