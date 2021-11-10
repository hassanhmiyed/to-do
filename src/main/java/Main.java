import ma.training.config.AppConfig;
import ma.training.model.TodoModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ma.training.service.TodoService;

public class Main {



    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        TodoService obj = (TodoService) context.getBean("demoService");

        TodoModel todoModel= new TodoModel("some description");

        obj.create(todoModel);
        System.out.println(obj.getModel(1).getDescription());


/*
        System.out.println( obj.getServiceName() );
*/




    }




}
