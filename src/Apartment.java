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
        return this.squareMeters > otherApartment.squareMeters;
    }

    int priceDifference(Apartment otherApartment){
        int dif = (otherApartment.squareMeters * otherApartment.pricePerSquareMeter) - (this.squareMeters * this.pricePerSquareMeter);
        if(dif < 0){
            dif = dif * (-1);
        }
        return dif;
    }
}
