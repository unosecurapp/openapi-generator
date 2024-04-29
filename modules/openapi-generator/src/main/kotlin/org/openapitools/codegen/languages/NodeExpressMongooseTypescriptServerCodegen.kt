package org.openapitools.codegen.languages

import org.openapitools.codegen.*
import io.swagger.models.properties.ArrayProperty
import io.swagger.models.properties.MapProperty
import io.swagger.models.properties.Property
import io.swagger.models.parameters.Parameter
import java.io.File
import java.util.*
import org.apache.commons.lang3.StringUtils
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class NodeExpressMongooseTypescriptServerCodegen : DefaultCodegen(), CodegenConfig {
  companion object {
    const val PROJECT_NAME = "projectName"
  }

  private val LOGGER: Logger = LoggerFactory.getLogger(NodeExpressMongooseTypescriptServerCodegen::class.java)

  override fun getTag(): CodegenType {
    return CodegenType.SERVER
  }

  override fun getName(): String {
    return "node-express-mongoose-typescript"
  }

  override fun getHelp(): String {
    return "Generates a node-express-mongoose-typescript server."
  }

  init {
    outputFolder = "generated-code${File.separator}node-express-mongoose-typescript"
    modelTemplateFiles["model.mustache"] = ".ts"
    apiTemplateFiles["api.mustache"] = ".ts"
    embeddedTemplateDir = "node-express-mongoose-typescript"
    templateDir = "node-express-mongoose-typescript"
    apiPackage = "Apis"
    modelPackage = "Models"
    supportingFiles.add(SupportingFile("README.mustache", "", "README.md"))
    // TODO: Fill this out.
  }
}

