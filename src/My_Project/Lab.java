package My_Project;

import java.util.ArrayList;
import java.util.Collections;

public class Lab {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listb = new ArrayList<>();
        int sum =0;

        String str = "((3 + 5) * 5 + -10) * 10 / 5";

        int a = str.indexOf("(");
        int b = str.indexOf(")");

        while(a>=0){
            lista.add(a);
            a = str.indexOf("(", a+1);
        }

        while(b>=0){
            listb.add(b);
            b = str.indexOf(")", b+1);
        }

        String result1 = str.substring(Collections.max(lista)+1, Collections.min(listb));

        result1 = result1.replace(" ", "");
        String[] sr = result1.split("");

        if(sr[1].equals("+")){
            sum = Integer.parseInt(sr[0]) + Integer.parseInt(sr[2]);
        }else if(sr[1].equals("*")){
            sum = Integer.parseInt(sr[0]) * Integer.parseInt(sr[2]);
        }else if(sr[1].equals("-")){
            sum = Integer.parseInt(sr[0]) - Integer.parseInt(sr[2]);
        }else if(sr[1].equals("/")){
            sum = Integer.parseInt(sr[0]) / Integer.parseInt(sr[2]);
        }

        listb.removeFirst();
        lista.removeLast();

        System.out.println(sum);
    }
}