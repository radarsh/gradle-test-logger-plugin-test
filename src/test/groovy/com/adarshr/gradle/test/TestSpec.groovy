package com.adarshr.gradle.test

import spock.lang.Ignore
import spock.lang.Specification

class TestSpec extends Specification {

    def "test one"() {
        expect:
            true
    }

    def "test two"() {
        expect:
            true
    }

    @Ignore
    def "test three"() {
        expect:
            true
    }
}
