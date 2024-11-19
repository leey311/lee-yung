package Study.Java.Bassic;

public class Day2 {
    /*//no.1: 1부터 시작하여 누적하여 더하다 합계가 10보다 큰 처음 값은?
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        for (; sum<=10;){
            i++;
            sum += i;
        }
        System.out.println(sum);
        System.out.println(i);
    }*/
    /*//no.2: 중첩 for문을 사용해 구구단을 완성하라.
    public static void main(String[] args) {
        for(int i = 2; i<10; i++){
            for(int j = 1; j<10; j++){
                System.out.println( i + "*" + j + "=" + i*j);
            }
        }
    }*/
    /*//no.3: int low를 선언하고 low 수만큼 피라미드를 만들어라.
    public static void main(String[] args) {
        int low = 5;
        for (int i = 1; i<= low; i++){
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }*/
    /*public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("문자를 입력하세요:");
        String str = a.nextLine();
        System.out.println("입력한 문자:" + str);

        System.out.print("정수를 입력하세요:");
        int intValue = a.nextInt();
        System.out.println("입력한 정수:" + intValue);

    }*/
    /*//no.4 Scanner를 활용해 두 수의 합을 출력하는 코드
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);


        System.out.print("첫 번째 값을 입력하세요:");
        double q = a.nextDouble();

        System.out.print("두 번째 값을 입력하세요:");
        double w = a.nextDouble();

        System.out.println("두 값의 합:" + (q+w));


    }*/
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 값을 입력하세요:");
        double a = scanner.nextDouble();

        System.out.print("두 번째 값을 입력하세요:");
        double b = scanner.nextDouble();

        double c = (a>b) ? a:b;
        System.out.println("둘 중 큰 값:" + c);
        }*/
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("문자를 입력하시오:");
            String a = scanner.nextLine();
            if (a.equals ("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }System.out.println("입력한 문자:" + a);


        }

    }*/
    public static void main(String[] args) {
        int[] a = new int[3];

    }
}
