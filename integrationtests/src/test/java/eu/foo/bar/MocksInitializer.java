package eu.foo.bar;

import org.mockserver.client.server.MockServerClient;
import org.mockserver.initialize.ExpectationInitializer;

import static org.mockserver.model.HttpCallback.callback;
import static org.mockserver.model.HttpRequest.request;

public class MocksInitializer implements ExpectationInitializer {
    private static MockServerClient mockServerClient;

    public void initializeExpectations(MockServerClient mockServerClient) {
        MocksInitializer.mockServerClient = mockServerClient;
        mockServerClient.when(request()
                .withPath("/foo.*")).callback(
                callback().withCallbackClass(FooCallback.class.getCanonicalName()));

    }
}
