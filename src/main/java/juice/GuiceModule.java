package juice;

import com.google.inject.AbstractModule;

import cucumber.api.guice.CucumberScopes;

public final class GuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(DriverInterface.class).toProvider(DriverProvider.class).in(CucumberScopes.SCENARIO);

    }
}