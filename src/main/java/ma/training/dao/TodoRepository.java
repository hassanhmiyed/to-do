package ma.training.dao;

import ma.training.model.TodoModel;
import org.springframework.stereotype.Repository;

import java.util.Map;

public interface TodoRepository {

    public void create(TodoModel model);
    public void delete(int id);
    public void update(TodoModel model,int id);
    public TodoModel getModel(int id);


    public Map<Long,TodoModel> getTodoModels();
}
