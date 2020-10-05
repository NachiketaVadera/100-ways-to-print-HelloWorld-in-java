
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.Random;

@SuppressWarnings({"squid:S1220", "squid:S101"})
public class HelloWorld_Quicksort {

  /**
   * Print list
   * @param list input list
   */
  static void printList(List<CustomCharacter> list){
    for (CustomCharacter customCharacter : list) {
      System.out.print(customCharacter.key + " ");
    }
    System.out.println("");
  }

  /**
   * Returns the deep cloned ith element from the list
   * @param list input list
   * @param i to be clones
   * @return the cloned ith element
   */
  static CustomCharacter getClone(List<CustomCharacter> list, int i){
    CustomCharacter temp = list.get(i);
    return new CustomCharacter(temp.key, temp.originalPosition, temp.randomizedPosition);
  }

  /**
   * swap elements at posititon a and b in list
   * @param list inputlist
   * @param a first element
   * @param b second element
   */
  static void swap(List<CustomCharacter> list, int a, int b){
    CustomCharacter temp = getClone(list, a);
    list.set(a, list.get(b));
    list.set(b, temp);
  }

  /**
   * Partitions the list such that rth element goes to its correct position.
   * Elements to the left of the rth element now becomes smaller, and to the right of the rth element are greater or equal.
   * @param l left boundary
   * @param r right boundary
   * @param list the original list
   */
  public static void quicksort(int l, int r, List<CustomCharacter> list)
      throws InterruptedException {

    // handle edge cases
    if(l >= r){
      return;
    }
    if(l >= list.size()){
      return;
    }
    if(r >= list.size()){
      r = list.size() - 1;
    }



    // partition smaller elements on left  // and larger on right // with respect to the originalPosition of the rth element (pivot)
    int smallElementEnd = l-1;
    System.out.println("Deciding for : " + list.get(r).key);

    CustomCharacter rth = list.get(r);
    for (int i = l; i < r; i++) {
      CustomCharacter curr = list.get(i);
      if(curr.originalPosition < rth.originalPosition){
        swap(list, ++smallElementEnd, i);
      }
    }

    // place rth element at correct position
    swap(list, ++smallElementEnd, r);

    Thread.sleep(1500);
    printList(list);

    // sort the remaining two halves
    quicksort(l, smallElementEnd-1, list);
    quicksort(smallElementEnd + 1, r, list);
  }

  public static void main(String[] args) throws InterruptedException {

    // the hello world string
    char[] list = new char[]{'h', 'e', 'l', 'l', 'o', ',', 'w', 'o', 'r', 'l', 'd', '!'};

    // creating the list of CustomCharacter
    List<CustomCharacter> unsortedList = new ArrayList<>();
    Random randomGenerator = new Random();
    for (int i = 0; i < list.length; i++) {
      unsortedList.add(new CustomCharacter( list[i], i ,randomGenerator.nextInt(100)) );
    }

    // scrambling as per randomized positions decided by the random generator
    Collections.sort(unsortedList, Comparator.comparingInt(a -> a.randomizedPosition));

    // print list
    printList(unsortedList);

    // calling quicksort function // returning then back the original position
    quicksort(0, unsortedList.size()-1, unsortedList);

  }


  /**
   * The class that will hold the character along with its weight
   */
  public static class CustomCharacter{
    char key;
    int originalPosition;
    int randomizedPosition;

    CustomCharacter(char key, int originalPosition, int randomizedPosition){
      this.key = key;
      this.originalPosition = originalPosition;
      this.randomizedPosition = randomizedPosition;
    }
  }
}
