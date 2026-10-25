# Task 12.1: program that uses a Point object
from point import Point

# Remember that you'll need an import statement to access the class!
def main():
    p = Point(0.0, 0.0)
    p.x = 1.0
    p.y = 2.0

    q = Point(4.5, 7.0)
    origin = Point(0.0, 0.0)


    print(p.x)
    print(p.y)

    print(p.distance_to(origin))
    print(p.distance_to(q))

main()