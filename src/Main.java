import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        APP app = new APP();
        app.run();
        }
}
    class APP {
        public void run(){
            System.out.println("== 명언 앱 ==");

            Scanner scanner = new Scanner(System.in);

            System.out.print("명령)");
            String cdm = scanner.nextLine();

            System.out.println("입력된 명령어: %s".formatted(cdm));

            scanner.close();


    }
}