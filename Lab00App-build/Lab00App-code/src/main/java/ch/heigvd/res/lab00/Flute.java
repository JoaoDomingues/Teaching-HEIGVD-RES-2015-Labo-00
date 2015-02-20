package ch.heigvd.res.lab00;

/**
 *
 * @author Joao Domingues
 */
public class Flute implements IInstrument{

   @Override
   public int getSoundVolume() {
     return 50; 
   }

   @Override
   public String getColor() {
      return "white";
   }

   @Override
   public String play() {
      return "fu";
   }  
}
