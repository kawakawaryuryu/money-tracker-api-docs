package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-20T01:05:59.783+09:00[Asia/Tokyo]")

@Controller
@RequestMapping("${openapi.moneyTracker.base-path:}")
public class V1ApiController implements V1Api {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V1ApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
