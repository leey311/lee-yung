package Saying_App_Study;

public interface SayingRepository {

    void Add(Saying saying);

    void Modify(int id, Saying saying);

    void Show();

    void Delete(int choose);
}


