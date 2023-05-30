import greenfoot.*;  
/**
 * Write a description of class MobHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MobHandler extends Actor
{
    private MonsterEnum monster;
    private double monsterGeneration;
    private static final MonsterGenerator generator = new MonsterGenerator();
    private  double decreasingFactor =0.1;
    
    private double initialMonsterGeneration = 60;
    
    public MobHandler(MonsterEnum monster, double initialMonsterGeneration)
    {
        this.monster = monster;
        this.initialMonsterGeneration = initialMonsterGeneration;
    }
    public void act(){
        monsterGeneration--;
        if(monsterGeneration <= 0){
            spawnMonster();
            monsterGeneration=initialMonsterGeneration-decreasingFactor;
            decreasingFactor+=0.1;
        }
    }
    public void spawnMonster(){
        int spawnX =0;
        int spawnY =0;
        if(Greenfoot.getRandomNumber(2)==0){
            spawnY = Greenfoot.getRandomNumber(2) * (getWorld().getHeight()-1);
            spawnX = Greenfoot.getRandomNumber(getWorld().getWidth());
        }
        else{
            spawnX = Greenfoot.getRandomNumber(2) * (getWorld().getWidth() -1);
            spawnY = Greenfoot.getRandomNumber(getWorld().getHeight());
        }
        getWorld().addObject(generator.generateMonster(monster), spawnX, spawnY);
    }
}
