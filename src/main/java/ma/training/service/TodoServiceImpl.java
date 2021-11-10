package ma.training.service;

import ma.training.dao.TodoRepository;
import ma.training.model.TodoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService{

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public void create(TodoModel model) {
       this.todoRepository.create(model);
    }

    @Override
    public void delete(int id) {
        this.todoRepository.delete(id);
    }

    @Override
    public void update(TodoModel model, int id) {

        this.todoRepository.update(model,id);

    }

    @Override
    public TodoModel getModel(int id) {
        return todoRepository.getModel(id);
    }

    @Override
    public String getServiceName()
    {
        return "My first ma.training.service with Spring ";
    }


}
