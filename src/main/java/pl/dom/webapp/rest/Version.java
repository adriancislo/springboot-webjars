package pl.dom.webapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("version")
public class Version {
    @GetMapping
    String version() {
        return "1.1.1.1-SNAPSHOT";
    }
}
