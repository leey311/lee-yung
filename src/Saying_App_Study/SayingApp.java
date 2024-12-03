package Saying_App_Study;

import java.util.Scanner;

public class SayingApp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        SayingAppRun sayingAppRun = new SayingAppRun(scanner);
        System.out.println("== 명언 앱 ==");
        sayingAppRun.run();
    }
}