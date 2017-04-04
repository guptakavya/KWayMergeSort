/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k.way.mergesort;

/*Implementation of Question 1: KwayMergeSort 
 * @author: rxk163530 : Rahul Kalra 
 * @author: axg151031 : Aruksha Grover 
 * @author: kxg162630 : Kavya Gupta
 * @author: dxv160430 : Deepan Verma 
 */
class Node 
{
    Integer data;
    Integer fromIndex;
 
public Node(int data, int indexList)
{
    this.data=data;
    this.fromIndex=indexList;
}

public int getData()
{
    return data;
}

public void setData(int data)
{
    this.data=data;
   // return value;
}

public int getIndexList()
{
    return fromIndex;
}

public void setIndex(int indexList)
{
    this.fromIndex=indexList;
}
}
