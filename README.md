# Custom Naming Convention Lint Rules

## Introduction
This repository contains a set of custom lint rules specifically tailored to enforce naming conventions within Java and Kotlin codebases. The main purpose of these rules is to ensure that class names in Android applications follow a predefined format, thus maintaining consistency and readability across the code.

## Why This Repository?
Through the article accompanying this repository, we delve into the essentials of linting and understand how third-party libraries execute these rules behind the scenes. By dissecting the mechanics of lint rules, we gain a deeper appreciation for code quality and the automation of coding standard enforcement.

### NamingRulesConventionDetector
This detector class extends from `Detector` and implements the `SourceCodeScanner` interface. It is responsible for scanning Java or Kotlin files and identifying classes that do not comply with the naming conventions.

### Issues Registration
Issues are defined in the `SourcesOfRules` class, which provides metadata about each rule, such as its ID, description, severity, and the implementation details.

### Issue Registry
The `XRegistiry` class extends from `IssueRegistry` and lists all issues that our custom lint tool will scan for. This setup is crucial for integrating with the Android lint framework.

## META-INF/services Integration
The integration with `META-INF/services` allows our custom lint rules to be discovered and used by the lint tool at runtime. This mechanism is part of the Java Service Provider Interface (SPI), which supports the discovery and loading of service providers.
