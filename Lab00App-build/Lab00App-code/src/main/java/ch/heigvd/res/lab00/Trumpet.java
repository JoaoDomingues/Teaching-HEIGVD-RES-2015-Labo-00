package ch.heigvd.res.lab00;

/**
 *
 * @author Joao Domingues
 */
public class Trumpet implements IInstrument{
     
   @Override
   public int getSoundVolume() {
     return 100; 
   }

   @Override
   public String getColor() {
      return "golden";
   }

   @Override
   public String play() {
      return "pouet";
   }
}
