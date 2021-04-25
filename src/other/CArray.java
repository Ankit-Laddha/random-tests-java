package other;

public class CArray {
    int length;
    int[] items;
    int count = 0;

    public CArray(int length) {
        this.length = length;
        this.items = new int[this.length];
    }

    void insert(int item) {
        if (count == items.length) {
            int[] newItems = new int[2 * (count + 1)];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    int max() {
        int max = items[0];
        for (int i = 1; i < count; i++) {
            if (max < items[i])
                max = items[i];
        }
        return max;
    }

    void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException("invalid index");

        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }

    int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item)
                return i;
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println("item = " + items[i]);
    }
}
