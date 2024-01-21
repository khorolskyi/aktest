package homework7;


public class GenericModel<T> {
  public T data;
  public Pagination pagination;


  public GenericModel() {
  }

  public GenericModel(T data ) {
    this.data = data;
  }
}

