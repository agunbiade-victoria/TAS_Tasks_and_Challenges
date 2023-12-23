class User:
    __password = "Password"

    def get_password(self):
        return self.__password


class ActiveUser(User):

    def get_password(self):
        return "**********"


user = User()
print(user.get_password())

active_user = ActiveUser()
print(active_user.get_password())
