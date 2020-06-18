package dsacw;

/**
 *
 * @author jde, March 2019
 * @param <Q>
 */
public interface IADTMCQ<Q> {
    /*
     * add MCQ mcq to collection 
     */
    public abstract void addMCQ(MCQ mcq);

    /*
     * ask(display) MCQ mcq on screen in an appropriate way
     */
    public abstract void askMCQ(MCQ mcq);

    /*
     * search the collection looking for MCQ with identifier mcqId
     * @return the MCQ with that id if in the collection, null otherwise
     */
    public abstract MCQ searchMCQ(int mcqId);

    /*
     * search the collection looking for MCQ with author name authorName
     * @return the MCQ with that authorName if in the data structure, null otherwise
     */
    public abstract MCQ searchMCQ(String authorName);

    /*
     * Given a MCQ id make the MCQ with that id available for use or not
     */

    /**
     *
     * @param mcqId
     * @param available
     */

    public abstract void makeMCQAvailable(int mcqId, boolean available);

    /*
     * display all MCQ’s on screen in an appropriate form
     */
    public abstract void displayMCQList();

}
