# Playwright Java Demo – YouTube Automation

This repository contains a small exercise project demonstrating browser automation
using Playwright with Java.

The application:
- Launches a Chromium browser
- Navigates to a YouTube video
- Handles the cookie consent dialog
- Keeps the browser open for observation

---

## Tech Stack

- Java 21
- Maven
- Playwright for Java
- Chromium (Playwright-managed)

## Requirements

- Java 21 or newer
- Internet connection (required on first run)

If you don't have Java installed

## Linux 
sudo apt update
sudo apt install openjdk-21-jdk

## macOS

brew install openjdk@21

- Then add Java to your PATH

echo 'export PATH="/opt/homebrew/opt/openjdk@21/bin:$PATH"' >> ~/.zshrc
source ~/.zshrc

## Windows

Download Java 21 (JDK) from:
https://adoptium.net/

Run the installer
Make sure “Add Java to PATH” is checked during installation.

Playwright downloads browser binaries automatically on first execution.

---

## How to Run

From the project directory:

```bash
java -jar app.jar
