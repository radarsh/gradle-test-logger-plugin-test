package com.adarshr.gradle.test.two

import spock.lang.Specification
import spock.lang.Unroll

class SpecialSpec extends Specification {

    def "product should be 25"() {
        given:
            sleep 500
        expect:
            5 * 5 == 25
    }

    def "should be less than 10"() {
        given:
            sleep 100
        expect:
            3 < 10
    }

    def "should fail"() {
        given:
            sleep 50
        expect:
            false
    }

    @Unroll
    def "sum of #a and #b should be #c"() {
        given:
            sleep 50
        expect:
            a + b == c
        where:
            a  | b  | c
            1  | 2  | 3
            12 | 33 | 45
            4  | 8  | 12
            3  | 9  | 12
            1  | 7  | 8
            5  | -1 | 4
    }
}
