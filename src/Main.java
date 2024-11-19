import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    class APP { //APP라는 붕어빵 틀을 만듦
        public void run(){ //run()이라는 나만의 함수를 생성하고 {}안의 식을 실행시킴
            System.out.println("== 명언 앱 ==");
            Scanner scanner = new Scanner(System.in);

            int i = 0;

            while(true) {
                i++;
                System.out.print("명령) ");
                String 명령 = scanner.nextLine();
                if (!명령.equals("등록")){
                    break;
                }

                System.out.print("명언을 입력하세요: ");
                String cdm = scanner.nextLine();

                if (cdm.equals("종료")) {
                    break;
                }

                System.out.print("작가를 입력하세요: ");
                String cdm2 = scanner.nextLine();

                if (cdm2.equals("종료")){
                    break;
                }

                System.out.println("명언: %s".formatted(cdm));
                System.out.println("작가: %s".formatted(cdm2));
                System.out.println(i + "번 명언이 등록되었습니다");

            }
            System.out.println("---------------------");
            scanner.close();
        }
    }

public class Main { //Main 파일의 메인 클래스로 이 파일에서는 이 클래스만 실행됨
    public static void main(String[] args) {
        APP app = new APP(); //new APP()를 통해 app이라는 변수가 APP의 주소를 받음
        app.run(); //app를 통해 APP클래스의 run()이라는 함수를 불러옴
    }
}