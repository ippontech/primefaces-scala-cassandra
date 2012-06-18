package scalaprime.web

import javax.faces.bean.ManagedBean
import reflect.BeanProperty
import scalaprime.domain.User
import scalaprime.repository.UserRepository

@ManagedBean
class UserController extends Serializable {

  @BeanProperty
  var users: java.util.ArrayList[User] = UserRepository.getUsers()

}
