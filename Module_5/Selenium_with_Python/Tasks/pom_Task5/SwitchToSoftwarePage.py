from selenium.webdriver.common.by import By


class SwitchToSoftwarePage:

    def __init__(self, driver):
        driver.get("https://academy.testifyltd.com/courses/switch-to-software-testing")
        self.enrol_now_link = driver.find_element(By.XPATH, '//*[@id="__next"]/main/section[1]/div/div/div[1]/div/button')
        self.course_link = driver.find_element(By.XPATH, '//*[@id="__next"]/main/section[1]/header/div/div/div[2]/button')
        self.success_stories_link = driver.find_element(By.XPATH, '//*[@id="__next"]/main/section[1]/header/div/div/div[2]/a')