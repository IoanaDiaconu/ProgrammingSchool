package idea;


public class Idea {
    private long id;
    private String title;
    private String description;
    private int upVote;
    private int downVote;

    public Idea(long id, String title, String description, int upVote, int downVote) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.upVote = upVote;
        this.downVote = downVote;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getUpVote() {
        return upVote;
    }

    public int getDownVote() {
        return downVote;
    }
}
