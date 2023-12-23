import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager


def element_attributes(element):
    print("ID:", element.get_attribute("id"))
    print("Class:", element.get_attribute("class"))
    print("Style:", element.get_attribute("style"))
    print("Inner Text:", element.get_attribute("innerText"))
    print("Inner HTML:", element.get_attribute("innerHTML"))


def main():
    driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
    driver.maximize_window()
    driver.get("https://academy.testifyltd.com/")
    copyright_link = driver.find_element(By.XPATH, '//*[@id="__next"]/section/div/div[2]/div[2]')
    element_attributes(copyright_link)
    print("Copyright link:", copyright_link.text)


if __name__ == "__main__":
    main()
