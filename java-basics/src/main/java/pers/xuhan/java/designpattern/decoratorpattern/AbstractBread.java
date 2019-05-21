package pers.xuhan.java.designpattern.decoratorpattern;

public abstract class AbstractBread implements IBread {

    private final IBread bread;
    
    public AbstractBread(IBread bread) {
        super();
        this.bread = bread;
    }
    @Override
    public void prepair() {
        this.bread.prepair();
    }
    @Override
    public void kneadFlour() {
        this.bread.kneadFlour();
    }
    @Override
    public void steamed() {
        this.bread.steamed();
    }

    @Override
    public void process() {
        prepair();
        kneadFlour();
        steamed();
    }

}