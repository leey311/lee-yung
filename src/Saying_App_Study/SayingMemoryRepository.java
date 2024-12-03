package Saying_App_Study;

import java.util.LinkedHashMap;

public class SayingMemoryRepository implements  SayingRepository{
    int id = 0;
    private final LinkedHashMap<Integer,Saying> map = new LinkedHashMap<>();


    public void Add(Saying saying) {
        id++;
        map.put(id, saying);
    }

    public void Modify(int id, Saying saying){
        if (map.containsKey(id)){
            map.put(id, saying);
        }else{
            System.out.println(id + "번 명언은 존재하지 않습니다.");
        }
    }

    public void Show(){
        if (map.isEmpty()){
            System.out.println("명언이 존재하지 않습니다.");
        }else {
            for (; id>0; id--) {
                System.out.println(id + " / " + map.get(id));
            }
        }
    }

    public void Delete(int choose){
        if(map.containsKey(choose)){
            map.remove(choose);
        }else {
            System.out.println(choose + "번 명언은 존재하지 않습니다.");
        }
    }
}


