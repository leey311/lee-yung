package Study.Java.Bassic;

import java.util.Scanner;

public class LibraryService {
    LibraryBookMemoryRepository libraryBookMemoryRepository = new LibraryBookMemoryRepository();
    private Scanner scanner;

    LibraryService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void ShowList() {
        libraryBookMemoryRepository.show();
    }

    public void Regist() {
        LibraryBookRegister libraryBookRegister = ListUp();
        libraryBookMemoryRepository.Add(libraryBookRegister);
    }

    public void DeleteList() {
        libraryBookMemoryRepository.show();
        System.out.println("몇 번 도서를 삭제할까요?\n명령) ");

        int choose = scanner.nextInt();
        scanner.nextLine();
        libraryBookMemoryRepository.delete(choose);
    }

    private LibraryBookRegister ListUp() {
        System.out.print("책) ");
        String bookName = scanner.nextLine();

        System.out.print("작가) ");
        String writer = scanner.nextLine();

        return new LibraryBookRegister(bookName, writer);
    }
}
