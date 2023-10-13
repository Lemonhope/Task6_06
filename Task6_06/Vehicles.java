package Task6_06;

public enum Vehicles {
    CAR(11000),
    BICYCLE(6400),
    TRUCK(32990),
    BUS(29500),
    ELECTROCAR(30000);
    private int price;
    private String color;

    Vehicles(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return name() +": " +
                "\nprice: " + price +
                ", color: " + color;
    }
}
