/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bitmusic.music.data;
import java.io.Serializable;
/**
 *
 * @author Doha
 */
public class Rights implements Serializable{
    
    private boolean canPlay;
    private boolean canReadInfo;
    private boolean canRate;
    private boolean canComment;
    private static final long serialVersionUID = 302L;
    
    public Rights(boolean canPlayValue, boolean canReadInfoValue, boolean canRateValue, boolean canCommentValue)
         {
    
            this.canPlay=canPlayValue;
            this.canReadInfo=canReadInfoValue;
            this.canRate=canRateValue;
            this.canComment=canCommentValue;
        }

        
        public boolean getcanPlay(){
            return(canPlay); 
        }
        
        public boolean getcanReadInfo(){
            return(canReadInfo); 
        }
        
        public boolean getcanRate(){
            return(canRate); 
        }
        
        public boolean getcanComment(){
            return(canComment); 
        }
        
        public void setcanPlay(boolean canPlayValue) {
        
           canPlay=canPlayValue;
        }
        
         public void setcanReadInfo(boolean canReadInfoValue) {
        
           canReadInfo=canReadInfoValue;
        }
        
          public void setcanRate(boolean canRateValue) {
        
           canRate=canRateValue;
        }
          
         public void setcanComment(boolean canCommentValue) {
        
           canComment=canCommentValue;
        }
          

    
}
