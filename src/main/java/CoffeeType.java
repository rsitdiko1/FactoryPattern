public enum CoffeeType {

    AMERICANO("1"),
    CAPPUCCINO("2"),
    ESPRESSO("3");

    public final String point;

    CoffeeType(String point) {
        this.point = point;
    }

    public static CoffeeType valueOfPoint(String point) {
        for (CoffeeType type : values()) {
            if (type.point.equals(point)) {
                return type;
            }
        }
        return null;
    }
}
