package fr.ippon.blog.primescala.domain

import reflect.BeanProperty

case class User(@BeanProperty var login: String,
                @BeanProperty var username: String,
                @BeanProperty var domain: String,
                @BeanProperty var firstName: String,
                @BeanProperty var lastName: String) {

}
