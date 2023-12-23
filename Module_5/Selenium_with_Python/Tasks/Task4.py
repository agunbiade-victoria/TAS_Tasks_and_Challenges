import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager


def send_keys_to_element(element, *keys):
    element.send_keys(keys)


def main():
    driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
    driver.get("https://www.facebook.com/ ")
    driver.maximize_window()
    send_keys_to_element(driver.find_element(By.NAME, "email"), "vikkysoft28@yahoo.com")
    time.sleep(2)
    send_keys_to_element(driver.find_element(By.NAME, "pass"), "stevesteph23")
    time.sleep(2)
    driver.find_element(By.NAME, "login").click()


if __name__ == "__main__":
    main()
