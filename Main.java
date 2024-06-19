import java.sql.SQLOutput;
import java.util.Scanner;
// SAMPLE TEST CASE
//Enter the number of chances
//1
//Enter the value per attack for weapon
//10
//Info A
//health=100
//alive
//positionX=0   positionY=50
//power = 25  stamina = 1500
//Info M
//health=100
//alive
//positionX=100   positionY=50
//power = 30  stamina = 1000
//Enter no. of left moves for Protagonist
//0
//Info A
//health=100
//alive
//positionX=0   positionY=50
//power = 25  stamina = 1500
//Info M
//health=100
//alive
//positionX=100   positionY=50
//power = 30  stamina = 1000
//Enter no. of left moves for Monster
//0
//Info A
//health=100
//alive
//positionX=0   positionY=50
//power = 25  stamina = 1500
//Info M
//health=100
//alive
//positionX=95   positionY=47
//power = 30  stamina = 1105
//Enter no. of right moves for Protagonist
//100
//Info A
//health=100
//alive
//positionX=100   positionY=50
//power = 25  stamina = 500
//Info M
//health=100
//alive
//positionX=95   positionY=47
//power = 30  stamina = 1105
//Enter no. of right moves for Monster
//5
//Info A
//health=100
//alive
//positionX=100   positionY=50
//power = 25  stamina = 500
//Info M
//health=100
//alive
//positionX=100   positionY=47
//power = 30  stamina = 1055
//Enter no. of top moves for Protagonist
//100
//Info A
//health=-905
//dead
//positionX=100   positionY=150
//power = 25  stamina = 5
//Info M
//health=100
//alive
//positionX=100   positionY=47
//power = 30  stamina = 1055
//Game Over
public class Main {
    public static void main(String[] args) {

        Protagonist A=new Protagonist();
        Monster M=new Monster();
        Scanner s=new Scanner(System.in);
        int q;
        System.out.println("Enter the number of chances");
        q=s.nextInt();
        for(int o=0;o<q;o++) {
            System.out.println("Enter the value per attack for weapon");
            int g = s.nextInt();
            Weapon Y = new Weapon(g);
            int l, r, t, b, L, R, T, B;
            System.out.println("Info A");
            A.healthstatus();
            A.alivestatus();
            A.getPosition();
            System.out.print("power = "+A.power+"  ");
            System.out.println("stamina = "+A.stamina);
            System.out.println("Info M");
            M.healthstatus();
            M.alivestatus();
            M.getPosition();
            System.out.print("power = "+M.power+"  ");
            System.out.println("stamina = "+M.stamina);
            System.out.println("Enter no. of left moves for Protagonist");
            l = s.nextInt();
            for (int i = 0; i < l; i++) {
                A.moveleft(A.positionX);
            }
            if (A.positionX == 100 && A.positionY == 100){
                A.upgrade();
            }
            if (A.positionX % 25 == 0 && A.positionY % 20 == 0){
                A.booststamina();
            }
            System.out.println("Info A");
            A.healthstatus();
            A.alivestatus();
                A.getPosition();
            System.out.print("power = "+A.power+"  ");
            System.out.println("stamina = "+A.stamina);
            System.out.println("Info M");
            M.healthstatus();
            M.alivestatus();
            M.getPosition();
            System.out.print("power = "+M.power+"  ");
            System.out.println("stamina = "+M.stamina);
            if(!A.alive||!M.alive){
                System.out.println("Game Over");
                break;
            }
            System.out.println("Enter no. of left moves for Monster");

            L = s.nextInt();
            for (int i = 0; i < L; i++) {
                M.moveleft(M.positionX);
            }
            if (M.positionX == 100 && M.positionY == 100){
                M.upgrade();
            }
            if (M.positionX % 20 == 0 && M.positionY % 25 == 0){
                M.booststamina();
            }
            System.out.println("Info A");
            A.healthstatus();
            A.alivestatus();
            A.getPosition();
            System.out.print("power = "+A.power+"  ");
            System.out.println("stamina = "+A.stamina);
            System.out.println("Info M");
            M.healthstatus();
            M.alivestatus();
            M.getPosition();
            System.out.print("power = "+M.power+"  ");
            System.out.println("stamina = "+M.stamina);
            if(!A.alive||!M.alive){
                System.out.println("Game Over");
                break;
            }
            System.out.println("Enter no. of right moves for Protagonist");

            r = s.nextInt();
            for (int j = 0; j < r; j++) {
                A.moveright(A.positionX);
            }
            if (A.positionX == 100 && A.positionY == 100){
                A.upgrade();
            }
            if (A.positionX % 25 == 0 && A.positionY % 20 == 0){
                A.booststamina();
            }
            System.out.println("Info A");
            A.healthstatus();
            A.alivestatus();
            A.getPosition();
            System.out.print("power = "+A.power+"  ");
            System.out.println("stamina = "+A.stamina);
            System.out.println("Info M");
            M.healthstatus();
            M.alivestatus();
            M.getPosition();
            System.out.print("power = "+M.power+"  ");
            System.out.println("stamina = "+M.stamina);
            if(!A.alive||!M.alive){
                System.out.println("Game Over");
                break;
            }
            System.out.println("Enter no. of right moves for Monster");

            R = s.nextInt();
            for (int j = 0; j < R; j++) {
                M.moveright(M.positionX);
            }
            if (M.positionX == 100 && M.positionY == 100){
                M.upgrade();
            }
            if (M.positionX % 20 == 0 && M.positionY % 25 == 0){
                M.booststamina();
            }
            System.out.println("Info A");
            A.healthstatus();
            A.alivestatus();
            A.getPosition();
            System.out.print("power = "+A.power+"  ");
            System.out.println("stamina = "+A.stamina);
            System.out.println("Info M");
            M.healthstatus();
            M.alivestatus();
            M.getPosition();
            System.out.print("power = "+M.power+"  ");
            System.out.println("stamina = "+M.stamina);
            if(!A.alive||!M.alive){
                System.out.println("Game Over");
                break;
            }
            System.out.println("Enter no. of top moves for Protagonist");

            t = s.nextInt();
            for (int k = 0; k < t; k++) {
                A.movetop(A.positionY);
            }
            if (A.positionX == 100 && A.positionY == 100){
                A.upgrade();
            }
            if (A.positionX % 25 == 0 && A.positionY % 20 == 0){
                A.booststamina();
            }
            System.out.println("Info A");
            A.healthstatus();
            A.alivestatus();
            A.getPosition();
            System.out.print("power = "+A.power+"  ");
            System.out.println("stamina = "+A.stamina);
            System.out.println("Info M");
            M.healthstatus();
            M.alivestatus();
            M.getPosition();
            System.out.print("power = "+M.power+"  ");
            System.out.println("stamina = "+M.stamina);
            if(!A.alive||!M.alive){
                System.out.println("Game Over");
                break;
            }
            System.out.println("Enter no. of top moves for Monster");

            T = s.nextInt();
            for (int k = 0; k < T; k++) {
                M.movetop(M.positionY);
            }
            if (M.positionX == 100 && M.positionY == 100){
                M.upgrade();
            }
            if (M.positionX % 20 == 0 && M.positionY % 25 == 0){
                M.booststamina();
            }
            System.out.println("Info A");
            A.healthstatus();
            A.alivestatus();
            A.getPosition();
            System.out.print("power = "+A.power+"  ");
            System.out.println("stamina = "+A.stamina);
            System.out.println("Info M");
            M.healthstatus();
            M.alivestatus();
            M.getPosition();
            System.out.print("power = "+M.power+"  ");
            System.out.println("stamina = "+M.stamina);
            if(!A.alive||!M.alive){
                System.out.println("Game Over");
                break;
            }
            System.out.println("Enter no. of bottom moves for Protagonist");

            b = s.nextInt();
            for (int x = 0; x < b; x++) {
                A.movebottom(A.positionY);
            }
            if (A.positionX == 100 && A.positionY == 100){
                A.upgrade();
            }
            if (A.positionX % 25 == 0 && A.positionY % 20 == 0){
                A.booststamina();
            }
            System.out.println("Info A");
            A.healthstatus();
            A.alivestatus();
            A.getPosition();
            System.out.print("power = "+A.power+"  ");
            System.out.println("stamina = "+A.stamina);
            System.out.println("Info M");
            M.healthstatus();
            M.alivestatus();
            M.getPosition();
            System.out.print("power = "+M.power+"  ");
            System.out.println("stamina = "+M.stamina);
            if(!A.alive||!M.alive){
                System.out.println("Game Over");
                break;
            }
            System.out.println("Enter no. of bottom moves for Monster");

            B = s.nextInt();
            for (int x = 0; x < B; x++) {
                M.movebottom(M.positionY);
            }
            if(!A.alive||!M.alive){
                System.out.println("Game Over");
                break;
            }

            if (M.positionX == 100 && M.positionY == 100){
                M.upgrade();
            }
            if (M.positionX % 20 == 0 && M.positionY % 25 == 0){
                M.booststamina();
            }
            System.out.println("Info A");
            A.healthstatus();
            A.alivestatus();
            A.getPosition();
            System.out.print("power = "+A.power+"  ");
            System.out.println("stamina = "+A.stamina);
            System.out.println("Info M");
            M.healthstatus();
            M.alivestatus();
            M.getPosition();
            System.out.print("power = "+M.power+"  ");
            System.out.println("stamina = "+M.stamina);
            if (A.positionX == M.positionX && A.positionY == M.positionY) {
                for (int i = 0; i < 5; i++) {
                    Y.attack_p2m(M, A);
                }
                for (int i = 0; i < 5; i++) {
                    Y.attack_m2p(M, A);
                }
            }
            System.out.println("Info A");
            A.healthstatus();
            A.alivestatus();
            A.getPosition();
            System.out.println("Info M");
            M.healthstatus();
            M.alivestatus();
            M.getPosition();
            if(!A.alive||!M.alive){
                System.out.println("Game Over");
                break;
            }
        }

        }
    }
