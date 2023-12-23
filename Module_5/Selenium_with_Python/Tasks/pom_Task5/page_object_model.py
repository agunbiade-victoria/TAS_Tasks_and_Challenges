import time
from TestAutomationPage import TestAutomationPage
from SwitchToSoftwarePage import SwitchToSoftwarePage
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager


def main():
    driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
    automation_page = TestAutomationPage(driver)
    print(automation_page.enrol_now_link, automation_page.course_link)
    automation_page.click()
    time.sleep(10)


if __name__ == '__main__':
    main()