class Human:
    leg_count = 4
    name = "Unknown"
    gender = "Unknown"

    def get_gender(self):
        print("\n Human: {", self.name, ",", self.gender, "}")


class Man(Human):

    def __init__(self, name, gender):
        self.name = name
        self.gender = gender


class Woman(Human):
    name = "Janet"
    gender = "Female"


human = Human()
human.get_gender()

man = Man("James", "Male")
man.get_gender()

woman = Woman()
woman.get_gender()
