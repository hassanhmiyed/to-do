package ma.training.dao;

import ma.training.model.TodoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

@Repository
public class TodoRepositoryImpl implements TodoRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(TodoModel model) {

        jdbcTemplate.update("INSERT INTO todo VALUES (?, ?)", model.getId(), model.getDescription());



    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(TodoModel model, int id) {

    }

    @Override
    public TodoModel getModel(int id) {

        String sql = "SELECT * FROM todo WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<TodoModel>() {
            @Override
            public TodoModel mapRow(ResultSet rs, int rowNum) throws SQLException {
                TodoModel model=new TodoModel();
                model.setDescription(rs.getString("description"));
                return model;
            }
        });
    }

    @Override
    public Map<Long, TodoModel> getTodoModels() {
        return null;
    }
}
