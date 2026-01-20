# Playwright Java – YouTube Automation

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

If you do not have Java installed, follow the instructions below for your operating system.

## Linux 
```bash
sudo apt update
sudo apt install openjdk-21-jdk
```

## macOS
```bash
brew install openjdk@21
```
- Then add Java to your PATH
```bash
echo 'export PATH="/opt/homebrew/opt/openjdk@21/bin:$PATH"' >> ~/.zshrc
source ~/.zshrc
```
## Windows

Download Java 21 (JDK) from:
https://adoptium.net/

Run the installer
Make sure “Add Java to PATH” is checked during installation.

Verify installation:
```bash
java --version
```
Playwright downloads browser binaries automatically on first execution.

---

## How to Run

### 0. Clone the repository
```bash
git@github.com:Panos2050/Tech_Pro_DevOps_Exercise.git
```

From the project directory:

### 1. Build the project
Insde the directory demo/
```bash
mvn clean package
```
Then cd to target folder

### 2. Run the project
(The jar file name may differ depending on the version)
```bash
java -jar demo-1.0-SNAPSHOT.jar
