# Selenium Practice Framework

[![Tests](https://github.com/priyanka-22-vaswani/selenium-practice/actions/workflows/tests.yml/badge.svg)](https://github.com/priyanka-22-vaswani/selenium-practice/actions/workflows/tests.yml)

## Overview

This project is a Selenium WebDriver automation framework built using Java, Selenium WebDriver, TestNG, and Maven. It demonstrates the Page Object Model (POM) design pattern and TestNG suite execution.

## Tech Stack

- Java 17
- Selenium WebDriver 4
- TestNG
- Maven
- VS Code

## Framework Structure

```
src
├── main
└── test
    └── java
        └── com.practice
            ├── LoginPage
            ├── CheckboxPage
            ├── LoginTest
            └── LoginFailTest
```

## Test Coverage

- Login success scenario
- Login failure scenario
- Explicit waits
- Dropdown handling
- Alerts
- Multiple windows/tabs
- Page Object Model (POM)
- TestNG suite execution using `testng.xml`

## How to Run

```bash
mvn test
```

## Author

Priyanka Vaswani