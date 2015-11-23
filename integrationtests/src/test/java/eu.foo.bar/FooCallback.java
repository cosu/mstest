package eu.foo.bar;

import org.mockserver.mock.action.ExpectationCallback;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;
import org.mockserver.model.HttpStatusCode;

public class FooCallback implements ExpectationCallback {
    public HttpResponse handle(HttpRequest httpRequest) {
        HttpResponse response = HttpResponse.response();
        return response.withBody("foo").withStatusCode(HttpStatusCode.OK_200.code());
    }
}
