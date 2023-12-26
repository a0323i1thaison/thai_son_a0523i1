package testFinal.reponsitory;

import java.util.List;

public interface IRepository <E>{
    void add (E e );
    List<E> display();
    void edit (E e );
}
