import java.util.List;

public class CocheCRUDImpl2 implements CocheCRUD{
    @Override
    public void save(Coche coche) {
        System.out.println("otra app para salvar Coches");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("otra app para encontrar Coches");
        return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("otra app para borrar Coches");
    }


}
