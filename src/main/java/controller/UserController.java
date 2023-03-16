package controller;
import java.util.List;

import service.UserService;
import model.User;

public class UserController {
    public List<User> listarTodosUsers(){
        return UserService.buscarTodos();
    }

    public User inserirUser(User user){
        return UserService.inserir(user);
    }
}
