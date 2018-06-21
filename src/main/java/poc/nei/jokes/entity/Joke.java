package poc.nei.jokes.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_JOKE")
public class Joke {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "joke", nullable = false)
    private String question;

    @Column(name = "answer", nullable = false)
    private String answer;

    public Joke(String name, String question, String answer) {
        this.name = name;
        this.question = question;
        this.answer = answer;
    }

    public Joke() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
