public class Protagonist extends Contestant_Of_Game{
    boolean elixir;
    Protagonist() {
        this.power = 25;
        this.stamina = 1500;
        this.alive = true;
        this.positionX = 0;
        this.positionY = 50;
    }

    public void upgrade() {
        if (this.positionX == 100 && this.positionY == 100) {
            power += 10;
            this.positionX = 0;
            this.positionY = 50;
        }
    }

    public void booststamina() {
        if (this.positionX % 25 == 0 && this.positionY % 20 == 0) {
            stamina+=100;
            this.positionX -= 5;
            this.positionY -= 3;
        }
    }

    public void reduceHealth() {
        if (stamina <= 500) {
            this.health -= 5;
        }
    }
    public void consumeelixir(){
        health+=15;
        this.elixir=false;
    }
}
