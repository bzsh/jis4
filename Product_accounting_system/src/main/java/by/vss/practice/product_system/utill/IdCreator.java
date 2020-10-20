package by.vss.practice.product_system.utill;

public class IdCreator {
    private static long idCount;

    public static long createId() {
        return ++idCount;
    }
}
