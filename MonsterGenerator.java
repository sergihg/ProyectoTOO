/**
 * Write a description of class MonsterGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MonsterGenerator  
{
    //monster factory
    public static Monster generate(MonsterEnum option){
        switch(option){
            case SLIME:
                return new Slime();
            case WEREWOLF:
                return new Werewolf();
            case SKELETON:
                return new Skeleton();    
        }
        return null;
    }
}
