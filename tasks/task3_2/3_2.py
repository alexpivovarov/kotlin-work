import sys

if len(sys.argv) != 2:
    print("Error: integer required on command line")
    sys.exit(1)

number = float(sys.argv[1])
print(number * number)