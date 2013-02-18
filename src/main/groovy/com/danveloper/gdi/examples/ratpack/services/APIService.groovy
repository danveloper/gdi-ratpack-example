package com.danveloper.gdi.examples.ratpack.services

import groovyx.gdi.registrar.InjectionScope

/**
 * User: ddcdwoods
 * Date: 2/18/13
 */
class APIService {
    static scope = InjectionScope.SINGLETON

    String getVersion() {
        "0.1.1"
    }
}
