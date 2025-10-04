import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
    static void readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        String line = br.readLine();
        System.out.println("Isi file: " + line);
        br.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
    }
}
