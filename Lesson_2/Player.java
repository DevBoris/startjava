public class Player {
    private String name;
    private int number;
    private boolean isCondition;

    public Player(String name, boolean isCondition) {
        this.name = name;
        this.isCondition = isCondition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isCondition() {
        return isCondition;
    }

    public void setCondition(boolean condition) {
        isCondition = condition;
    }
}