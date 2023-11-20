package Study.JDK.Seminars.Seminar_01.ReadAndWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    private final String path;

    public ReadFile(String path) {
        this.path = path;
    }

    public ArrayList<String> read(ArrayList<String> storyDialogs) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        while (scanner.hasNextLine()) {
            storyDialogs.add(scanner.nextLine());
        }
        scanner.close();
        return storyDialogs;
    }
}
