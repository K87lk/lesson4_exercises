package bank;

public class BankAccount {
    private int id;
    private String name;
    private int amount;
    private boolean isActive;

    public BankAccount(int id, String name, int amount, boolean isActive) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankAccount{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", amount=").append(amount);
        sb.append(", isActive=").append(isActive);
        sb.append('}');
        return sb.toString();
    }
}
