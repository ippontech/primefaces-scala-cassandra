package fr.ippon.blog.primescala.web

import javax.faces.bean.ManagedBean
import reflect.BeanProperty
import fr.ippon.blog.primescala.domain.User
import fr.ippon.blog.primescala.repository.UserRepository

@ManagedBean
class UserController extends Serializable {

  @BeanProperty
  var users: java.util.ArrayList[User] = UserRepository.getUsers

}
