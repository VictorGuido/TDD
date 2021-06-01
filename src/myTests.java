import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class myTests {

    //UNIT TEST FOR SIZE OF LIST
    @Test
    public void sizeOfList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //check the size of the list to see if incremented, expected '4'
        assertEquals(4, list.size());
    }

    @Test
    public void sizeOfListWhenRemoved(){
        //add elements to the list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //check size when added elements
        assertEquals(4, list.size());
        //remove an element
        list.remove(1);
        //check size of list if when removed modiffies it size, expected '3'
        assertEquals(3, list.size());
    }

    @Test
    public void sizeOfListWhenCleared(){
        //add elements to the list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //clear the list
        list.clear();
        //check size of list when all elements are removed
        assertEquals(0, list.size());
    }


    //UNIT TEST FOR CLEARING THE LIST

    @Test
    public void doesClearWorksWithNoElements(){
        //Create the list
        List<Integer> list = new ArrayList<>();
        //clear the list with no elements
        list.clear();
        //check size of list to see if really cleared when its nothing to clear
        assertEquals(0, list.size());
    }

    @Test
    public void doesClearWorksWithElements(){
        //add elements to the list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //clear the list
        list.clear();
        //check size of list to see if really cleared, size should be '0'
        assertEquals(0, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void clearNullList(){
        //create a null list
        List<Integer> list = null;
        //try to clear a null list
        list.clear();
    }

    //UNIT TEST FOR ADDING ELEMENTS TO THE LIST

    @Test
    public void addElementsWithSameType(){
        //add elements to the list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        //check size of list to see if really added that element
        assertEquals(1, list.size());
    }

    @Test
    public void addElementsWithConversionType(){
        //add elements to the list
        List<Integer> list = new ArrayList<>();
        //add to the list with converted element
        list.add(Integer.parseInt("1"));
        //check size of list to see if really added that element
        assertEquals(1, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void addItemsToNullList(){
        //create a null list
        List<Integer> list = null;
        //check if non existing element in list
        list.contains(0);
    }

    //UNIT TEST FOR EXISTING ITEM

    @Test
    public void checkNonExistingElementInEmptyList(){
        //create a list
        List<Integer> list = new ArrayList<>();
        //check for an element in a empty list
        assertTrue(!list.contains(0));
    }

    @Test
    public void checkExistingElementInListWithElements(){
        //create a list
        List<Integer> list = new ArrayList<>();
        //add items to list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //check for an element in a empty list
        assertTrue(list.contains(1));
    }

    @Test(expected = NullPointerException.class)
    public void checkNonExistinItemInNullList(){
        //create null list
        List<Integer> list = null;
        //check if element exist in null list
        list.contains(3);
    }

    //UNIT TEST FOR GETTING ELEMENTS BY INDEX

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFirstElementOfAnEmptyList(){
        //Create an empty list
        List<Integer> list = new ArrayList<>();
        //Try to get the first element of the empty list
        list.get(0);
    }

    @Test
    public void getFirstElementOfAFilledList(){
        //Create an empty list
        List<Integer> list = new ArrayList<>();
        //add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //Try to get the first element of the filled list expected '1'
        list.get(0);
    }

    @Test(expected = NullPointerException.class)
    public void getFirstElementOfNullList(){
        //create the null list
        List<Integer> list = null;
        //try to get the first element of the null list
        list.indexOf(0);
    }


    //UNIT TEST TO SEARCH THE INDEX OF AN OBJECT

    @Test
    public void checkItemIndexOfEmptyList(){
        //create empty list
        List<Integer> list = new ArrayList<>();
        //check if first element of list is '2'
        assertEquals(-1,list.indexOf(0));
    }

    @Test
    public void checkItemIndexOfFilledList(){
        //create empty list
        List<Integer> list = new ArrayList<>();
        //add items to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //check if second element is index of 1, list indexeses start from 0
        assertEquals(1,list.indexOf(2));
    }

    @Test(expected = NullPointerException.class)
    public void checkItemIndexOfNullList(){
        //create null list
        List<Integer> list = null;
        //try to get index of non existing element in null list
        list.indexOf(0);
    }


    //UNIT TEST FOR REMOVING AN ELEMENT

    @Test(expected = IndexOutOfBoundsException.class)
    public void deleteItemsFromEmptyList(){
        //create an empty list
        List<Integer> list = new ArrayList<>();
        //try to remove element by index from empty list
        list.remove(0);
    }

    @Test
    public void deleteItemsFromFilledList(){
        //create empty list
        List<Integer> list = new ArrayList<>();
        //add items to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //remove an existin element from the list
        list.remove(2);
        //check size of list when deleted element
        assertEquals(3, list.size());
        //check index of list where used to be removed element
        assertEquals(-1,(int) list.indexOf(3));
    }

    @Test(expected = NullPointerException.class)
    public void deleteItemFromNullList(){
        //crete a null list
        List<Integer> list = null;
        //try to delete first element from null list
        list.remove(0);
    }
}
