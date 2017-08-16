package com.workshop

import com.workshop.FunctionsComposition._
import org.specs2.mutable.Specification


class FunctionsCompositionTest extends Specification {
  "camelCase" should {
    "convert string to camleCase" in {
      camelCase("hello WORLD") must be_===("HelloWorld")
    }
  }


  private val epsilon = 0.01

  "addTaxThenDiscount" should {
    "apply the tax and discount first then shipping" in {
      calculatePriceThenShipping(100) must beCloseTo(106, epsilon)
    }
  }

  "doDiscountThenAddTax" should {
    "apply shipping cost first and then tax and discount" in {
      addShippingThenCalculatePrice(100) must beCloseTo(105.6, epsilon)
    }
  }
}