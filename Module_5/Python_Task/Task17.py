class Human:
    name = "Princess"
    group = "Female"

    def get_name_group(self):
        return self.name + ":" + self.group


Princess = Human()
print(Princess.name, Princess.group, Princess.get_name_group())
