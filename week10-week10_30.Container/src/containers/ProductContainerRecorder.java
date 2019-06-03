/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Administrator
 */
public class ProductContainerRecorder extends ProductContainer {

    private ContainerHistory history;

    public ProductContainerRecorder(String productName, double capacity, double initialCapacity) {
        super(productName, capacity);
        super.addToTheContainer(initialCapacity);
        history = new ContainerHistory();
        history.add(initialCapacity);
    }

    public String history() {
        return history.toString();
    }

    @Override
    public double takeFromTheContainer(double amount){
        history.add(super.getVolume() - amount);
        return super.takeFromTheContainer(amount);
    }

    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        history.add(super.getVolume());
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName() + "\n"
                + "History: " + this.history() + "\n"
                + "Greatest product amount: " + history.maxValue() + "\n"
                + "Smallest product amount: " + history.minValue() + "\n"
                + "Average: " + history.average() + "\n"
                + "Greatest change: " + history.greatestFluctuation() + "\n"
                + "Variance: " + history.variance());
    }

}
