import java.util.*;

public class LudoDice extends Dice{
   
   public void roll(){
      if (super.getCheat()){
         super.setEyes("Star");
      }
      else{
         super.roll();
         String eyes = super.getEyes();
         if (eyes.equals("3")){
            super.setEyes("Star");
         }
         else if (eyes.equals("5")){
            super.setEyes("Globe");
         }
      }
   }
   
   public void tell(){
      super.tell();
   }
   
   

}