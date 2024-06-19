public class Monster extends Contestant_Of_Game {
    Monster() {
        this.power = 30;
        this.stamina = 1000;
        this.alive = true;
        this.positionX = 100;
        this.positionY = 50;
    }

    public void upgrade() {
        if (this.positionX == 100 && this.positionY == 100) {
            power += 10;
            this.positionX = 100;
            this.positionY = 50;
        }
    }

    public void booststamina() {
        if (this.positionX % 20 == 0 && this.positionY % 25 == 0) {
            this.stamina+=105;
            this.positionX -= 5;
            this.positionY -= 3;
        }
    }

    public void reduceHealth() {
        if (power <= 10) {
            this.health -= 5;
        }
    }
}
