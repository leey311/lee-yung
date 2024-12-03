package Saying_App_Study;

import java.util.Scanner;

public class SayingAppRun {
    private final Scanner scanner;
    SayingAppRun(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        Manege manege = new Manege(scanner);

        while (true) {
            System.out.print("1. 등록 ㅣ 2. 목록 ㅣ 3. 삭제 ㅣ 4. 수정 ㅣ 5. 종료 \n명령) ");
            String order = scanner.nextLine();

            if (order.equals("등록") || order.equals("1")) {
                manege.registerSaying();
            } else if (order.equals("목록") || order.equals("2")) {
                manege.listSaying();
            } else if (order.equals("삭제") || order.equals("3")) {
                manege.deleteSaying();
            } else if (order.equals("수정") || order.equals("4")) {
                manege.modifySaying();
            } else {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
        }
    }
}
