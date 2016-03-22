import java.util.ArrayList;
import java.util.List;

public class Arranger {
    public List<Integer> arrangeList(List<Integer> list) {

        List<Integer> newList = new ArrayList<Integer>();
        int evenIndex = 0 , oddIndex = 1;

        arrangeElements(list, newList, evenIndex, oddIndex);

        return newList;

    }

    private void arrangeElements(List<Integer> list, List<Integer> newList, int evenIndex, int oddIndex) {

        for (int index = 0; index < list.size(); index++) {
            if (isPositiveNumber(list, index)) {
                evenIndex = insertAtIndex(list, newList, evenIndex, index);
            }
            else {
                oddIndex = insertAtIndex(list, newList, oddIndex, index);
            }
        }

    }

    private boolean isPositiveNumber(List<Integer> list, int index) {
        return list.get(index) > 0;
    }

    private int insertAtIndex(List<Integer> list, List<Integer> newList, int newListIndex, int index) {

        if(isIndexAvailable(newList, newListIndex)) {
            newList.add(list.get(index));
        }
        else {
            newList.add(newListIndex , list.get(index));
        }
        newListIndex = incrementIndex(newListIndex);

        return newListIndex;

    }

    private int incrementIndex(int newListIndex) {
        return newListIndex + 2;
    }

    private boolean isIndexAvailable(List<Integer> newList, int newListIndex) {
        return newListIndex > newList.size();
    }
}
