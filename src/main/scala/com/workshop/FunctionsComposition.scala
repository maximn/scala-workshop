package com.workshop

object FunctionsComposition {
  // Functions Composition
  val toLowerCase: String => String = _.toLowerCase
  val capitalizeWords: String => String =
    (value: String) => value.split(" ").map(word => word.take(1).toUpperCase + word.substring(1)).mkString(" ")
  val removeSpaces: String => String = _.replace(" ", "")

  val camelCase: (String) => String =
    toLowerCase
      .andThen(capitalizeWords)
      .andThen(removeSpaces)


  //Now your turn
  val price = 10

  def taxCalculatorFactory(taxPercentage: Int): Double => Double = _ * (1 + taxPercentage / 100d)

  def taxCalculatorFor(country: String): Double => Double = country match {
    case "IL" => taxCalculatorFactory(18)
    case "UA" => taxCalculatorFactory(20)
  }

  val applyTax: Double => Double = taxCalculatorFor("UA")
  val applyDiscount: Double => Double = _ * 0.8
  val applyShipping: Double => Double = _ + 10

  // use .andThen to create the function as a combination of existing functions
  val calculatePriceThenShipping: Double => Double = _ => ???

  // use .compose (opposite order of andThen). Note: Now we're using `def` for the function deceleration
  def addShippingThenCalculatePrice(price: Double): Double = ???
}