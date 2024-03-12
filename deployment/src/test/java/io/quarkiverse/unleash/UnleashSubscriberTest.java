package io.quarkiverse.unleash;

import static org.junit.jupiter.api.Assertions.assertTrue;

import jakarta.inject.Inject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import io.quarkus.test.QuarkusUnitTest;

public class UnleashSubscriberTest {

    @RegisterExtension
    static final QuarkusUnitTest TEST = new QuarkusUnitTest()
            .withApplicationRoot((jar) -> jar.addClasses(ReadyUnleashSubscriber.class));

    @Inject
    ReadyUnleashSubscriber unleashSubscriber;

    @Test
    void test() {
        assertTrue(unleashSubscriber.isClientRegistered());
    }
}
