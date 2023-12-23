import compare_numbers
import unittest


class TestCompareNumbers(unittest.TestCase):

    def test_multiplication(self):
        self.assertEqual(compare_numbers.multiplication(3, 1), 3)
        self.assertEqual(compare_numbers.multiplication(20, 3), 60)
        self.assertEqual(compare_numbers.multiplication(-2, -1), 2)

    def test_division(self):
        self.assertEqual(compare_numbers.division(49, 7), 7)
        self.assertEqual(compare_numbers.division(50, 2), 25)


if __name__ == '__main__':
    unittest.main()
