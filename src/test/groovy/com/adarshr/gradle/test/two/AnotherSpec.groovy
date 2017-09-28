package com.adarshr.gradle.test.two

import spock.lang.Specification

class AnotherSpec extends Specification {

    def "should be true"() {
        given:
            sleep 500
        expect:
            true
    }

    def "should not be false"() {
        given:
            sleep 500
        expect:
            true
    }

    def "should equal to five"() {
        given:
            sleep 500
        expect:
            5 == 2 + 3
    }
}
