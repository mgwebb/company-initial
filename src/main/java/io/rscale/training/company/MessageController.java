package io.rscale.training.company;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@RestController
class MessageController {

    @Value("${message: Hello world}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return "\n" + this.message + "\n\n";
    }
}
