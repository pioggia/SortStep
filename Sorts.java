import java.util.*;

public class Sorts
{
  public void bubbleSort(int[] list)
  {
    for(int i = list.length-1; i>=0; i--)
    {
      for( int a = 1; a <=i; a++)
      {
        if(list[a-1] > list[a])
        {
          int b = list[a-1];
          list[a-1] = list[a];
          list[a] = b;
        }
      }
    }
  }

  public void selectionSort(int[] list)
  {
    for(int i = 0; i < list.length; i++)
    {
      
    }
  }

  public void insertionSort(int[] list)
  {
    //your code here
  }

  private void merge(int[] a, int first, int mid, int last)
  {
    //your code here
  }

  public void mergeSort(int[] a, int first, int last)
  {
    //your code here
  }
}

