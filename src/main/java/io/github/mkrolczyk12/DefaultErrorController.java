package io.github.mkrolczyk12;

import io.github.mkrolczyk12.exceptionHandler.GeneralExceptionsProcessing;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
@GeneralExceptionsProcessing
public class DefaultErrorController implements ErrorController {

    @RequestMapping("/error")
    @GetMapping(produces = MediaType.TEXT_HTML_VALUE)
    public String handleError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        if (status != null) {
            Integer statusCode = Integer.valueOf(status.toString());
            if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                return "errorPages/error-500.html";
            }
            else if(statusCode == HttpStatus.NOT_FOUND.value()) {
                return "errorPages/error-404.html";
            }
            else return "errorPages/error.html";
        }
        return "errorPages/error-404.html";
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}
