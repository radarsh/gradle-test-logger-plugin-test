package com.adarshr.gradle.test

import spock.lang.Ignore
import spock.lang.Specification

class MixedSpec extends Specification {

    def "happy path"() {
        given:
            sleep 200
        expect:
            true
    }

    def "slow one"() {
        given:
            sleep 4000
        expect:
            true
    }

    @Ignore
    def "troublesome one"() {
        given:
            sleep 200
        expect:
            true
    }
}
