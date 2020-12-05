package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + "&& args(orderDto, userId) && target(object)")
    public void logUserID(OrderDto orderDto, Long userId, Object object) {
        LOGGER.info("Proceeding OrderDto: " + orderDto + ", Class: " + object.getClass().getName() + ", userId: " + userId );
    }

    @AfterReturning("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + "&& args(orderDto, userId) && target(object)")
    public void logUserIDReturning(OrderDto orderDto, Long userId, Object object) {
        LOGGER.info("Proceeding successfully OrderDto: " + orderDto + ", Class: " + object.getClass().getName() + ", userId: " + userId );
    }

    @AfterThrowing("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + "&& args(orderDto, userId) && target(object)")
    public void logUserIDThrowing(OrderDto orderDto, Long userId, Object object) {
        LOGGER.info("Proceeding error OrderDto: " + orderDto + ", Class: " + object.getClass().getName() + ", userId: " + userId );
    }

    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object timeMeasureProcessOrderMethod(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try{
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Proceeding time: " + (end - begin) + " [ms]");
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}
