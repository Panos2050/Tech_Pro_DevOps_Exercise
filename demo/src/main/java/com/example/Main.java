package com.example;

// Playwright core interfaces
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Main {
    public static void main(String[] args) {

        // Create a Playwright instance (this starts Playwright)
        try (Playwright playwright = Playwright.create()) {

            // Get the Chromium browser engine (Playwright-managed Chromium)
            BrowserType chromium = playwright.chromium();

            // Launch the browser in visible mode (headless = false)
            Browser browser = chromium.launch(
                new BrowserType.LaunchOptions().setHeadless(false)
            );

            // Open a new browser tab (page)
            Page page = browser.newPage();

            // Navigate to the YouTube video URL
            page.navigate("https://www.youtube.com/watch?v=dQw4w9WgXcQ");

            // Click the "Reject all" button on the cookie consent popup
            // This removes the blocking dialog so the page can be interacted with
            page.locator("button:has-text('Reject all')").click();

            // Keep the browser open for a long time (for observation / learning)
            // 6 minutes
            page.waitForTimeout(100000);

            // Close the browser (cleanup)
            browser.close();
        }
    }
}
