public class Product {
    private int productId;
    private String productName;
    private int discount;
    private String type;
    private double price;
    Product(){
        this(0,"Unknown",0, "Unknown" ,0.0);
    }
    Product(int productId){
        this(productId,"Unknown",0,"Unknown",0.0);
    }
    Product(int productId , String productName){
        this(productId, productName , 0 ,"Unknown" , 0.0);
    }
    Product(int productId , String productName , int discount ){
        this(productId, productName , discount ,"Unknown" , 0.0);
    }
    Product(int productId , String productName , int discount , String type ){
        this(productId, productName , discount , type , 0.0);
    }
    Product(int productId , String productName , int discount , String type , double price){
        this.productId = productId;
        this.productName = productName;
        this.discount = discount;
        this.type = type;
        this.price = price;
    }
    public int getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
     public int getDiscount(){
        return discount;
    }
     public String getProductType(){
        return type;
    }
     public double getProductPrice(){
        return price;
    }
}
