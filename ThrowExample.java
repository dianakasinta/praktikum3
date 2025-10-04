public class ThrowExample {
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Umur harus >= 18");
        }
        System.out.println("Akses diizinkan");
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
