package Study.Java.Bassic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LibraryBookFileRepository implements LibraryBookRepository{
    private final ArrayList<LibraryBookRegister> list = new ArrayList<>();
    int i = 0;

    public void Add(LibraryBookRegister libraryBookRegister) {
        list.add(libraryBookRegister);
        writeListToFile(list, "book");
    }

    public void show() {
    }

    public void delete(int del) {
        if(del<= list.size()) {
            list.remove(del);
        }
    }

    void writeListToFile(ArrayList<LibraryBookRegister> list, String book) {
        Path path = Path.of(book);
        List<String> lines = new ArrayList<>();
        for(LibraryBookRegister register : list){
            lines.add(register.toString());
        }
        try {
            Files.write(path, lines);
            System.out.println("성공적으로 저장 되었습니다.");
        } catch (IOException e) {
            System.out.println("오류가 발생하였습니다" + e.getMessage());
        }
    }
}




