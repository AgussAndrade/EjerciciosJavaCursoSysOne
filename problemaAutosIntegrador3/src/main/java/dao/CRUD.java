package dao;

public interface CRUD<T> {
    public void insert(T object);
    public void update(T object);
    public void delete(Integer id);
    public T queryId(Integer id);
}
