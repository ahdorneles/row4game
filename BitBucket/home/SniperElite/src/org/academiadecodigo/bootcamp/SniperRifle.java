package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 31/01/17.
 */
public class SniperRifle {
    private int headShot = 100;
    private int torsoShot = 50;
    private int failedShot = 0;

    private int shootsTaken;


    public SniperRifle() {

    }

    public int bulletDamage() {
        int random = (int) (Math.random() * 3);
        if (random == 0) {
            System.out.println("Headshot");
            return headShot;
        }
        if (random == 1) {
            System.out.println("Torso Shot");
            return torsoShot;
        }
        if (random == 2) {
            System.out.println("Missed Shot!!");
            return failedShot;
        }
        return 0;
    }


    public void shoot(Destroyable enemy) {


      //  while (enemy.getHealth() > 0) {
        //    shootsTaken ++;

          //  if(enemy.getLife() == false) {
            //        System.out.println("Shooting " + enemy + " Shoot number: " + shootsTaken);
                    enemy.hit(bulletDamage());
            //    }
             //   if(enemy.getLife() == true){
               //     System.out.println("Enemy dead");
       //         }
       // }
       // return ;
    }


}
