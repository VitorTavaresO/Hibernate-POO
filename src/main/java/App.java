import org.hibernate.Session;
import connection.HibernateUtil;
import view.UserView;
import controller.UserController;

public class App 
{
    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSession();
        UserView userView = new UserView();
        userView.inserirUser();
    }
}
