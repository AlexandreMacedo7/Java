
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EntPost {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<EntComment> comments = new ArrayList<>();//Instanciação de lista do tipo comentario - pois haverao muitos comentarios

    public EntPost(){
    }
    //Construtor
    public EntPost(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<EntComment> getComments() {
        return comments;
    }
    //Em coleções se remove e se adiciona pelo add e remove
    public void addComent(EntComment comment){//Adiçaõ da Entidade comentario = comment
        comments.add(comment); //lista comments recebe comment;
    }
    public void removeComment(EntComment comment){//Remove da Entidade comentario = comment
        comments.remove(comment);//lista comments remove comment;
    }

    //toString

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content +"\n");
        sb.append("Comments: \n");
        for(EntComment c: comments){
            sb.append(c.getText() + "\n");
        }

        return sb.toString();
    }
}
