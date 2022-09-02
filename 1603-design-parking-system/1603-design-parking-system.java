class ParkingSystem {

    private int big;
    private int medium;
    private int small;
    private static Map<Integer, Integer> record = new HashMap<>();
    
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
        record.put(1, big);
        record.put(2, medium);
        record.put(3, small);
    }

    public boolean addCar(int carType) {

        if (carType == 1) {
            if (record.get(1) > 0) {
                record.put(1, record.get(1)-1);
                return true;
            }
        } else if (carType == 2) {
            if (record.get(2) > 0) {
                record.put(2, record.get(2)-1);
                return true;
            }
        } else if (carType == 3) {
            if (record.get(3) > 0) {
                record.put(3, record.get(3)-1);
                return true;
            }
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */