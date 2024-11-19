package lab3.task3;

public interface MyCollections<T> {
    boolean findElement(T element);
    boolean removeElement(T element);
    int size();
    void clear();
    MyCollections<T> union(MyCollections<T> collection);
    MyCollections<T> union(MyCollections<T> firstCollection, MyCollections<T> secondCollection);
    MyCollections<T> intersection(MyCollections<T> collection);
    MyCollections<T> intersection(MyCollections<T> firstCollection, MyCollections<T> secondCollection);
    MyCollections<T> difference(MyCollections<T> collection);
    MyCollections<T> difference(MyCollections<T> firstCollection, MyCollections<T> secondCollection);
    MyCollections<T> symmetricDifference(MyCollections<T> collection);
    MyCollections<T> symmetricDifference(MyCollections<T> firstCollection, MyCollections<T> secondCollection);

}
