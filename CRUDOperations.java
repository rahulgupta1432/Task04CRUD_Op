package Task05CRUD_Operation;

interface CRUDOperations {

    void create(Object data);

    Object read(int id);

    void update(int id, Object data);

    void delete(int id);

}