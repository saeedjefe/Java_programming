public class ShootingTest{

public static void main(String[] args){
 
	Club girl_shooting = new GirlShooting();
	Daddy daughter = new Daughter(girl_shooting);
	daughter.shoot();
	
	Club sun_shooting = new SunShooting();
	Daddy sun = new Sun(sun_shooting);
	sun.shoot();
}

}
