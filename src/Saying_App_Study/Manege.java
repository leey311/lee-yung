package Saying_App_Study;

import java.util.Scanner;

public class Manege {
    private final Scanner scanner;
    SayingMemoryRepository sayingMemoryRepository = new SayingMemoryRepository();
    SayingFileRepository sayingFileRepository = new SayingFileRepository();

    Manege(Scanner scanner) {
        this.scanner = scanner;
    }

    public void registerSaying() {
        Saying saying = writeSaying();
        sayingMemoryRepository.Add(saying);
        sayingFileRepository.Add(saying);
        System.out.println(sayingMemoryRepository.id + " 번 명언이 등록되었습니다.");
    }

    public void listSaying() {
        sayingMemoryRepository.Show();
    }

    public void deleteSaying() {
        System.out.print("몇 번 명언을 삭제 하시겠습니까?");
        int choose = scanner.nextInt();
        scanner.nextLine();
        sayingMemoryRepository.Delete(choose);
        sayingFileRepository.Delete(choose);
    }

    public void modifySaying(){
        System.out.print("몇 번 명언을 수정 하시겠습니까?");
        int choose = scanner.nextInt();
        scanner.nextLine();

        System.out.print("명언) ");
        String a = scanner.nextLine();

        System.out.print("작가) ");
        String b = scanner.nextLine();

        Saying saying = new Saying(a,b);
        sayingMemoryRepository.Modify(choose, saying);
    }

    private Saying writeSaying() {
        System.out.print("명언) ");
        String saying = scanner.nextLine();

        System.out.print("작가) ");
        String author = scanner.nextLine();

        return new Saying(saying, author);
    }

}
