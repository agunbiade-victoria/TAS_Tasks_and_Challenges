#  Create a function that converts any string value to a Sentence case,
#  Then  write  a  unit  test  that  checks  the function's correctness.

def convert_string_to_sentence(my_string):
    return my_string.title()


sentence_case = convert_string_to_sentence("this is a python course for beginners.")
print("Sentence Case:", sentence_case)
