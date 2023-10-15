package JavaCore.HomeWork.HW_01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteClass {
    private String path;

    public WriteClass(String path) {
        this.path = path;
    }

    public void write(ArrayList<String> notes) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string: notes) {
            if (!stringBuilder.isEmpty()) stringBuilder.append("\n");
            stringBuilder.append(string);
        }

        try (FileWriter fw = new FileWriter(path, false)) {
            fw.append(stringBuilder);
            fw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
