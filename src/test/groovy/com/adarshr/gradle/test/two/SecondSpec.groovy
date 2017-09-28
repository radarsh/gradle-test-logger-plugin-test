package com.adarshr.gradle.test.two

import spock.lang.Specification

class SecondSpec extends Specification {

    def "happy path two"() {
        given:
            sleep 500
        expect:
            true
    }

    def "successful bit"() {
        given:
            sleep 500
        expect:
            true
    }

    def "another successful one"() {
        given:
            sleep 500
        expect:
            true
    }

    def "failing for no reason"() {
        given:
            sleep 200
        expect:
            false
    }
}
