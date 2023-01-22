import java.util.List;

public class Main {
    static CocheCRUD cocheCRUD= new CocheCRUDImpl2();
    public static void main(String[] args) {

        cocheCRUD.save(new Coche());
        cocheCRUD.findAll();
        cocheCRUD.delete(new Coche());



        };
    }
