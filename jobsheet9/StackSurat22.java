public class StackSurat22 {
    Surat22[] stack;
    int top;
    int size;

    public StackSurat22(int size) {
        this.size = size;
        stack = new Surat22[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat22 s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
            System.out.println("Surat berhasil ditambahkan ke stack.");
        } else {
            System.out.println("Stack penuh, tidak bisa menambahkan surat.");
        }
    }

    public Surat22 pop() {
        if (!isEmpty()) {
            Surat22 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public Surat22 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Daftar surat yang ada di stack:");
            for (int i = top; i >= 0; i--) {
                stack[i].tampilkanSurat();
            }
        } else {
            System.out.println("Tidak ada surat dalam stack.");
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                stack[i].tampilkanSurat();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
