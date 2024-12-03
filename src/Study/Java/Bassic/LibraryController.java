package Study.Java.Bassic;

import java.util.Scanner;

public class LibraryController {
    private final Scanner scanner = new Scanner(System.in);
    private final LibraryService libraryService = new LibraryService(scanner);

    void Run() {
        while (true) {
            System.out.println("1. 등록 ㅣ 2. 목록 ㅣ 3. 삭제 ㅣ 4. 종료\n명령) ");

            int choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1:
                    libraryService.Regist();
                    break;
                case 2:
                    libraryService.ShowList();
                    break;
                case 3:
                    libraryService.DeleteList();
                    break;
                default:
                    return;
            }
        }
    }
}
