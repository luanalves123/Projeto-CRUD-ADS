
package univs.edu.usuario;

import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class UsuarioDAO {
   private Session sessao;
   private Transaction transacao;
   
   public void salvar(Usuario usuario){
       sessao = HibernateUtil.getSessionFactory().openSession();
       transacao = sessao.beginTransaction();
  sessao.save(usuario);
  transacao.commit();
  sessao.close();
   }
}
