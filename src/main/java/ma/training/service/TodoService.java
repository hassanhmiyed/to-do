package ma.training.service;

import ma.training.model.TodoModel;
import org.springframework.stereotype.Service;

@Service
public interface TodoService {

    public void create(TodoModel model);
    public void delete(int id);
    public void update(TodoModel model,int id);
    public TodoModel getModel(int id);
    public String getServiceName();
}
