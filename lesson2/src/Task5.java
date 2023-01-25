import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task5 {
    static Logger logger = Logger.getAnonymousLogger();
    public static void main(String[] args) {
        File directory = new File("./");
        ArrayList<String> allFiles = checkDirectory(directory, new ArrayList<>(), 0);
        listToFile(allFiles);

    }
    static ArrayList<String> checkDirectory (File directory, ArrayList<String> allFiles, int howManyRecursion) {
        File[] itemsInFolder = directory.listFiles();
        StringBuilder tab = new StringBuilder();
        tab.append("\t".repeat(howManyRecursion));
        try {
            assert itemsInFolder != null;
            for (File item : itemsInFolder) {
                if (item.isDirectory()) {
                    allFiles.add(String.format("%s%s", tab, item.getName()));
                    checkDirectory(item, allFiles, howManyRecursion + 1);
                } else {
                    allFiles.add(String.format("%s%s", tab, item.getName()));
                }
            }
        } catch (Exception e) {
            logger.log(Level.WARNING, "Exception", e);
        }
        return allFiles;
    }
    static void listToFile (ArrayList<String> list){
        try (FileWriter fw = new FileWriter("scanDirectory.txt")) {
            for (String item: list) {
                fw.write(item);
                fw.write("\n");
            }
        } catch (Exception e) {
            logger.log(Level.WARNING, "Exception", e);
        } finally {
            logger.info("File was written");
        }
    }
}
