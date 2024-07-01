import java.io.FileOutputStream;

public class exercise {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("WIPRO.txt");
            fout.write(65);
            fout.close();
            System.out.print("success...");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
