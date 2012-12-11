package utils

import models.{User, Module, Organization}

object DemoData {
  
  val modules = Seq(
    Module("ims", "Inventory Management", views.html.modules.ims),
    Module("css", "Customer Service", views.html.modules.css),
    Module("ams", "Account Management", views.html.modules.ams),
    Module("aps", "Accounts Payable", views.html.modules.aps)
  )
  
  val organizations = Seq(
    Organization(0, "Widget Co", Seq("ims", "css", "ams", "aps"), Seq(
      User(0, "John Doe", Seq("ims", "ams")),
      User(1, "Super Fred", Seq("ims", "css", "ams", "aps")),
      User(2, "Just Joe", Seq("ims"))
    )),
    Organization(1, "Acme, Inc.", Seq("ims", "ams", "aps"), Seq(
      User(0, "Jane Doe", Seq("ims", "ams")),
      User(1, "Cool Fred", Seq("ims", "css", "ams", "aps")),
      User(2, "Just Sue", Seq("ims"))
    ))
  )
  
}
