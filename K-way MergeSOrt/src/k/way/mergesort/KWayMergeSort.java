/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Implementation of Question 1: KwayMergeSort 
 * @author: rxk163530 : Rahul Kalra 
 * @author: axg151031 : Aruksha Grover 
 * @author: kxg162630 : Kavya Gupta
 * @author: dxv160430 : Deepan Verma 
 */
package k.way.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KWayMergeSort {

    PriorityQueue<Node> queue;
    
    public KWayMergeSort()
    {
        queue=new PriorityQueue<Node>(50, new NodeComparator());
    }
    
    public List mergeKWayList(List<List<Integer>> input)
    {
       List<Integer> output = new ArrayList<Integer>();
       if(input==null) //no input from the user
           return null;
       
       if(input.isEmpty())
       {
           return input;
       }
       int[] index = new int[input.size()];
       
       build(input,index);
       
       while(!queue.isEmpty())
       {
           Node node =queue.remove();
           int listIndex = node.getIndexList();
           output.add(node.getData());
           if(index[listIndex]<input.get(listIndex).size())
           {
               queue.add(new Node(input.get(listIndex).get(index[listIndex]),
						listIndex));
				index[listIndex] = ++index[listIndex];
           }
       }
       return output;
     }
    
    private void build(List<List<Integer>> input, int[] index) {
        for(int i=0;i<input.size();i++)
        {
            if(!input.get(i).isEmpty())
            {
                queue.add(new Node(input.get(i).get(0),i));
                index[i]=++index[i];
                
            }
            else
                input.remove(i);
        }
    }
    public static void main(String[] args) 
    {
        KWayMergeSort k= new KWayMergeSort();
        
        //First sorted list 
        List<Integer> inputA = new ArrayList<Integer>();
        inputA.add(2);
        inputA.add(7);
        inputA.add(8);
        
        
        //Second sorted list 
        List<Integer> inputB = new ArrayList<Integer>();
        inputB.add(3);
        inputB.add(4);
        inputB.add(6);
        inputA.add(9);
               
        //Third sorted list
        List<Integer> inputC = new ArrayList<Integer>();
        inputC.add(1);
        inputC.add(5);
        
       
        List<List<Integer>> input = new ArrayList<List<Integer>>();
    
        input.add(inputA);
        input.add(inputB);
        input.add(inputC);
        
        System.out.println("List" +k.mergeKWayList(input));
                
    }

} 

