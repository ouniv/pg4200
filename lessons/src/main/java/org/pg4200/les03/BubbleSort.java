package org.pg4200.les03;

/**
 * Created by arcuri82 on 21-Aug-17.
 */
public class BubbleSort implements MySort {


    @Override
    public <T extends Comparable<T>> void sort(T[] array) {

        if (array == null) {
            return;
        }

        //make sure we enter into first loop of the "while"
        boolean swapped = true;

        while (swapped) {

            /*
                if there is not going to be any swapping, then the
                array is sorted, and we do not need to recheck
             */

            swapped = false;

            for (int i = 0; i < array.length - 1; i++) {
                int j = i + 1;
                /*
                    if current element is greater than next,
                    then swap them.
                    Like a bubble, the highest value will fly up.
                 */

                if (array[i].compareTo(array[j]) > 0) {
                    T tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;

                    swapped = true;
                }
            }
        }

        /*
            In best case, we still need to traverse the array once: Omega(n)

            Worst case (inverted array), we need an iteration for each element
            at least once: O(n^2)
         */
    }
}

