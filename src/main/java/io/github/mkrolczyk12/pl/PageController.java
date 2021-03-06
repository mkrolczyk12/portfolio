package io.github.mkrolczyk12.pl;

import io.github.mkrolczyk12.exceptionHandler.GeneralExceptionsProcessing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@GeneralExceptionsProcessing
@RequestMapping(path = "/pl")
public class PageController {
    private static final Logger logger = LoggerFactory.getLogger(PageController.class);

    @GetMapping(produces = MediaType.TEXT_HTML_VALUE)
    public String getPage() {
        logger.info("Got request for PL page version");
        return "index.html";
    }

    @GetMapping(path = "/**", produces = MediaType.TEXT_HTML_VALUE)
    public RedirectView redirectToPolishPage() {
        return new RedirectView("/pl");
    }
}
