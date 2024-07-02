import java.io.File;

public class execise7 {
    public static void main(String[] ags) {
        File my_file_dir = new File("WIPRO.txt");
        if (my_file_dir.canWrite()) {
            System.out.println(my_file_dir.getAbsolutePath() + "can write. \n");
        } else {
            System.out.println(my_file_dir.getAbsolutePath() + "notcan write. \n");
        }
        if (my_file_dir.canRead()) {
            System.out.println(my_file_dir.getAbsolutePath() + "can read. \n");

        } else {
            System.out.println(my_file_dir.getAbsolutePath() + "notcan read. \n");

        }
    }

}
