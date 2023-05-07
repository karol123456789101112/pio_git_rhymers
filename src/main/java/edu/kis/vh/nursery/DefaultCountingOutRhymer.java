package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int TabSize = 12;
    public static final int MinusOne = -1;
    public static final int NumEleven = 11;
    private int[] numbers = new int[TabSize];

    public int Empty = MinusOne;

    public void countIn(int in) {
        if (!isFull())
            numbers[++Empty] = in;
    }

    public boolean callCheck() {
        return Empty == MinusOne;
    }

    public boolean isFull() {
        return Empty == NumEleven;
    }

    protected int peekaboo() {
        if (callCheck())
            return MinusOne;
        return numbers[Empty];
    }

    public int countOut() {
        if (callCheck())
            return MinusOne;
        return numbers[Empty--];
    }

}
