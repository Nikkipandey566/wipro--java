import java.io.FileOutputStream;

public class exercise1 {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("WIPRO.txt");
            String s = "Welcome to javaTpont.";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
