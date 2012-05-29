package org.timgroup.dojo

import io.Source

trait ReadFile {

  def readFile(fileName: String): scala.List[String] = Source.fromURL(getClass.getResource("/" + fileName)).getLines().toList
}
