package ad211.dolgih;

public class Cart {

    private Item[] stack;
    private int CurrentItemNumber;


    public Cart(int capacity) {
        stack = new Item[capacity];
        CurrentItemNumber = 0;
    }

    public Item[] getStack() {
        return stack;
    }
    public int getCurrentItemNumber() {
        return CurrentItemNumber;
    }

    public void addItem(Item item) {
        if(ifStackFull()){
            return;
        }
        stack[CurrentItemNumber] = item;
        CurrentItemNumber++;
    }

    public void removeItem() {
        if(ifStackEmpty()) {
            return;
        }
        stack[CurrentItemNumber - 1] = null;
        CurrentItemNumber--;
    }

    public float sum () {
        float sum = 0;
        for(Item item : stack) {
            sum += item.getCost();
        }
        return sum;
    }

    public void increase (float percent) {
        for(Item item : stack) {
            item.increaseCost(percent);
        }
    }

    public void decrease (float percent) {
        for(Item item : stack) {
            item.decreaseCost(percent);
        }
    }

    private boolean ifStackFull () {
        boolean flag = CurrentItemNumber == stack.length;
        if (flag){
            System.out.println("Cart is full");
        }
        return flag;
    }

    private boolean ifStackEmpty () {
        boolean flag = CurrentItemNumber == 0;
        if(flag) {
            System.out.println("Cart is empty");
        }
        return flag;
    }


}





