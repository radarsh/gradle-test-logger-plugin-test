package com.adarshr.gradle.test.two

import spock.lang.Specification

class YetAnotherSpec extends Specification {

    def "should have a very long name indeed"() {
        given:
            sleep 500
        expect:
            true
    }

    def "short one"() {
        given:
            sleep 500
        expect:
            true
    }

    def "sum should be seven"() {
        given:
            sleep 500
        expect:
            3 + 4 == 7
    }
}
