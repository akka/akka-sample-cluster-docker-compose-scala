package com.example

import akka.actor._
import akka.cluster.Cluster
import akka.cluster.ClusterEvent._

object ClusteringApp extends App {
   import ClusteringConfig._

   implicit val system = ActorSystem(clusterName)

   val clusterListener = system.actorOf(Props[ClusterListener], name = "clusterListener")

  sys.addShutdownHook(system.terminate())
}
