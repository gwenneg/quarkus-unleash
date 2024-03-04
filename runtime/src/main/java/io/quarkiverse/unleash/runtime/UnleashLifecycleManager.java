package io.quarkiverse.unleash.runtime;

import jakarta.enterprise.event.Observes;

import io.getunleash.Unleash;
import io.quarkus.logging.Log;
import io.quarkus.runtime.ShutdownEvent;

public class UnleashLifecycleManager {

    private static void onShutdown(@Observes ShutdownEvent event, Unleash unleash) {
        try {
            unleash.shutdown();
        } catch (Exception ex) {
            Log.error("Shutdown unleash client failed!", ex);
        }
    }
}
