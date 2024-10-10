package character;

public class Player extends Fighter {
    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    private int intelligence;

    @Override
    public String toString() {
        return "Player{" +
                "intelligence=" + intelligence +
                ", hp=" + hp +
                ", power=" + power +
                ", defence=" + defence +
                ", name='" + name + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
