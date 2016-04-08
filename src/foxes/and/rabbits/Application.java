
package foxes.and.rabbits;

/**
 *
 * @author Morten
 */
public class Application
{

private Simulator simulator;
    
    public Application()
    {
        simulator = new Simulator();
        
        simulator.reset();
        
        test();
        
    }
    
    private void test()
    {
        //simulator.simulate(6);
        simulator.runLongSimulation();
//        simulator.simulateOneStep();
//        simulator.simulateOneStep();
//        simulator.simulateOneStep();
//        simulator.simulateOneStep();
//        simulator.simulateOneStep();
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Application app = new Application();
    }
    
    
    /**
     * Prints out the comperence between the field and the list of foxes and
     * rabbits.
     */
   // public void printCompere()
//    {
//        System.out.println("Field: " + simulator.getAnimales() + " - " + 
//                            "Foxes and Rabits: " + simulator.getSizeFoxesAndRabits());
//        
//    }
}
