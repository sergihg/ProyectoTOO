/**
 * Write a description of class MonsterGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MonsterGenerator  
{
    public Monster generateMonster(MonsterEnum option){
        switch(option){
            case SLIME:
                return new Slime();
        }
        return null;
    }
}
