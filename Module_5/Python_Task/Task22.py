class Hunt:
    __weapon = "Assault Riffle"

    def get_weapon(self):
        return "Hunt: " + self.__weapon


hunt = Hunt()
print(hunt.get_weapon())
