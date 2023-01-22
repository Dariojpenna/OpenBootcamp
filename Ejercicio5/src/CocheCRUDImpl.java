import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{


    @Override
    public void save(Coche coche) {
        System.out.println("Esta es la aplicacion para salvar un coche");

    }

    @Override
    public List<Coche> findAll() {
        System.out.println("esta es la aplicacion para encontrar todos los coche");

        return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("esta es la aplicacion para borrar un coche");


    }
}
