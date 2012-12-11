package utils

import models.{Module, Organization, User}
import play.api.Play

object ModuleManager {

  // get the modules this user has access to
  def userModules(organization: Organization, user: User): Seq[Module] = {
    globalModules.filter { module =>
      // filter out any modules the organization doesn't have access to
      organization.modules.contains(module.id)
    }.filter { module =>
      // filter out any modules the user doesn't have access to
      user.modules.contains(module.id)
    }
  }

  // filter out any globally disabled modules
  def globalModules: Seq[Module] = {
    DemoData.modules.filterNot { module =>
      Play.current.configuration.getString("modularui." + module.id).getOrElse("enabled").equalsIgnoreCase("disabled")
    }
  }
  
}
