import com.beust.kobalt.*
import com.beust.kobalt.plugin.packaging.*
import com.beust.kobalt.plugin.application.*
import com.beust.kobalt.plugin.kotlin.*

val bs = buildScript {
    repos()
}

val p = project {

    name = "issue390"
    group = "com.example"
    artifactId = name
    version = "0.1"

    dependencies {
        provided("org.hamcrest:hamcrest-core:1.3")
    }

    assemble {
        jar {
        }
    }

}
