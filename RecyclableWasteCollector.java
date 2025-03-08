class RecyclableWasteCollector implements CollectionChain {
    private CollectionChain chain;

    @Override
    public void setNextChain(CollectionChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Recyclable")) {
            System.out.println("Collecting Recyclable Waste... " + "\nDisposed " + container.getCapacity() + "kg waste");
        } else {
            this.chain.collect(container);
        }
    }
}