package by.vss.practice.product_system;

import by.vss.practice.product_system.ui.ConsoleUI;

public class App {
    public static void main(String[] args) {
        ConsoleUI ui = new ConsoleUI();
        ui.mainMenu();

/*
        Runnable runnable = () -> System.out.println("If i be a thread, i`ll print this string into console !");
        new Thread(runnable).start();


        Supplier<String> supplier = () -> "I`m Supplier, I supply a string like this using get() method) !";
        System.out.println(supplier.get());


        Consumer<String> consumer = System.out::println;
        consumer.accept("Consumer consumes a string and print her into console !");


        Function<Integer, String> function = a -> "I increment input argument and create this string with result =  " + ++a;
        System.out.println(function.apply(100));


        BiFunction<Integer, Integer, String> biFunction = (a, b) -> "I am a function like above, but with 2 args " + (a + b);
        System.out.println(biFunction.apply(12, 18));


        UnaryOperator<Integer> unaryOperator = a -> ++a * ++a;
        System.out.println("Im unaryOperator, I have one argument and return value same type like argument, the result is " + unaryOperator.apply(9));


        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println("Im binaryOperator, I have two arguments with the same types and return value same type like arguments, the result is " + binaryOperator.apply(9, 9));


        Predicate<Integer> predicate = a -> a != 0;
        System.out.println("Predicate method test returns boolean value, predicate heeded to check some condition the result is " + predicate.test(5));


        // Stream

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream;

        list.stream()
                .filter(a -> a > 2 && a < 5)
                .map(a -> 1)
                .forEach(System.out::print);

        IntStream.iterate(5, a -> a < 100, a -> a + 1).forEach(System.out::print);*/
    }
}
