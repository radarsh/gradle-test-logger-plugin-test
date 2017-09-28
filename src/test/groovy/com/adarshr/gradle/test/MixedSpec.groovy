package com.adarshr.gradle.test

import spock.lang.Ignore
import spock.lang.Specification

class MixedSpec extends Specification {

    def "happy path"() {
        given:
            sleep 500
        expect:
            true
    }

    def "slow one"() {
        given:
            sleep 5000
        expect:
            true
    }

    @Ignore
    def "troublesome one"() {
        given:
            sleep 500
        expect:
            true
    }
}
