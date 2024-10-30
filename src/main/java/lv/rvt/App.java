package lv.rvt;
import java.util.*;

public class App 
{
    public static void main(String[] args) {
        decreasingCounter counter = new decreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
} 