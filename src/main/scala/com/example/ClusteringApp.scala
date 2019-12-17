package com.example

import akka.actor.typed.ActorSystem
import com.typesafe.config.ConfigFactory

object ClusteringApp extends App {
  val config = ConfigFactory.load()
  val clusterName = config.getString("clustering.cluster.name")

  val system = ActorSystem(ClusterListener(), clusterName)
}
