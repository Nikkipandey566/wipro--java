import java.io.FileInputStream;

public class execise4 {
    public static void main(String[] args) {
        try {
            FileInputStream a = new FileInputStream("WIPRO.txt");
            int i = a.read();
            System.out.println((char) i);
            a.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
