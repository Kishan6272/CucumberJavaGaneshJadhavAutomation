package BuilderPattern;

public class Product {

    //Mandatory fields
    private String name;
    private double price;

    //non mandatory fields
    private String description;
    private String category;
    private double discount;
    private boolean freeShipping;
    private int stock;




    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description;
        this.category = builder.category;
        this.stock = builder.stock;
        this.freeShipping = builder.freeShipping;
        this.discount = builder.discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(boolean freeShipping) {
        this.freeShipping = freeShipping;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", discount=" + discount +
                ", freeShipping=" + freeShipping +
                ", stock=" + stock +
                '}';
    }



    public static class ProductBuilder{

        private String name;
        private double price;

//non mandatory fields
        private String description;
        private String category;
        private double discount;
        private boolean freeShipping;
        private int stock;


       public  ProductBuilder(String name, double price) {
            this.name = name;
            this.price = price;
        }



        public ProductBuilder setStock(int stock) {
            this.stock = stock;
            return this;

        }


        public ProductBuilder setFreeShipping(boolean freeShipping) {
            this.freeShipping = freeShipping;
            return this;
        }



        public ProductBuilder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }



        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder setCategory(String category) {
            this.category = category;
            return this;
        }

        public  Product build()
        {
            return new Product(this);
        }



    }







}
