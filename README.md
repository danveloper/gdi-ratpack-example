# GDI/Ratpack Example

## Introduction

This example demonstrates how to use [GDI](https://github.com/danveloper/gdi) with [Ratpack](https://github.com/tlberglund/ratpack-template) to create a really lightweight, flexible, awesome webservice in Groovy with powerful dependency injection.

## How it works

 * Services are injected into the `com.danveloper.gdi.examples.application.ServiceContainer` class using the static `injected` keyword (see [GDI](https://github.com/danveloper/gdi) for more details).
 * In the `app.groovy` script for Ratpack, a new instance of `ServiceContainer` is created to access the application's services.
 * This example demonstrates how to inject, and gain access to, a simple APIService from the Ratpack script's context.

## License

By `me`, Daniel Woods. Free-for-all. Contact me with any help or suggestions. g(daniel.p.woods@gmail.com) && t([@danveloper](http://twitter.com/danveloper))
