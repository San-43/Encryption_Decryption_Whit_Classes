import java.util.*;

class AsciiCharSequence implements CharSequence {
    byte[] a;

    public AsciiCharSequence(byte[] a) {
        this.a = a.clone();
    }

    @Override
    public int length() {
        return a.length;
    }

    @Override
    public char charAt(int idx) {
        return (char) a[idx];
    }

    @Override
    public CharSequence subSequence(int from, int to) {
        return new AsciiCharSequence(Arrays.copyOfRange(a, from, to));
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < a.length; i++) {
            result.append(charAt(i));
        }

        return result.toString();
    }
}