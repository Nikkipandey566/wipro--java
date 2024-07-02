import java.io.File;
import java.util.Date;

public class execise6 {
    public static void main(String[] args) {
        File file = new File("c\\WIPRO.txt");
        Date date = new Date(file.lastModified());
        System.out.println("\n the file was last modified on " + date + "\n");
    }

}
