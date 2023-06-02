import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecordHandler extends Actor
{
    public static boolean newRecord(int score){
        UserInfo myInfo = UserInfo.getMyInfo();

        if(myInfo ==null)
        {
            return false;   
        }
        if(score > myInfo.getScore()){
            myInfo.setScore(score);
        }
        int size;
        //guardar y obtener top
        if(UserInfo.isStorageAvailable())
        {
            myInfo.store();
        }
        List tops = UserInfo.getTop(5);

        for(int i =0;i<5;i++){
            try{
                UserInfo player = (UserInfo)tops.get(i);
                if(player.getUserName()==myInfo.getUserName()){
                    return true;
                }
            }catch(Exception ex){
                return true;
            }
        }

        return false;
    }

    public static List getleaderboard(){
        return UserInfo.getTop(5);
    }
}

