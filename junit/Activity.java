package activities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity {

    static ArrayList<String> list;
    @BeforeEach
    void setUp() throws Exception {
        // Initialize a new ArrayList
        list = new ArrayList<String>();

// Add values to the list
        list.add("alpha"); // at index 0
        list.add("beta"); // at index 1

    }
    @Test
    public void insertTest(){

        // Assert size of the list
        assertEquals(2,list.size());
        //Add new itel to list
        list.add(2,"gama");
        //assert list size after adding the item to array list
        assertEquals(3,list.size());

        // getting assert each of the item in list

        for( int i=0;i<list.size();i++)
              {
                  String item= list.get(i);
                  System.out.println("isertion test->" +item);
            assertEquals(item,list.get(i));
        }
    }

    @Test
    public void replaceTest(){

        // Assert size of the list
        assertEquals(2,list.size());
        //Add new itel to list
        list.add(2,"teta");
        //assert list size after adding the item to array list
        assertEquals(3,list.size());

        //set value to array at existed index
        list.set(1,"suresh");
        // getting assert each of the item in list

        for( int i=0;i<list.size();i++)
        {
            String item= list.get(i);
            System.out.println("replaceTest ->"+item);
            assertEquals(item,list.get(i));
        }
    }
}
