package caliban

import scala.annotation.StaticAnnotation

object Annotations {
  case class GQLDescription(value: String) extends StaticAnnotation
}
