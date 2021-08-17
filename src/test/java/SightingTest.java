import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SightingTest{

    @Rule
    public DatabaseRule database = new DatabaseRule();

    private Sighting testSighting;

    public SightingTest(Animal testAnimal) {
    }

    @Before
    public void setUp() {


        testSighting = new Sighting(1, "kifaru", "Tevin");
    }



    @Test
    public void Sighting_instantiatesCorrectly() {
        assertTrue(testSighting instanceof Sighting);
    }

    @Test
    public void getId_sightingInstantiatesWithId(){
        testSighting.save();
        assertTrue(testSighting.getId() > 0);
    }

    @Test
    public void getAnimalId_sightingInstantiatesWithAnimalId(){
        testSighting.save();
        assertEquals(1, testSighting.getAnimalId());
    }

    @Test
    public void getLocation_sightingInstantiatesWithLocation(){
        testSighting.save();
        assertEquals("Zone A", testSighting.getLocation());
    }

    @Test
    public void getRangerName_sightingInstantiatesWithRangerName(){
        testSighting.save();
        assertEquals("Ronald", testSighting.getRangerName());
    }
    @Test
    public void equals_returnsTrueIfAllPropertiesAreTheSame() {
        Sighting anotherSighting = new Sighting(1, "Zone A", "Ronald");
        assertEquals(testSighting, anotherSighting);
    }

    @Test
    public void save_assignsIdToObject() {
        testSighting.save();
        Sighting savedSighting = Sighting.all().get(0);
        assertEquals(testSighting.getId(), savedSighting.getId());
    }

    @Test
    public void save_insertsObjectIntoDatabase() {
        testSighting.save();
        assertEquals(Sighting.all().get(0), testSighting);
    }

    @Test
    public void all_returnsAllInstancesOfSighting_true() {
        testSighting.save();
        Sighting otherSighting = new Sighting(1, "Zone B",  "Baraka");
        otherSighting.save();
        assertEquals(true, Sighting.all().get(0).equals(testSighting));
        assertEquals(true, Sighting.all().get(1).equals(otherSighting));
    }

    @Test
    public void find_returnsSightingWithSameId_secondSighting() {
        testSighting.save();
        Sighting otherSighting = new Sighting(1, "Zone B",  "Daniels");
        otherSighting.save();
        assertEquals(Sighting.find(otherSighting.getId()), otherSighting);
    }

    @Test
    public void delete_deletesSighting() {
        testSighting.save();
        testSighting.delete();
        assertEquals(0, Sighting.all().size());
    }

}
