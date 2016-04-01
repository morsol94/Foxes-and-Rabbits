
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
        simulator = new Simulator(50,50);
        
        simulator.reset();
        
        test();
    }
    
    private void test()
    {
        //simulator.simulate(6);
        //simulator.runLongSimulation();
        simulator.simulateOneStep();
        simulator.simulateOneStep();
        simulator.simulateOneStep();
        simulator.simulateOneStep();
        simulator.simulateOneStep();
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Application app = new Application();
    }
    
}
