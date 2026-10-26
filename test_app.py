
from app import add_numbers

def test_add_numbers():
    assert add_numbers(10, 20) == 30
    assert add_numbers(5, 5) == 10
