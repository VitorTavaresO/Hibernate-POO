package service;
import dao.UserDao;
import dao.UserDaoImpl;
import java.util.List;
import model.User;

public class UserService {
    
    private static UserDao dao = new UserDaoImpl();

    public static List<User> buscarTodos(){
        return dao.buscarTodos();
    }

    public static User inserir(User user) {
        return dao.inserir(user);
    }
}
