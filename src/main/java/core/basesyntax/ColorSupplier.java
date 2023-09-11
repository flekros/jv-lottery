package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
public final Random random = new Random();
    public Colors getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        return Colors.values()[index];
    }
}
