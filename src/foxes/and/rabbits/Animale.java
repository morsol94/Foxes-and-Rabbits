
package foxes.and.rabbits;

import java.util.List;

/**
 * TODO:
 * 
 * @author Morten
 */
public abstract class Animale
{
    
    // Whether the fox is alive or not.
    protected boolean alive;
    // The fox's position.
    protected Location location;
    // The field occupied.
    protected Field field;

    public Animale(Location location, Field field)
    {
        this.alive = true;
        this.field = field;
        setLocation(location);
    }

    /**
     * Check whether the fox is alive or not.
     * @return True if the fox is still alive.
     */
    public boolean isAlive()
    {
        return alive;
    }

    /**
     * Return the fox's location.
     * @return The fox's location.
     */
    public Location getLocation()
    {
        return location;
    }

    /**
     * Place the fox at the new location in the given field.
     * @param newLocation The fox's new location.
     */
    protected void setLocation(Location newLocation)
    {
        if (location != null)
        {
            field.clear(location);
        }
        location = newLocation;
        field.place(this, newLocation);
    }

    /**
     * Indicate that the fox is no longer alive.
     * It is removed from the field.
     */
    protected void setDead()
    {
        alive = false;
        if (location != null)
        {
            field.clear(location);
            location = null;
            field = null;
        }
    }
        
    abstract public void act(List<Animale> newAnimales);
    
}
