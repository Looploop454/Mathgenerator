import org.junit.jupiter.api.Test;

import java.util.function.*;

public class FunctionTest {
    
    public void test1() {
        Function<Integer, String> fn = (Integer i) -> {
            return i % 2 == 0 ? "white" : "lightgrey";
        };
        System.out.println(useFun(fn,5));
    }

    private String useFun(Function<Integer, String> fn, int num) {
        return fn.apply(num);
    }
}
