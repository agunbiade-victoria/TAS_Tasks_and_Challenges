import Challenge9
import unittest


def test_convert_to_upper_case():
    assert Challenge9.convert_to_upper_case("testify") == "TESTIFY"
    assert Challenge9.convert_to_upper_case("i have a dog") == "I HAVE A DOG"
    assert Challenge9.convert_to_upper_case("i serve a living god") == "I SERVE A LIVING GOD"
