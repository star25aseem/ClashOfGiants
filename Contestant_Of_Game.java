public abstract class Contestant_Of_Game {
    String id;
    int health;
    int positionX;
    int positionY;
    boolean alive;
    int stamina;
    int power;

    Contestant_Of_Game() {
        this.health = 100;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void moveleft(int positionX) {
        if (this.stamina > 10) {
            this.positionX--;
            this.stamina -= 10;
        } else {
            this.health -= 10;
            this.positionX--;
        }
    }

    public void moveright(int positionX) {
        if (this.stamina > 10) {
            this.positionX++;
            this.stamina -= 10;
        } else {
            this.health -= 10;
            this.positionX++;
        }
    }

    public void movetop(int positionY) {
        if (this.stamina > 10) {
            this.positionY++;
            this.stamina -= 15;
        } else {
            this.health -= 15;
            this.positionY++;
        }
    }

    public void movebottom(int positionY) {
        if (this.stamina > 10) {
            this.positionY--;
            this.stamina -= 5;
        } else {
            this.health -= 5;
            this.positionY--;
        }
    }

    abstract void upgrade();

    abstract void booststamina();

    public void moveleft() {
        this.positionX--;
        this.power -= 2;
    }

    public void moveright() {
        this.positionX++;
        this.power -= 2;
    }

    public void movetop() {
        this.positionY++;
        this.power -= 3;
    }

    public void movebottom() {
        this.positionY--;
        this.power -= 1;
    }

    public void healthstatus() {
        System.out.println("health" + "=" + this.health);
        if(this.health<=0){
            this.alive=false;
        }
    }

    public void getPosition() {
        System.out.println("positionX" + "=" + this.positionX + "   " + "positionY" + "=" + this.positionY);
    }

    abstract void reduceHealth();

    public void alivestatus() {
        if (this.alive == true) {
            System.out.println("alive");
        } else {
            System.out.println("dead");
        }
    }
}
