package Study.Java.Bassic;

import java.util.ArrayList;

public class  LibraryBookMemoryRepository implements LibraryBookRepository{
    ArrayList<LibraryBookRegister> list = new ArrayList<>();

    public void Add(LibraryBookRegister libraryBookRegister) {
        list.add(libraryBookRegister);
    }

    public void show() {
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
    }

    public void delete(int del) {
        if(del<= list.size()) {
            list.remove(del);
            System.out.println(del + "번 도서가 삭제되었습니다.");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }else{System.out.println(del + "번 도서는 존재하지 않습니다.");}
    }
}