public class OriginalAdapter implements ClientOriginal {
    Original original;

    OriginalAdapter(Original original) {
        this.original = original;
    }

    public void ClientDouble(double value) {
        original.OriginalDouble(value);
    }

    public void ClientInt(int value) {
        original.OriginalInt(2 * value);
    }

    public void ClientChar(char value) {
        for (int i = 0; i < 5; i++) {
            original.OriginalChar(value);
        }
    }
}
