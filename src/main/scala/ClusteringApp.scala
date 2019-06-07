package com.example

import akka.actor._

object ClusteringApp extends App {
   import ClusteringConfig._

   implicit val system = ActorSystem(clusterName)

   val clusterListener = system.actorOf(Props[ClusterListener], name = "clusterListener")

  sys.addShutdownHook(system.terminate())
}
