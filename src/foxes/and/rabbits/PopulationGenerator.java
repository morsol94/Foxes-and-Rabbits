package foxes.and.rabbits;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Morten
 */
public class PopulationGenerator
{
    
    // The probability that a fox will be created in any given grid position.
    private static final double FOX_CREATION_PROBABILITY = 0.02;
    // The probability that a rabbit will be created in any given grid position.
    private static final double RABBIT_CREATION_PROBABILITY = 0.08;    

    // Lists of animals in the field. Separate lists are kept for ease of iteration.
    private List<Animale> animales;

    // The current state of the field.
    private Field field;  
    
    // A graphical view of the simulation.
    private SimulatorView view;
    
    
    
    public PopulationGenerator(Field field, SimulatorView view)
    {
        animales = new ArrayList<>();
       this.field = field;
       this.view = view;
       
        setColor();
        
    }
    
     public List<Animale> getAnimalsList()
    {
        return this.animales;
    }
    
        /**
     * Return the total number of foxes and rabbits in the list.
     * @return The total number of foxes and rabbits in the list.
     */
    public int getNumberOfAnimals()
    {
       int i = animales.size();
       return i;
    }   
    
    
     public int getAllAnimalsOnField()
    {
        ArrayList<Object> allAnimals;
        allAnimals = new ArrayList<>();
        
        
        for(int y = 0; y < getField().getDepth(); y++)
        {
            for(int x = 0; x < getField().getWidth(); x++)
            {
                Object obj = getField().getObjectAt(y,x);
                
             if(obj instanceof Rabbit || obj instanceof Fox) 
             {
                 allAnimals.add(obj);
             }
  
            }
        }
        return allAnimals.size();
    }
    
     
     /**
      * Returns the field.
      * 
      * @return field 
      */
    private Field getField()
    {
        return this.field;
    }
 
    
    
        /**
     * Randomly populate the field with foxes and rabbits.
     */
    public void populate()
    {
        Random rand = Randomizer.getRandom();
        getField().clear();
        for(int row = 0; row < getField().getDepth(); row++) {
            for(int col = 0; col < getField().getWidth(); col++) {
                if(rand.nextDouble() <= FOX_CREATION_PROBABILITY) {
                    Location location = new Location(row, col);
                    Fox fox = new Fox(true, getField(), location);
                    animales.add(fox);
                }
                else if(rand.nextDouble() <= RABBIT_CREATION_PROBABILITY) {
                    Location location = new Location(row, col);
                    Rabbit rabbit = new Rabbit(true, getField(), location);
                    animales.add(rabbit);
                }
                // else leave the location empty.
            }
        }
    }
    
    
        private void setColor()
    {
        this.view.setColor(Rabbit.class, Color.ORANGE);
        this.view.setColor(Fox.class, Color.BLUE);
        
    }
    
}

