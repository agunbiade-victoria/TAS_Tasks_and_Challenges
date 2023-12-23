
class Human:

    leg_count = 4
    gender = "Unknown"

    def get_gender(self):
        print("\n Human:", self.gender)


class Man(Human):

    def __init__(self, gender):
        self.gender = gender


class Woman(Human):
    gender = "woman"


human = Human()
human.get_gender()

man = Man("man")
man.get_gender()

woman = Woman()
woman.get_gender()