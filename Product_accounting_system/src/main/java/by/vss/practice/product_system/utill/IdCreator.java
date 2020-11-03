package by.vss.practice.product_system.utill;

public class IdCreator {
    private static long idCount;

    private IdCreator() {
    }

    public static long createId() {
        return ++idCount;
    }
}
