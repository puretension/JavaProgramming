abstract class Apartment {
    public int squareFootage;
    public int numberOfBedrooms;

    abstract void setSquareFootage(int sqft);
}

class PenthouseSuite extends Apartment {
    public PenthouseSuite() {
        this.numberOfBedrooms = 4;
        
    }
    
    public void numberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
}

class Studio extends Apartment {
    public Studio() {
        this.numberOfBedrooms = 0;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
}

class UnitUpgrader {
    public void upgrade(Apartment apartment) {
        apartment.squareFootage += 40;

        if (apartment.getClass() != Studio.class)
            apartment.numberOfBedrooms += 1;
    }
}
public class FinalEx1 {
    public static void main(String[] args) {
        Apartment penthouse = new PenthouseSuite();
        penthouse.setSquareFootage(1500);

        Apartment studio = new Studio();
        studio.setSquareFootage(550);

        System.out.println("Before Upgrade:");
        printApartmentInfo(penthouse);
        printApartmentInfo(studio);

        UnitUpgrader upgrader = new UnitUpgrader();
        upgrader.upgrade(penthouse);
        upgrader.upgrade(studio);

        System.out.println("\nAfter Upgrade:");
        printApartmentInfo(penthouse);
        printApartmentInfo(studio);
    }

    public static void printApartmentInfo(Apartment apartment) {
        System.out.println("Square Footage: " + apartment.squareFootage + ", Number of Bedrooms: " + apartment.numberOfBedrooms );
    }
}