import com.adarshr.gradle.testlogger.theme.ThemeType

plugins {
    id("groovy")
    id("com.adarshr.test-logger") version "1.7.1"
}

repositories {
    mavenCentral()
}

dependencies {
    compile("org.codehaus.groovy:groovy-all:2.4.+")
    testCompile("org.spockframework:spock-core:1.1-groovy-2.4")
}

testlogger {
    theme = ThemeType.STANDARD
    showCauses = true
}

