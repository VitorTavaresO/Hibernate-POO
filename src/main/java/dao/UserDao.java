package dao;
import java.util.List;
import model.User;

public interface UserDao {
    public List<User> buscarTodos();
    //public User buscarPorId(Integer id);
    public User inserir(User user);
    //public void atualizar(User user);
    //public void excluir(User user);
    
}
