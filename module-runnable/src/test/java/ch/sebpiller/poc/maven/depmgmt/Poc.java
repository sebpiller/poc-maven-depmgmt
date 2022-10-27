package ch.sebpiller.poc.maven.depmgmt;

import ch.sebpiller.poc.Module1Service;
import ch.sebpiller.poc.Module2Service;
import org.junit.jupiter.api.Test;

public class Poc {

    @Test
    void poc_me_im_famous() {
        var m1 = new Module1Service();

        var m2 = new Module2Service();

        // What will happen ?
        m1.doit();
        m2.doit();

    }
}
