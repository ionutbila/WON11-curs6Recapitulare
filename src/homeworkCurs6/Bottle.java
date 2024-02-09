package homeworkCurs6;

public class Bottle {
    private int totalCapacity = 1000;
    private int availableLiquid = 500;
    private boolean open;

    public boolean hasMoreLiquid() {
        if (availableLiquid > 0) {
            return true;
        }
        return false;
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public int getEmptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public String openTheBottle() {
        if (open == true) {
            return "The bottle is already open";
        } else {
            open = true;
            return "Bottle is opened";
        }
    }

    public String closeTheBottle() {
        if (open == false) {
            return "The bottle is already closed";
        } else {
            open = false;
            return "Bottle is closed";
        }
    }

    public String drinkLiquid(int amount) {
        if (open == true) {
            if (amount > availableLiquid) {
                return "There is not enough liquid to drink!" + "It is only " + getAvailableLiquid() + " liquid";
            }

            int remainderLiquid = availableLiquid - amount;
            return "It was drank " + amount + " liquid";
        } else {
            return "You can't drink from a closed bottle";

        }
    }

    public String fillTheBottle(int amount) {
        if (open == true) {
            if (amount <= getEmptyCapacity()) {
                availableLiquid += amount;
                return "You added liquid!";
            } else {
                availableLiquid += getEmptyCapacity();
                return "The maximum you can add is: " + getEmptyCapacity();
            }

        } else {
            return "You can't fill up a closed bottle!";
        }
    }

    public String refillTheBottle() {
        if (open == true) {
            if (getEmptyCapacity() > 0) {
                availableLiquid += getEmptyCapacity();
                return "The bottle was filled up";
            } else {
                return "The bottle is already full! It doesn't need to be filled up!";
            }
        } else {
            return "You can't fill up a closed bottle!";
        }
    }

}
