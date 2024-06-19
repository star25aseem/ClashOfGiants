public class Weapon implements Attack,Signal{
    int id;
    int p;

    Monster m=new Monster();
    Protagonist P=new Protagonist();
    int value_per_attack=5*p;
    Weapon(int value_per_attack){
        this.value_per_attack=value_per_attack;
    }
    @Override
    public void attack_m2p(Monster m,Protagonist P) {
        if(m.power> P.power) {
            P.health -= 2*value_per_attack;
        }
        else{
            P.health -= value_per_attack;
        }
    }

    @Override
    public void attack_p2m(Monster m,Protagonist P) {
        if(P.power>m.power){
            m.health -= 2*value_per_attack;
        }
        else{
            m.health -= value_per_attack;
        }

    }

    @Override
    public void indication_of_fight() {
        if(m.positionX==P.positionX && m.positionY==P.positionY){
            System.out.println("weapon is ready for fight");
        }

    }
}

