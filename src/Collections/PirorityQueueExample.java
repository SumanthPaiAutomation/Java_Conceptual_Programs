package Collections;

import java.util.PriorityQueue;

class PirorityQueueExample implements Comparable<PirorityQueueExample> {
    String customerName;
    int orderTime;
    int cookingTime;
    int waitTime; // Calculated dynamically

    public PirorityQueueExample(String customerName, int orderTime, int cookingTime) {
        this.customerName = customerName;
        this.orderTime = orderTime;
        this.cookingTime = cookingTime;
        updateWaitTime(); // Calculate wait time upon creation
    }

    private void updateWaitTime() {
        this.waitTime = (int) (cookingTime + (System.currentTimeMillis() - orderTime) / 1000); // Convert time to seconds for simplicity
    }

    @Override
    public int compareTo(PirorityQueueExample other) {
        return this.waitTime - other.waitTime; // Order with lower wait time comes first
    }
}

class Restaurant {
    private PriorityQueue<PirorityQueueExample> orderQueue = new PriorityQueue<>();

    public void addOrder(String customerName, int orderTime, int cookingTime) {
        orderQueue.add(new PirorityQueueExample(customerName, orderTime, cookingTime));
    }

    public PirorityQueueExample getNextOrder() {
        if (orderQueue.isEmpty()) {
            return null;
        }
        return orderQueue.poll(); // Returns the order with the shortest wait time
    }
}