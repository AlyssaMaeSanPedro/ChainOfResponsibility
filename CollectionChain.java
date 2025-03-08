public interface CollectionChain {
    void setNextChain(CollectionChain nextChain);
    void collect(WasteContainer container);
}
