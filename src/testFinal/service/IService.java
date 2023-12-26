package testFinal.service;

import java.util.List;

public interface IService<E> {
    List<E> display();
    void add ( E e );
    void edit (E e);
}
