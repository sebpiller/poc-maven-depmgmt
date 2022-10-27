package ch.sebpiller.poc;

import org.apache.commons.lang3.CharEncoding;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Module2Service {
    private final Logger log = LoggerFactory.getLogger(Module2Service.class);

    public void doit() {
        log.info("I'm on the verge to call a commons-lang3 feature that have been deprecated since eons.");
        log.info("See if it is recognized as deprecated or not by IntelliJ ?");
        log.info("It works: {}", CharEncoding.isSupported("UTF-8"));

        log.info("I will call something that only exist in the newest version");
        log.info("It works: {}", StringUtils.compareIgnoreCase("ABC", "abc") == 0); // boom, compile error now. better
    }
}