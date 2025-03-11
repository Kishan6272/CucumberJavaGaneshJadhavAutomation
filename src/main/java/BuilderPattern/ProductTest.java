package BuilderPattern;

public class ProductTest {

    public static void main(String[] args) {
      Product product= new Product.ProductBuilder("APple", 1000).build();
        System.out.println(product);


        Product product1=new Product.ProductBuilder("Samsund",500)
                .setCategory("Electronics")
                .setDescription("this is 17 inches mob")
                .setDiscount(10)
                .setFreeShipping(false)
                .setStock(50)
                .build();
        product1.setDiscount(5);


        System.out.println(product1);
    }
}
