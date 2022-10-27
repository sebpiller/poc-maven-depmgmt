package ch.sebpiller.poc;

import org.apache.commons.lang3.CharEncoding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Module1Service {

    private final Logger log = LoggerFactory.getLogger(Module1Service.class);

    public void doit() {
        log.info("I'm on the verge to call a commons-lang3 feature that have been deprecated since eons.");
        log.info("See if it is recognized as deprecated or not by IntelliJ ?");

        log.info("It works: {}", CharEncoding.isSupported("UTF-8"));

        // This does not compile since CR has been added in the newer version of commons-lang:
        // log.info("It doesnt compile: {}", StringUtils.CR);
    }
}