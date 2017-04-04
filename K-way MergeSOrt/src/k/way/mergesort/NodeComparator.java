package k.way.mergesort;

import java.util.Comparator;
/*Implementation of Question 1: KwayMergeSort 
 * @author: rxk163530 : Rahul Kalra 
 * @author: axg151031 : Aruksha Grover 
 * @author: kxg162630 : Kavya Gupta
 * @author: dxv160430 : Deepan Verma 
 */
public class NodeComparator implements Comparator<Node> {
    public int compare(Node p, Node q)
    {
        return p.getData()-q.getData();
    }
    
}
