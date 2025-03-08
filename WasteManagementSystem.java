public class WasteManagementSystem {
    public static void main(String[] args) {
        WasteCollectionChain wasteCollection = new WasteCollectionChain();
        
        WasteContainer organicContainer = new WasteContainer("Organic", 20);
        WasteContainer recyclableContainer = new WasteContainer("Recyclable", 25);
        WasteContainer hazardousContainer = new WasteContainer("Hazardous", 10);
        
        wasteCollection.collect(organicContainer);
        wasteCollection.collect(recyclableContainer);
        wasteCollection.collect(hazardousContainer);
    }
}
