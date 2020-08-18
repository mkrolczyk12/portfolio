package io.github.mkrolczyk12;

import io.github.mkrolczyk12.exceptionHandler.GeneralExceptionsProcessing;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@GeneralExceptionsProcessing
@RequestMapping(path = "/")
public class HomePage {
    private final String DEFAULT_LANGUAGE = "pl";

    @GetMapping
    public RedirectView redirectToDefaultPage() {
        return new RedirectView(DEFAULT_LANGUAGE);
    }
}
