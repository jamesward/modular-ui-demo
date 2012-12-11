package controllers

import play.api._
import play.api.mvc._
import utils.{ModuleManager, DemoData}

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index())
  }
  
  def app(organizationId: Int, userId: Int) = Action {
    val organization = DemoData.organizations(organizationId)
    val user = organization.users(userId)
    val modules = ModuleManager.userModules(organization, user)
    
    Ok(views.html.moduleManager(organization, user, modules))
  }
  
}