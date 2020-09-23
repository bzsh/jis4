package by.vss.task.math_operation.util;

import by.vss.task.math_operation.operation.MathOperations;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OperationExecutor {
    public static final Logger LOGGER = LogManager.getLogger(OperationExecutor.class);

    private OperationExecutor(){}

    public static void execute(MathOperations[] operations, double a, double b) {
        for (var operation : operations) {
            LOGGER.info("Operation {}, {}", operation.getClass(), operation.compute(a, b));
        }
    }
}
