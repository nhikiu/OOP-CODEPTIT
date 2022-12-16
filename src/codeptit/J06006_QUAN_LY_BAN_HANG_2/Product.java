package codeptit.J06006_QUAN_LY_BAN_HANG_2;

public class Product {
    private String id;
    private String name;
    private String unit;
    private int buyPrice;
    private int salePrice;

    public Product(int id, String name, String unit, int buyPrice, int salePrice) {
        this.id = String.format("MH%03d", id);
        this.name = name;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.salePrice = salePrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }
}