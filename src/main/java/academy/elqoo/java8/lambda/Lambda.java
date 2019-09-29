package academy.elqoo.java8.lambda;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Lambda {

    public static List<String> filter(List<String> strings, Predicate<String> condition){
        return strings.stream().filter(condition).collect(Collectors.toList());
    }

    public static void processWithinTransaction(TransactionLambda tl, Consumer<TransactionLambda> transactionLambdaConsumer){
        Transaction transaction = new Transaction();
        transaction.start();
        transaction.stop();
        transactionLambdaConsumer.accept(tl);
    }

    public static String create(Supplier<String> fu){
        return fu.get();
    }

    public static Integer getStringLength(String s, Function<String, Integer> calc){
        return calc.apply(s);
    }

    public static int multiply(int a, int b, BiFunction<Integer, Integer, Integer> calc){
        return calc.apply(a, b);
    }

    public static List<String> sortStrings(List<String> strings, Comparator<String> c){
          Collections.sort(strings, c);
        return strings;
    }

    public static Consumer<TransactionLambda> consumer = (t) -> t.run();

    public static Supplier<String> stringCreator = () -> "AnyString";
    public static Function<String, Integer> stringLength = String::length;
    public static BiFunction<Integer, Integer, Integer> numMulti = (a,b) -> a*b;
    public static Comparator<String> comp = String::compareTo;
}
