package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int TabSize = 12;
    public static final int MinusOne = -1;
    public static final int NumberEleven = 11;
    private final int[] numbers = new int[TabSize];

    public int EMPTY = MinusOne;

    public void countIn(int in) {
        if (!isFull())
            numbers[++EMPTY] = in;
    }

    public boolean callCheck() {
        return EMPTY == MinusOne;
    }

    public boolean isFull() {
        return EMPTY == NumberEleven;
    }

    protected int peekaboo() {
        if (callCheck())
            return MinusOne;
        return numbers[EMPTY];
    }

    public int countOut() {
        if (callCheck())
            return MinusOne;
        return numbers[EMPTY--];
    }

}
