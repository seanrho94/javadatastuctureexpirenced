package lists.classes;

public class Book {
    private int isbnid;

    private String bookName;

    private String authorName;

    public Book(int isbnid, String bookName, String authorName) {
        this.isbnid = isbnid;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public void setIsbnid(int in){
        this.isbnid=in;
    }


    public void setBookName(String n){
        this.bookName=n;
    }
    public  void setAuthorName(String n){
        this.authorName=n;
    }
    public String getBookName(){
        return this.bookName;
    }
    public String getAuthorName(){
        return this.authorName;
    }

    public int getIsbnid(){
        return  isbnid;
    }

    @Override
    public String toString(){
        return "These is jinesh book store with following isbnid "+this.getIsbnid()+" with Book name "+this.getBookName()+"" +
                "with Author Name "+this.getAuthorName();
    }

}
