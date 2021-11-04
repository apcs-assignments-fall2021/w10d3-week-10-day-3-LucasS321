import java.util.ArrayList;

public class MyMain {

    // Counts the number of words that starts with 'a' or 'A'
    public static int startsWithA(ArrayList<String> list) {
        int count = 0;
        for (String item : list) {
            if (item.charAt(0) == 'A' || item.charAt(0) == 'a') {
                count += 1;
            }
        }
        return count;
    }

    // Adds a ! to each element in the ArrayList, returns an ArrayList
    public static ArrayList<String> makeExciting(ArrayList<String> list) {
        for (int d = 0; d < list.size(); d++) {
            list.set(d,list.get(d)+"!");
        }
        return list;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i : list1) {
            for (int v : list2) {
                if (v == i) {
                    return true;
                }
            }
        }
        return false;
    }


    // METHODS FOR THE HOMEWORK:

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) {
        int count = 0;
        for (int i : list) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    // Unlike the other methods, the input is an array!
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        for (int i :arr) {
            myArrayList.add(i);
        }
        return myArrayList;
    }

    // Takes two **sorted** ArrayLists and merges them together into one big sorted ArrayList
    // (Hint: you may find it useful to use a while loop, as well as the remove() method).
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        for (int i : list1)
        {
            if (sorted.size() == 0) {
                sorted.add(i);
            } else {
                for (int v = 0; v < sorted.size(); v++) {
                    if (sorted.get(v) <= i) {
                        sorted.add(v, i);
                        break;
                    }
                }
            }
        }
        for (int i : list2)
        {
            for (int v = 0; v < sorted.size(); v++) {
                if (sorted.get(v) <= i) {
                    sorted.add(v,i);
                    break;
                }
            }
        }

        // REPLACE WITH YOUR CODE
        return sorted;
    }



    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
