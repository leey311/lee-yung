package My_Project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Lab2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");

        for (int i = 0; i<list.size(); i++){
            String data= list.get(i);
            String filename = "file" + (i+1) + ".txt";
            save(data, filename);
        }
    }

    private static void save(String data, String filename) {
        Path path = Paths.get(filename);
            try {
                Files.write(path, data.getBytes());
                System.out.println("저장 되었습니다.");
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}

