package JavaCore.Seminars.Seminar_02.yandex_task_01.fromGPT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ConstantTimeSet {
    private final ArrayList<Integer> values;
    private final HashMap<Integer, Integer> indexMap;
    private final Random random;

    public ConstantTimeSet() {
        values = new ArrayList<>();
        indexMap = new HashMap<>();
        random = new Random();
    }

    public void add(int value) {
        if (!indexMap.containsKey(value)) {
            values.add(value);
            indexMap.put(value, values.size() - 1);
        }
    }

    public boolean contains(int value) {
        return indexMap.containsKey(value);
    }

    public void remove(int value) {
        if (indexMap.containsKey(value)) {
            int indexToRemove = indexMap.get(value);
            int lastValue = values.get(values.size() - 1);

            values.set(indexToRemove, lastValue);
            indexMap.put(lastValue, indexToRemove);

            values.remove(values.size() - 1);
            indexMap.remove(value);
        }
    }

    public int getRandomValue() {
        int randomIndex = random.nextInt(values.size());
        return values.get(randomIndex);
    }
}
