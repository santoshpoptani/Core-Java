package Java8.FunctionalInterface;

import java.util.ArrayList;

public class Operation implements MyFunction {

    @Override
    public int apply(int i ) {
        return i*i;
    }
}
