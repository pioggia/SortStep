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
    int flag, num;
    for(int i = 0; i<list.length-1; i++)
    {
      flag = i;
      for(int a = i + 1; a<list.length; a++)
      {
        if(list[a]<list[flag])
        {
          flag = a;
        }
      }
      num = list[i];
      list[i] = list[flag];
      list[flag] = num;
    }
  }

  public void insertionSort(int[] list)
  {
    for(int outer = 1; outer<list.length; outer++)
    {
      int p = outer;
      int num = list[p];
      while(p>0 && list[p-1]>num)
      {
        list[p] = list[p-1];
        p--;
      }
      list[p] = num;
    }
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

