package view;
import controller.UserController;
import java.util.Scanner;
import java.util.List;
import model.User;

public class UserView {
    UserController userController = new UserController();
    Scanner teclado = new Scanner(System.in);

    public void exibirUsers(){
        System.out.println("Listando todos os Users");
        System.out.println(userController.listarTodosUsers());
    }

    public void inserirUser(){
        System.out.println("Inserindo um User");
        User user = new User();
        System.out.println("Digite o nome do User");
        user.setUser(teclado.nextLine());
        System.out.println("Digite o email do User");
        user.setEmail(teclado.nextLine());
        System.out.println("Digite a senha do User");
        user.setPassword(teclado.nextLine());
        userController.inserirUser(user);
    }

}
