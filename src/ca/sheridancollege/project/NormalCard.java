package ca.sheridancollege.project;

public class NormalCard extends Card{
    private int number;
    public NormalCard(String colour, int number) {
        super(colour);
        this.number = number;
    }
    @Override
    public int getNumber() {
        return this.number;
    }
    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "{" +
            " number='" + getNumber() + "'" +
            "}";
    }

    
}
