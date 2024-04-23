package org.example;


import org.junit.platform.launcher.core.EngineDiscoveryOrchestrator;
import org.junit.platform.launcher.core.Launcher;
import org.junit.platform.launcher.core.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.engine.DiscoverySelector;
import org.junit.platform.engine.TestEngine;
import org.junit.platform.launcher.core.DefaultLauncherMutable;

public class Main {
    public static void main(String[] args) {
        TestEngine engine = new JupiterEngineDescriptor();
        Launcher launcher = LauncherFactory.create();

        launcher.execute(LauncherDiscoveryRequest.request()
                .selectors(DiscoverySelector.selectEngine(engine.getId())));
    }
}