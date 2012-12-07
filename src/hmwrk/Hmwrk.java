/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hmwrk;

/**
 *
 * @author if4y
 */
public class Hmwrk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //first node
        Node myNode = new Node();
        myNode.setData("dataNode1");
        
        //second node
        Node myNode2 = new Node();
        myNode2.setData("dataNode2");
        
        //third node
        Node myNode3 = new Node();
        myNode3.setData("dataNode3");
        
        //fourth node
        Node myNode4 = new Node();
        myNode4.setData("dataNode4");
        
        //set myNode2 as nextNode of myNode
        myNode.setNextNode(myNode2);
        myNode2.setNextNode(myNode3);
        myNode3.setNextNode(myNode4);
        
        Node nodeIterator = new Node();
        // load iterator with next node
        nodeIterator = myNode;
       
        while(true)
        {
            System.out.println(nodeIterator.getData());
            nodeIterator = nodeIterator.getNextNode();
            if(!nodeIterator.hasNextNode())
            {
                //print last node from iterator and break cycle
                System.out.println(nodeIterator.getData());
                break;
            }
        }
    }
}
