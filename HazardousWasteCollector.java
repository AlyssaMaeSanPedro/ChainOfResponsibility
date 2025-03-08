class HazardousWasteCollector implements CollectionChain {
    private CollectionChain chain;

    @Override
    public void setNextChain(CollectionChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Hazardous")) {
            System.out.println("Collecting Hazardous Waste... " + "\nDisposed " + container.getCapacity() + "kg waste");
        } else {
            this.chain.collect(container);
        }
    }
}