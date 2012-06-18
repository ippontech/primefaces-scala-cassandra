package fr.ippon.blog.primescala.repository

import collection.JavaConversions._
import me.prettyprint.cassandra.service.{ThriftCluster, CassandraHostConfigurator}
import me.prettyprint.hector.api.factory.HFactory
import me.prettyprint.cassandra.model.CqlQuery
import me.prettyprint.cassandra.serializers.StringSerializer
import fr.ippon.blog.primescala.domain.User

/**
 * Access to the Cassandra User CF.
 */
object UserRepository {

  val keyspace = HFactory.createKeyspace("tatami",
    new ThriftCluster("Tatami cluster",
      new CassandraHostConfigurator("localhost")))

  def getUsers: java.util.ArrayList[User] = {
    val cqlQuery =
      new CqlQuery(keyspace, StringSerializer.get(), StringSerializer.get(), StringSerializer.get())
    cqlQuery.setQuery("SELECT * FROM User")
    val rows = cqlQuery.execute().get().getList
    val users = new java.util.ArrayList[User]()
    rows.foreach(row => {
      users.add(User(row.getKey,
        row.getColumnSlice.getColumnByName("username").getValue,
        row.getColumnSlice.getColumnByName("domain").getValue,
        row.getColumnSlice.getColumnByName("firstName").getValue,
        row.getColumnSlice.getColumnByName("lastName").getValue))
    })
    users
  }
}
