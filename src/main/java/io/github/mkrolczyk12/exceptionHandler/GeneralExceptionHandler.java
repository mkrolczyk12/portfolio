package io.github.mkrolczyk12.exceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(annotations = GeneralExceptionsProcessing.class)
@Order(1)
@Controller
public final class GeneralExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GeneralExceptionHandler.class);

    @ExceptionHandler(IllegalArgumentException.class)
    public final String handleIllegalArgumentException(IllegalArgumentException exception) {
        logger.warn(exception.getMessage());
        return "errorPages/error.html";
    }
}
