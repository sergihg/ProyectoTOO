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
        List tops = UserInfo.getTop(5);
        UserInfo myInfo = UserInfo.getMyInfo();
        myInfo.setScore(score);
        int size;
        if(tops.size()>0){
            if(tops.size()<5){
                size=tops.size();
            }else{
                size=5;
            }
            for(int i =0;i<size;i++){
                UserInfo player = (UserInfo)tops.get(0);
                if(player.getScore() < score){
                    if(UserInfo.isStorageAvailable()){
                        myInfo.store();
                        return true;
                    }
                }
            }
        }else
        {
            if(UserInfo.isStorageAvailable()){
                myInfo.store();
                return true;
            }
        }
        return false;
    }
    
    public static List getleaderboard(){
        return UserInfo.getTop(5);
    }
}

