package ca.sheridancollege.project;

public class WildCard extends Card {
    public WildCard(String colour) {
        super(colour);
        //TODO Auto-generated constructor stub
    }

    private boolean WildFour;  
    
    public boolean getWildFour(){
        return WildFour;
    }

    public void setWildFour(boolean WildFour){
        this.WildFour = WildFour;

    }

    @Override
    public String toString() {
        return null;
    }

    
}
