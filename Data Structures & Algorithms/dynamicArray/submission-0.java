class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.arr = new int[capacity];
            this.capacity = capacity;
            this.size = 0;
        } else {
            throw new IllegalArgumentException("Capacity must be greater than 0.");
        }
    }

    public int get(int i) {
        if (i >= 0 && i < size) {
            return arr[i];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
    }

    public void set(int i, int n) {
        if (i >= 0 && i < size) {
            arr[i] = n;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
    }

    public void pushback(int n) {
        if (size == capacity) {
            this.resize();
        }
        arr[size++] = n;
    }

    public int popback() {
        if (size > 0) {
            return arr[--size];
        } else {
            throw new IllegalStateException("Array is empty.");
        }
    }

    private void resize() {
        capacity = 2 * capacity;
        int[] newArr = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
