public class ProductDal implements IEntityRepository<Product> {

  @Override
  public void add(Product entity) {
    System.out.println("Ekleme Yapıldı...");
  }

  @Override
  public void delete(Product entity) {
    System.out.println("Silme Yapıldı...");
  }

  @Override
  public void update(Product entity) {
    System.out.println("Güncelleme Yapıldı...");
  }
}
