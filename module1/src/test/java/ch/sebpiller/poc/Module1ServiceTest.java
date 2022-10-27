package ch.sebpiller.poc;

import org.junit.jupiter.api.Test;

class Module1ServiceTest {

    @Test
    void test_it_works() {
        var service = new Module1Service();
        service.doit();
    }
}