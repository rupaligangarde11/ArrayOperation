import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrangerTest {

    @org.junit.Test
    public void shouldArrangePositiveNumberAtEvenArrayIndex() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        Arranger arranger = new Arranger();
        List newList = arranger.arrangeList(list);
        assertEquals(1,newList.get(0));
    }

    @Test
    public void shouldArrangeNegativeNumberAtOddArrayIndex() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(-1);
        Arranger arranger = new Arranger();
        List newList = arranger.arrangeList(list);
        assertEquals(-1,newList.get(0));
    }
    @Test
    public void shouldArrangePositiveNumberAtEvenIndexAndNegativeNumberAtOddIndex() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(-1);
        Arranger arranger = new Arranger();
        List newList = arranger.arrangeList(list);
        assertEquals(1,newList.get(0));
        assertEquals(-1,newList.get(1));

    }

    @Test
    public void shouldArrangeListOneAndMinusOne() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(-1);
        list.add(1);
        Arranger arranger = new Arranger();
        List newList = arranger.arrangeList(list);
        assertEquals(1,newList.get(0));
        assertEquals(-1,newList.get(1));
    }

    @Test
    public void shouldArrangeListWithValuesOneMinusOneAndTwo() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(-1);
        list.add(2);
        Arranger arranger = new Arranger();
        List newList = arranger.arrangeList(list);
        assertEquals(1,newList.get(0));
        assertEquals(-1,newList.get(1));
        assertEquals(2,newList.get(2));
    }

    @Test
    public void shouldArrangeListWithValuesMinusOneAndOneAndMinusTwo() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(-1);
        list.add(1);
        list.add(-2);
        Arranger arranger = new Arranger();
        List newList = arranger.arrangeList(list);
        assertEquals(1,newList.get(0));
        assertEquals(-1,newList.get(1));
        assertEquals(-2,newList.get(2));
    }
    @Test
    public void shouldArrangeListWithValuesOneAndOneAndMinusTWo() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(-2);
        Arranger arranger = new Arranger();
        List newList = arranger.arrangeList(list);
        assertEquals(1,newList.get(0));
        assertEquals(-2,newList.get(1));
        assertEquals(1,newList.get(2));
    }

    @Test
    public void shouldArrangeListWithValuesMinusOneMinusTwoMinusThreeAndFour() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(-1);
        list.add(-2);
        list.add(-3);
        list.add(4);
        Arranger arranger = new Arranger();
        List newList = arranger.arrangeList(list);
        assertEquals(4,newList.get(0));
        assertEquals(-1,newList.get(1));
        assertEquals(-2,newList.get(2));
        assertEquals(-3,newList.get(3));
    }

    @Test
    public void shouldArrangeListWithValuesOneMinusThreeTwoMinusFour() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(-3);
        list.add(2);
        list.add(4);
        Arranger arranger = new Arranger();
        List newList = arranger.arrangeList(list);
        assertEquals(1,newList.get(0));
        assertEquals(-3,newList.get(1));
        assertEquals(2,newList.get(2));
        assertEquals(4,newList.get(3));
    }

    @Test
    public void shouldArrangeListWithValuesOneTwoThreeFourMinusFiveMinusSix() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(-5);
        list.add(-6);
        Arranger arranger = new Arranger();
        List newList = arranger.arrangeList(list);
        assertEquals(1,newList.get(0));
        assertEquals(-5,newList.get(1));
        assertEquals(2,newList.get(2));
        assertEquals(-6,newList.get(3));
        assertEquals(3,newList.get(4));
        assertEquals(4,newList.get(5));
    }

}
