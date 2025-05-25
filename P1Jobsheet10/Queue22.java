public class Queue22 {

    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue22(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (true) {
                System.out.print(data[i] + " ");
                if (i == rear)
                    break;
                i = (i + 1) % max;
            }
            System.out.println("\nJumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int dt) {
        if (isFull()) {
            System.err.println("Maaf, Queue sudah penuh!!!!");
            System.exit(1);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int Dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.err.println("Maaf Queue Masih kosong!!!");
            System.exit(1);
        } else {
            dt = data[front];
            size--;
            if (size == 0) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }
        return dt;
    }
}
