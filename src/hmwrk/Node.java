/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hmwrk;

/**
 *
 * @author if4y
 */
public class Node {
    
    private Node nextNode;
    private String data;

    public Node() {
        data = "";
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getNextNode() {
        return nextNode;
    }
    
    public boolean hasNextNode(){
        if(nextNode != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
