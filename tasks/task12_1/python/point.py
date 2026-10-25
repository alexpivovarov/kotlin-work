# Task 12.1: Point class
import math

class Point:
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

    def distance_to(self, other: "Point") -> float:
        return math.hypot(self.x - other.x, self.y - other.y)