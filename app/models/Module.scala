package models

import play.api.templates.{Template0, Html}

case class Module(id: String, name: String, template: Template0[Html])
