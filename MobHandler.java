import greenfoot.*;  
/**
 * Write a description of class MobHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MobHandler extends Actor
{
    private MonsterEnum monster1, monster2, monster3;
    private double monsterGeneration;
    private MonsterGenerator generator = new MonsterGenerator();
    private  double decreasingFactor =0.1;
    
    private static final double INITIAL_MONSTER_GENERATION = 60;
    
    public MobHandler(MonsterEnum monster1, MonsterEnum monster2, MonsterEnum monster3)
    {
        this.monster1 = monster1;
        this.monster2 = monster2;
        this.monster3 = monster3;
        monsterGeneration = INITIAL_MONSTER_GENERATION;
    }
    public void act(){
        monsterGeneration--;
        getWorld().showText("next mob in: "+monsterGeneration, -300, 20);
        if(monsterGeneration <= 0){
            spawnMonster(Greenfoot.getRandomNumber(2)+1);
            monsterGeneration=INITIAL_MONSTER_GENERATION-decreasingFactor;
            decreasingFactor+=0.1;
        }
    }
    public void spawnMonster(int option){
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
        switch(option){
            case 1:
                getWorld().addObject(generator.generateMonster(monster1), spawnX, spawnY);
                break;
            case 2:
                getWorld().addObject(generator.generateMonster(monster2), spawnX, spawnY);
                break;
            case 3:
                getWorld().addObject(generator.generateMonster(monster3), spawnX, spawnY);
                break;
        }
    }
}
