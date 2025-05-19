# 🔐 OrangeHRM Login Automation

This project automates the login and logout functionality of the [Orange HRM Demo Site](https://opensource-demo.orangehrmlive.com/) using **Selenium WebDriver** with **Java**.

---

## ✅ Features

- Launches Chrome browser
- Navigates to the Orange HRM login page
- Logs in using valid credentials (`Admin/admin123`)
- Verifies successful login by checking the Dashboard
- Logs out from the system
- Closes the browser

---

## 🛠️ Technology Stack

- **Language**: Java  
- **Automation Tool**: Selenium WebDriver  
- **Browser**: Google Chrome  
- **IDE**: Eclipse  

---

## 🚀 How to Run

1. Clone the repository or download the source code.
2. Open the project in your preferred IDE (e.g., IntelliJ or Eclipse).
3. Ensure ChromeDriver path is correctly set in the `System.setProperty()` line in `OrangeHRMLoginTest.java`:System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
