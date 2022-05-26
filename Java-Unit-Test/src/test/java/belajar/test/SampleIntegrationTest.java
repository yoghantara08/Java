package belajar.test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tags({
        @Tag("integration-test")
})
public class SampleIntegrationTest {

    @Test
    void test1(){
        System.out.println("tag test 1");
    }

    @Test
    void test2(){
        System.out.println("tag test 2");
    }
}
