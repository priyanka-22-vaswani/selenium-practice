[![Tests](https://github.com/priyanka-22-vaswani/selenium-practice/actions/workflows/tests.yml/badge.svg)](https://github.com/priyanka-22-vaswani/selenium-practice/actions/workflows/tests.yml)

# Selenium Test Automation Framework

A Java test automation framework that covers UI tests (Selenium) and API tests (REST Assured). It uses the Page Object Model, runs in headless Chrome, executes tests in parallel, and runs automatically on every push through GitHub Actions.

## Tech stack

Java 17 · Selenium 4 · TestNG · REST Assured · Allure · Maven · GitHub Actions

## What's in the framework

- **Page Object Model:** page classes hold locators and actions, and tests only describe behaviour.
- **Thread-safe driver management:** a `ThreadLocal` WebDriver factory gives each test its own browser, which makes parallel runs safe.
- **Configuration:** browser, headless mode and base URL live in `config.properties` and can be overridden from the command line.
- **Explicit waits** in the page objects to keep UI tests stable.
- **Data-driven tests** using TestNG data providers.
- **API tests** with REST Assured for PUT, PATCH, DELETE and GET requests.
- **Parallel execution** with TestNG (3 threads).
- **Allure reporting** with step-level annotations.
- **CI:** a GitHub Actions workflow runs the full suite in headless Chrome on every push and pull request, and saves the test reports.

## Project structure

```
src/test/java/com/practice/
├── base/        BaseTest (browser setup and teardown)
├── factory/     DriverFactory (ThreadLocal WebDriver)
├── pages/       LoginPage (page object)
├── tests/       LoginPOMTest (UI tests)
├── utils/       ConfigReader (reads config.properties)
└── ...          API tests and wait/stale-element tests
src/test/resources/
├── config.properties
└── allure.properties
.github/workflows/tests.yml
practice-exercises/   (early learning exercises, not part of the framework)
```

## How to run

Run the full suite:

```
mvn clean test
```

Run in headless mode (no browser window):

```
mvn clean test -Dheadless=true
```

Point the suite at a different environment:

```
mvn clean test -DbaseUrl=https://your-environment.example.com
```

## Reports

After a run, open the Allure report in your browser:

```
mvn allure:serve
```

On GitHub, each workflow run also saves the TestNG reports as downloadable artifacts.

## Test targets

UI tests run against [the-internet.herokuapp.com](https://the-internet.herokuapp.com), a public practice site. API tests run against public demo APIs.