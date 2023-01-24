import java.io.FileWriter;

public class Task4 {
    public static void main(String[] args) {
        StringBuilder answer = new StringBuilder();
        try (FileWriter fw = new FileWriter("test.txt")){
            for (int i = 0; i < 100; i++) {
                fw.write("TEST ");
                if (i % 10 == 9) {
                    fw.write("\n");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
