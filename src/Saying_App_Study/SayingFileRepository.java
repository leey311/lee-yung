package Saying_App_Study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class SayingFileRepository implements SayingRepository {
    int id = 0;
    private final LinkedHashMap<Integer,Saying> map = new LinkedHashMap<>();


    public void Add(Saying saying) {
        id++;
        map.put(id, saying);
        save(map, "data.txt");
    }

    public void Modify(int id, Saying saying){
        if (map.containsKey(id)){
            map.put(id, saying);
        }else{
            System.out.println(id + "번 명언은 존재하지 않습니다.");
        }
    }

    public void Show(){
    }

    public void Delete(int choose){
        save(map, "data.txt");
    }

    private void save(LinkedHashMap<Integer,Saying> map, String data){
        try(PrintWriter writer = new PrintWriter(new File(data))) {
            for (Map.Entry<Integer, Saying> entry : map.entrySet()) {
                writer.println(entry.getKey() + " : " + entry.getValue());
            }
        }catch(FileNotFoundException e){
                System.out.println("파일을 찾을 수 없습니다." + e.getMessage());
            }
        }
}


