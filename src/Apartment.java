class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    boolean larger(Apartment otherApartment){
        if(this.squareMeters > otherApartment.squareMeters){
            return true;
        } else {
            return false;
        }
    }
}
