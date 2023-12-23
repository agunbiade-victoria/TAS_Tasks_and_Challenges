
from selenium.webdriver.common.by import By


class TestAutomationPage:

    def __init__(self, driver):
        driver.get("https://academy.testifyltd.com/courses/test-automation-simplified")
        self.enrol_now_link = driver.find_element(By.XPATH, '//*[@id="__next"]/main/section[1]/div/div/div[1]/div/button/span[1]')
        self.course_link = driver.find_element(By.XPATH, '//*[@id="__next"]/main/section[1]/header/div/div/div[2]/button')
        self.success_stories_link = driver.find_element(By.XPATH, '//*[@id="__next"]/main/section[1]/header/div/div/div[2]/a')

