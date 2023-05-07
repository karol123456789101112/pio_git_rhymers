package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MinusOne = -1;
    public static final int NumberEleven = 11;
    public static final int TabSize = 12;
    private final int[] numbers = new int[TabSize];

    public int total = MinusOne;
    @Override
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == MinusOne;
    }
    public boolean isFull() {
        return total == NumberEleven;
    }

    protected int peekaboo() {
        if (callCheck())
            return MinusOne;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return MinusOne;
        return numbers[total--];
    }

}
