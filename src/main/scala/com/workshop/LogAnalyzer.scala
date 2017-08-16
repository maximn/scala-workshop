package com.workshop

import java.util.Locale

import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

import scala.io.Source

// define a case class that represents a log line

object LogAnalyzer extends App {
  //Read from the log file
  val log = Source.fromInputStream(getClass.getResourceAsStream("/access_log")).getLines()

  // map each line to a case class that represents it
  // Split? Regex?
  // How to parse the datetime?
  // DateTime.parse(dateTimeString,
  //                DateTimeFormat
  //                  .forPattern("dd/MMM/yyyy:HH:mm:ssZ")
  //                  .withLocale(Locale.US))
  val logLines = log.map { ??? }


  // how many web requests?
  // how many of each status code?
  // how many distinct IPs? Wait, did you use String for IP? Maybe use a case class that will validate?
  //   Maybe some lines are bad? We want to throw them away. (When parsing return Try/Option, use flatMap instead of map on the log lines)
  // Largest response size? What was the request for it? Average response size? Sum of all responses?
  // which url have most hits? How many hits?

  println("Use println for output")
}