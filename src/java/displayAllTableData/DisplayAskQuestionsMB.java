package displayAllTableData;

import dao.ListDAO;
import entity.AskQuestion;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DisplayAskQuestionsMB {
    AskQuestion askQues = new AskQuestion();

    public AskQuestion getAskQues() {
        return askQues;
    }

    public void setAskQues(AskQuestion askQues) {
        this.askQues = askQues;
    }
    
    public List<AskQuestion> getAllAskQues(){      
       List<AskQuestion> qlist= new ListDAO().allAskQuesList();
        return qlist;  
    }
    
}
