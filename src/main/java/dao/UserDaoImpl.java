package dao;
import org.hibernate.Session;
import org.hibernate.query.Query;
import connection.HibernateUtil;
import java.util.List;
import model.User;

public class UserDaoImpl implements UserDao {

    private Session session;

    public UserDaoImpl() {
        this.session = HibernateUtil.getSession();
    }

    @Override
    public List<User> buscarTodos() {
        List<User> pessoas = null;
            session.beginTransaction();
            pessoas  = (List<User>) this.session.createQuery("from User").list();
            session.getTransaction().commit();
        return pessoas;
    }

    @Override
    public User inserir(User user) {
            session.beginTransaction();
            session.persist(user);
            session.getTransaction().commit();
        return user;
    }
/* 
    @Override
    public User buscarPorId(Integer id){
        User user = null;
        session.beginTransaction();
        user = (User) session.get(User.class, id);
        session.getTransaction().commit();
        return user;
    }

    @Override
    public User inserir(User user){
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        return user;
    }

    @Override
    public void atualizar(User user){
        session.merge(user);
    }

    @Override
    public void excluir(User user){
        session.remove(user);
    }*/
}
