package io.github.mkrolczyk12.pl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/pl/*")
public class PageController {

    @GetMapping
    public String getPage() {
        return "index.html";
    }
}
