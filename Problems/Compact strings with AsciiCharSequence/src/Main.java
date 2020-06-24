import java.util.Arrays;

interface I {
    void m();
}

class AsciiCharSequence implements CharSequence/* extends/implements */ {

    byte[] sequence;

    AsciiCharSequence(byte[] array) {
        this.sequence = array;
    }

    @Override
    public int length() {
        return sequence.length;
    }

    @Override
    public char charAt(int index) {
        return (char)sequence[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(sequence, start, end));
    }

    public String toString() {
        return new String(sequence);
    }
}