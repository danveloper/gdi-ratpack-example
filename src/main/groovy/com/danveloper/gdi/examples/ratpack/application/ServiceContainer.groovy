package com.danveloper.gdi.examples.ratpack.application

import com.danveloper.gdi.examples.ratpack.services.APIService
import groovyx.gdi.registrar.ObjectRegistrar

/**
 * User: ddcdwoods
 * Date: 2/18/13
 */
class ServiceContainer {
    static injected = [apiService: APIService]
}
