import java.io.File;

public class execise2 {
    public static void main(String[] args) {
        File file = new File("C:\\");
        String[] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);
        }

    }

}
