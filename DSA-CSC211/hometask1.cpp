// -*-c++-*-

/**
 * @file hometask1.cpp
 * @brief insert methods implementation for ordered and unordered lists
 * @author nmanumr
 */

#include <iostream>

using namespace std;

/**
 * A list ensure that element will always be sorted when inserted
 */
class OrderedList
{
private:
    int currentPosition, length;
    int *arr;

public:
    /**
     * OrderedList consrtuctor
     * 
     * @param len intial length of array
     */
    OrderedList(int len)
    {
        // Allocate appropriate memory for arr var;
        arr = (int *)malloc(sizeof(int) * len);
        currentPosition = 0;
        length = len;
    }

    ~OrderedList()
    {
        // Free the allocated memory on deconstrution of the class
        free(arr);
    }

    /** 
     * Insert an element in ordered list as following setps:
     * => Check if array is not full else return false
     * => let currentVal = lastVal in array
     * => loop until currentVal is not first val of array
     *    => if inputVal > currentVal
     *       => insert inputVal next to the currentVal
     *       => increment current position pointer
     *       => return true
     *    => else move currentVal next for future iterations
     * => endLoop
     * => insert currentVal at 0th index
     * => increment current position pointer
     * => return true
     * 
     * @param val value to be inserted
     */
    bool insert(int val)
    {
        if (currentPosition >= length)
            return false;

        for (int i = currentPosition - 1; i >= 0; i--)
        {
            if (arr[i] < val)
            {
                // the inputVal is > the value at ith position
                // so it deserves (i+1)st position
                // if i is the last index then i+1 will be naturally free
                // in other case (i is some middle index)
                // we already have moved it to next position
                // so we can easily replace (i+1)st element
                arr[i + 1] = val;
                currentPosition++;
                return true;
            }

            // moving val to next address for future iterations
            arr[i + 1] = arr[i];
        }

        // there is only one possible left that is
        // the inputVal is < the first value in array
        // and the the first value is already moved to next cell
        // so we can easily replace it with new value
        arr[0] = val;
        currentPosition++;
        return true;
    }

    /** Prints array to console */
    void print()
    {
        for (int i = 0; i < length; i++)
            cout << arr[i] << ", ";
        cout << "\n";
    }
};

/**
 * A list when elements order is not important
 */
class UnorderedList
{
private:
    int currentPosition, length;
    int *arr;

public:
    UnorderedList(int len)
    {
        // Allocate appropriate memory for arr var;
        arr = (int *)malloc(sizeof(int) * len);
        currentPosition = 0;
        length = len;
    }

    ~UnorderedList()
    {
        // Free the allocated memory on deconstrution of the class
        free(arr);
    }

    /**
     * Insert value at last free index
     * 
     * @param val value to be inserted
     */
    bool insert(int val)
    {
        if (currentPosition >= length)
            return false;

        arr[currentPosition] = val;
        currentPosition++;
        return true;
    }

    /**
     * Insert element at given index by moving that element to last index
     * 
     * @param val value to be inserted
     * @param val index to insert at
     */
    bool insertAt(int val, int index)
    {
        if (currentPosition >= length || index < 0 || index >= length)
            return false;

        // moving element at pos to last and inserting val at pos
        // in every case because assignment if less expensive than condition checking
        arr[currentPosition] = arr[index];
        arr[index] = val;
        currentPosition++;
        return true;
    }

    /** Prints array to console */
    void print()
    {
        for (int i = 0; i < length; i++)
            cout << arr[i] << ", ";
        cout << "\n";
    }
};

int main()
{
    srand (0);
    // isArrayFilled checks are written in inserts methods rather than in main
    // to ensure reusablity of code and also calling some isArrayFilled method
    // from main in worst case required 2 function calls that is replaced by a
    // single insert function call

    OrderedList ol(10);
    for(int i = 0; i <= 11; i ++){
        ol.insert(rand() % 100 + 1);
    }
    ol.print();

    UnorderedList ul(10);
    for(int i = 0; i <= 11; i ++){
        ul.insert(rand() % 100 + 1);
    }
    ul.print();

    return 0;
}
