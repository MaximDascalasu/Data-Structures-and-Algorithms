
package dsacw;
/**
 *
 * @author jde
 */
public class MCQ  {
    private int mcqId;
    private int type;
    private String authorName;
    private boolean available;
    private String question;
    
   
    public MCQ() {
        // put your constructor code here to initialise any class fields           
    this.mcqId=0;

    }
    
    public MCQ(int mcqId,int type,String authorName,boolean available,String question) {
        // put your constructor code here to initialise any class fields           
    this.mcqId=mcqId;
    this.type =type ;
    this.authorName =authorName;
    this.available = available;
    this.question = question;
            
    }

  
        
    // you need some class fields so put them here
   public int getmcqId(){
       return this.mcqId;
   }
       
    public int getType(){
    return this.type;
    }
    public void setType(int type){
    this.type=type;
    }
    
    public String getAuthorName(){
    return this.authorName;
    }
    public void setAuthorName(String authorName){
    this.authorName=authorName;
    }
    
    public boolean getAvailable(){
    return this.available;
    }
    
    public void setAvailable (boolean available){
    this.available=available;
    }
        
    public String getQuestion(){
    return this.question;
    }        
    
    public void SetQuestion(String question){
     this.question=question;
    }
 @Override
    public String toString() {
        return "\nId: " + this.mcqId + "\n"+
                " Type: " + this.type + "\n"+
                " Author Name: " + this.authorName + "\n"+
                " Available: " + this.available + "\n"+
                " Question: " + this.question+ "\n";
                
    }
}
  