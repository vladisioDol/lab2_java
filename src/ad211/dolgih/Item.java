package ad211.dolgih;

public class Item {
    private String name;
    private float cost;

    public Item (String name, float cost) {
        this.name = name;
        this.cost = cost;
        ifCostNegative();
    }

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }

    public void increaseCost(float percent) {
        cost += cost * percent / 100;
    }

    public void decreaseCost (float percent) {
        cost -= cost * percent / 100;
    }

    public void ifCostNegative () {
        if (cost < 0) {
            cost = 0;
        }
    }
}

