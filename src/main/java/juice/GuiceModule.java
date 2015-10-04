package juice;

import com.google.inject.AbstractModule;

import cucumber.api.guice.CucumberScopes;

public final class GuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(driverInterface.class).toProvider(driverProvider.class).in(CucumberScopes.SCENARIO);

    }
}