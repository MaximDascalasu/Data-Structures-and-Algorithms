
package dsacw;

import dsacw.BinaryTree.Node;
import static java.lang.Math.E;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jde
 * 
 * remember this class should implement the IADTMCQ interface
 * @param <Q>
 */
public abstract class MCQList<Q> implements IADTMCQ<Q> {    
      
   List<MCQ> questions;
  MCQList() {
       
        // put your constructor code here to initialise any class fields           
        questions= new LinkedList<>();
    }    

    
    //      
    @Override
    public void addMCQ(MCQ mcq){
    /*
     * ask(display) MCQ mcq on screen in an appropriate way
     */
    questions.add(new MCQ(12,1,"ion",true,"Question blabla"));
    }

   
    public void askMCQ(MCQ mcq){

    /*
     * search the collection looking for MCQ with identifier mcqId
     * @return the MCQ with that id if in the collection, null otherwise
     */
    Node<MCQ> tmp = head;
    while ( validAccess(tmp) ) {
    if (mcqId.equals(tmp.data)) {
    return true;
    }
   tmp = tmp.next;  
    }

    return false;
    }

    public  MCQ searchMCQ(int mcqId){

    /*
     * search the collection looking for MCQ with author name authorName
     * @return the MCQ with that authorName if in the data structure, null otherwise
     */
    }
    public  MCQ searchMCQ(String authorName){

    /*
     * Given a MCQ id make the MCQ with that id available for use or not
     */
    }
    /**
     *
     * @param mcqId
     * @param available
     */

    public  void makeMCQAvailable(int mcqId, boolean available){
        
    }

    /*
     * display all MCQ’s on screen in an appropriate form
     */
    public  void displayMCQList(){
        
    }

}
